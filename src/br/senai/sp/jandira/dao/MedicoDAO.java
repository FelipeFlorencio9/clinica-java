package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<Medico>();
    private static final String ARQUIVO = "C:\\Users\\22282108\\Documents\\NetBeansProjects\\clinica-java\\src\\br\\senai\\sp\\jandira\\repositorios\\medico.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282108\\Documents\\NetBeansProjects\\clinica-java\\src\\br\\senai\\sp\\jandira\\repositorios\\medico_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);
    
    public MedicoDAO() {

    }

    public MedicoDAO(Medico medico) {
        this.medico = medico;
    }
    public static void getListaDeMedicos() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);
 
            String linha = br.readLine();
            

            while(linha != null && !linha.isEmpty()){
                
                //Medico inteiro com Especialidade Junta
                String[] linhaVetor = linha.split(";");
          
                Medico novoMedico = new Medico(Integer.valueOf(linhaVetor[0]),linhaVetor[1]);
                novoMedico.setNome(linhaVetor[2]);
                if(linhaVetor[7] != null && !linha.isEmpty()){
                    String[] trechoDeEspecialidades = linhaVetor[7].split("%");
                } else {
                    novoMedico.setEspecialidades(null);
                }
                ArrayList<Especialidade> especialidadesDoMedico = linhaVetor[7].split("%");
                
                
                novoMedico.setEspecialidades(especialidadesDoNovoMedico);
                medicos.add(novoMedico);
                
                linha = br.readLine();
                
            }
            br.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao abrir o arquivo.",
                    "Erro de leitura",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public static DefaultTableModel getTableModel() {
        
        Object[][] dados = new Object[medicos.size()][3];

       
        int i = 0;
        for (Medico m : medicos) {
            dados[i][0] = m.getCodigoInterno();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
//          dados[i][3] = m.getEspecialidades();
            i++;
        }

        String[] titulos = {"Código", "CRM", "Nome do(a) Médico(a)", "Especialidades"};

        DefaultTableModel tableModelMedico = new DefaultTableModel(dados, titulos);

        return tableModelMedico;
    }
    
    public static boolean excluir(Integer codigo) {

        for (Medico m : medicos) {
            if (m.getCodigoInterno().equals(codigo)) {
                medicos.remove(m);
                break;
            }

        }
        
        //Reconstruir um arquivo atualizado, ou seja, 
        //sem o plano que foi removido
        
        //PASSO 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);
        
        try {
            //Criar o arquivo temporário
            arquivoTemp.createNewFile();
            
            //Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            //Iterar a lista para adicionar os planos no arquivo temporário
            for (Medico m :medicos){
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            //Fechar o arquivo temporário
            bwTemp.close();
            
            //Excluir o arquivo atual - plano_de_saude.txt
            arquivoAtual.delete();
            
            //Renomear o arquivo temporário para o nome do arquivo atual
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao criar o arquivo!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
        return false;
    }
}
