
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public EspecialidadeDAO() {

    }
    
    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);

    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    public static void criarEspecialidadesDeTeste(){
            Especialidade e1 = new Especialidade("Cardiologia", "Cuida do coração");
            Especialidade e2 = new Especialidade("Gastroenterologia", "Cuida da digestão e relacionados.");
            Especialidade e3 = new Especialidade("Ginecologista", "Cuida da saúde da mulher regularmente como todo.");
            Especialidade e4 = new Especialidade("Neurologia", "Trata, estuda e cuida dos distúrbios estruturais do sistema nervoso.");
            Especialidade e5 = new Especialidade("Oftalmologista", "estuda e trata as doenças relacionadas ao olho, à refração e aos olhos e seus anexos");
            especialidades.add(e1);
            especialidades.add(e2);
            especialidades.add(e3);
            especialidades.add(e4);
            especialidades.add(e5);
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
    public static boolean excluir(Integer codigo){
            
             for(Especialidade e : especialidades){
                 if(e.getCodigo().equals(codigo)){
                 especialidades.remove(e);
                 return true;
                 }
                
             }
            return false;
        }
    public static Especialidade getEspecialidade(Integer codigo){
            
            for(Especialidade e : especialidades){
                if(e.getCodigo().equals(codigo)){
                return e;    
                }
            }
            
            return null;
        }
    public static void atualizar(Especialidade especialidade){
            for(Especialidade e : especialidades){
                if(e.getCodigo().equals(especialidade.getCodigo())){
                   especialidades.set(especialidades.indexOf(e), especialidade);
                   break;
                }
            }
            
        }
}
