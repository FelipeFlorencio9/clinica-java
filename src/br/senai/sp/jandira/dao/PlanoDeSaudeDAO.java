package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;

public class PlanoDeSaudeDAO { //simular nosso banco de dados

	private PlanoDeSaude planoDeSaude;
	private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

	// Construtor

	public PlanoDeSaudeDAO() {

	}

	public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
		this.setPlanoDeSaude(planoDeSaude);
	}

	public void gravar(PlanoDeSaude planoDeSaude) {
		planos.add(planoDeSaude);

	}

	public static ArrayList<PlanoDeSaude> listarTodos() {
		return planos;
	}

	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

}
