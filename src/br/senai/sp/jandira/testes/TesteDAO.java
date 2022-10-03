package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDAO {

    public TesteDAO() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {

        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Expert");
        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
        PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");

        PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
        dao.gravar(plano1);
        dao.gravar(plano2);

        for (PlanoDeSaude plano : dao.listarTodos()) {
            System.out.println(plano.getOperadora());
        }

        PlanoDeSaudeDAO dao2 = new PlanoDeSaudeDAO();
        dao2.gravar(plano3);
        dao2.gravar(plano4);

        for (PlanoDeSaude plano : dao.listarTodos()) {
            System.out.println(plano.getOperadora());
        }
        
        int b[][] = new int[4][5];
        int a[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {0,11,12}
        };
        
    }

}
