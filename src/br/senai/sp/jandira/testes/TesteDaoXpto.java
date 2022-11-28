package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.model.dao.PlanoDeSaudeDAO;

public class TesteDaoXpto {

	public static void main(String[] args) {
		TesteDAO.main(args);
		
		//PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		System.out.println(PlanoDeSaudeDAO.listarTodos().size());

	}

}
