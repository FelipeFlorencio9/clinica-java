package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.table.DefaultTableModel;

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
        
        public static void criarPlanosDeSaudeTeste(){
            PlanoDeSaude p1 = new PlanoDeSaude("Unimed", "Bronze");
            PlanoDeSaude p2 = new PlanoDeSaude("Unimed", "Ouro");
            PlanoDeSaude p3 = new PlanoDeSaude("Amil", "Advanced");
            PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Exclusive");
            planos.add(p1);
            planos.add(p2);
            planos.add(p3);
            planos.add(p4);
        };
        
        public static DefaultTableModel getTableModel(){
            //Matriz que receberá os planos de saúde que serão utilizados na Tabela JTable
            Object[][] dados = new Object[planos.size()][3];
            
            //For Each para extrair cada objeto plano de saúde do array list planos e separar cada dado na matriz dados;
            int i = 0;
            for (PlanoDeSaude p: planos){
                dados[i][0] = p.getCodigo();
                dados[i][1] = p.getOperadora();
                dados[i][2] = p.getTipoDoPlano();
                i++;
            }
            // Definir um nome com as colunas da tabela
            String[] titulos = {"Código", "Nome da operadora", "Tipo do plano"};
            
            //Criar o modelo que será utilizado pela JTable
            //para exibir os dados dos planos
            DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
            
            return tableModel;
        };

}
