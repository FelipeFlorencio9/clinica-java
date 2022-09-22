package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;

public class PlanoDeSaudeDAO {
	
	private PlanoDeSaude planoDeSaude;
	private ArrayList<PlanoDeSaude> planos = new ArrayList<>();
	
	//Construtor 
	
	public PlanoDeSaudeDAO(){
		
	}
	
	public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude){
		this.planoDeSaude = planoDeSaude;
	}
	
	public void gravar(PlanoDeSaude planoDeSaude) {
		planos.add(planoDeSaude);
		
	}
	
	public ArrayList<PlanoDeSaude> listarTodos(){
		return planos;
	}
	
}
