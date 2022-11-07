package br.senai.sp.jandira.model;

import java.util.ArrayList;



public class Medico extends Pessoa{
    
    
	private String crm;
	private ArrayList<Especialidade> especialidades;
        
        public Medico(){
           
        }
	public ArrayList<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(ArrayList<Especialidade> especialidades) {
		
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
        
        @Override
        public void cumprimentar(){
            System.out.printf("Olá, eu sou o Médico %s, tudo bem?\n", super.getNome());
        }
}
