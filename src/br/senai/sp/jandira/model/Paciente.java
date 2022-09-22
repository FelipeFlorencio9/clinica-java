package br.senai.sp.jandira.model;

public class Paciente {

	// Atributos
	private String nome;
	private String email;
	private PlanoDeSaude planoDeSaude;
	private String rg;
	private String cpf;
	private String telefone;
	private Gênero genero;
	private String tipoSanguineo;
	private Endereço endereço;

	// Métodos de acesso
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Gênero getGenero() {
		return genero;
	}

	public void setGenero(Gênero genero) {
		this.genero = genero;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

}