package br.senai.sp.jandira.model;

public class PlanoDeSaude {
        private static Integer codigo = 100;
	private String operadora;
	private String tipoDoPlano;

	// Métodos de acesso

	// Contrutores da classe
	public PlanoDeSaude() {

	}

	public PlanoDeSaude(String operadora) {
		this.operadora = operadora;
	}

	public PlanoDeSaude(String operadora, String tipoDoPlano) {
		this.operadora = operadora;
		this.tipoDoPlano = tipoDoPlano;
		
	}
	// Metodos de acesso
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getOperadora() {
		return this.operadora;
	}

	public void setTipoDoPlano(String tipoDoPlano) {
		this.tipoDoPlano = tipoDoPlano;
	}

	public String getTipoDoPlano() {
		return this.tipoDoPlano;
	}

	public String getDadosDoPlano() {
		return "Plano: " + this.operadora + ", " + this.tipoDoPlano;

	}
        public Integer getCodigo(){
            return codigo;
        }
}
