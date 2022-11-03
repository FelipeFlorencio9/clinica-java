package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    private final static String ARQUIVO = "C:\\Users\\22282108\\java-file\\especialidade.txt";
    private final static Path PATH = Paths.get(ARQUIVO);

    //ARQUIVO é o caminho e o PATH é o caminho convertido
    public EspecialidadeDAO() {

    }

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
        
        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            String novaEspecialidade = especialidade.getEspecialidadeSeparadoPorPontoEVirgula();
            
            bw.write(novaEspecialidade);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao gravar.\n\n Entre em contato com o suporte.",
                    "Erro ao gravar.",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public static void getListaDeEspecialidades() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);
 
            String linha = br.readLine();
            

            while(linha != null && !linha.isEmpty()){

                String[] linhaVetor = linha.split(";");
                
                Especialidade novaEspecialidade = new Especialidade(
                        Integer.valueOf(linhaVetor[0]),
                         linhaVetor[1],
                         linhaVetor[2]);

                especialidades.add(novaEspecialidade);
 
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

        Object[][] dados = new Object[especialidades.size()][3];

        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }

        String[] titulos = {"Código", "Nome da Especialidade", "Descrição"};

        DefaultTableModel tableModelEspecialidade = new DefaultTableModel(dados, titulos);

        return tableModelEspecialidade;
    }

    public static boolean excluir(Integer codigo) {

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                return true;
            }

        }
        return false;
    }

    public static Especialidade getEspecialidade(Integer codigo) {

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }

        return null;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
        }

    }
}
