package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.model.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.entity.Especialidade;
import br.senai.sp.jandira.model.entity.Medico;
import java.util.ArrayList;

public class TesteEspecialidadeDAOComponentes {
    public static void main(String[] args) {

        //Testando classe Especialidade
        System.out.println("LISTA MANUAL");
        System.out.println("----------------------");
        
        Especialidade e = new Especialidade("Cardiologia", "Cuida do coração.(físico!)");
        System.out.println(e.getNome());
        System.out.println(e.getDescricao());
        System.out.println(e.getCodigo());
        System.out.println("------------------------");
        
        Especialidade e2 = new Especialidade("Pedagogia", "Cuida das criança.");
        System.out.println(e2.getNome());
        System.out.println(e2.getDescricao());
        System.out.println(e2.getCodigo());
        System.out.println("------------------------");
        
        Especialidade e3 = new Especialidade("Neurologia", "Cuida dos neurônio.");
        System.out.println(e3.getNome());
        System.out.println(e3.getDescricao());
        System.out.println(e3.getCodigo());
        
        System.out.println("");
        System.out.println("ACESSO DO ARRAY LIST PELO FOR");
        System.out.println("----------------------");
        
        //Testando Gravar sem instanciar a classe
        EspecialidadeDAO.gravar(e); 
        EspecialidadeDAO.gravar(e2); 
        EspecialidadeDAO.gravar(e3);
        
        //Testando ArrayList do Especialidade DAO junto com os objetos dentro delas
        for (Especialidade especialidade : EspecialidadeDAO.listarTodos()) {
            System.out.println(especialidade.getNome());
            System.out.println(especialidade.getDescricao());
            System.out.println(especialidade.getCodigo());
        }
        
        //Testando indice no ARRAYLIST por índice
        System.out.println("ÌNDICES DO OBJETO");
        System.out.println("");
        
        int i = EspecialidadeDAO.listarTodos().indexOf(e2);
        System.out.println(i);
        System.out.println("");
        
        i = EspecialidadeDAO.listarTodos().indexOf(e3);
        System.out.println(i);
        System.out.println("");
        
        i = EspecialidadeDAO.listarTodos().indexOf(e);
        System.out.println(i);
        System.out.println(""); 
                
        EspecialidadeDAO.gravar(e2);
        ArrayList<Especialidade> especialidadesDoMedico = new ArrayList<>();
        especialidadesDoMedico.add(e);
       especialidadesDoMedico.add(e2);
//        especialidadesDoMedico.add(e3);
        Medico as = new Medico(45, "teste");
        as.setEspecialidades(especialidadesDoMedico);
        System.out.println(as.getEspecialidades().get(0).getNome() + ";" + as.getEspecialidades().get(1).getNome());
        
        for(Especialidade a : especialidadesDoMedico){
            System.out.printf(a.getNome() + "; ");
            System.out.println("LINE");
        }
        String item = "";
        int tamanho = especialidadesDoMedico.size();
        if(tamanho == 1){
              item = especialidadesDoMedico.get(0).getNome() + ".";
        }
        System.out.println(item);
//        for(Especialidade ghj : especialidadesDoMedico){
//            if(tamanho == 1){
//              
//                break;
//            } else if (tamanho == 2){
//                item = item.concat(" e " + ghj.getNome());
//            }
//           
//            System.out.println(item);
//            System.out.println("LINE");
//        }
         item = item.replaceFirst("e", "");
         System.out.println(item);
    }
}
