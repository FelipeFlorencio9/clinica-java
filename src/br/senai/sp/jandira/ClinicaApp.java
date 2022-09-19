package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereço;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Gênero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {

		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		System.out.println(especialidade.getNome());

		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.setTipoDoPlano("Bronze");

		JOptionPane.showMessageDialog(null, plano.getDadosDoPlano());

		PlanoDeSaude planoBradesco = new PlanoDeSaude();
		planoBradesco.setOperadora("Bradesco");
		planoBradesco.setTipoDoPlano("Ouro");
		System.out.println(planoBradesco.getTipoDoPlano());

		JOptionPane.showMessageDialog(null, planoBradesco.getOperadora());

		System.out.println(planoBradesco.getDadosDoPlano());

		Endereço endereçop1 = new Endereço();
		endereçop1.setBairro("Best Stai");
		endereçop1.setCep("13456456-73");
		endereçop1.setCidade("Brooklyn");
		endereçop1.setComplemento("AP12");
		endereçop1.setEstado(Estados.SAO_PAULO);
		endereçop1.setLogradouro("Rua do Julius");
		endereçop1.setNúmero("222");
		endereçop1.setPontoDeReferência("Esquina do carinha que mora logo ali.");
		endereçop1.setTipo("Apartamento");

		Paciente paciente = new Paciente();
		paciente.setNome("Pedro da Silva");
		paciente.setEmail("pedro@uol.com.br");
		paciente.setTelefone("913730499");
		paciente.setCpf("123.456.789-00");
		paciente.setRg("123-456-246-45");
		paciente.setGenero(Gênero.FEMININO);
		paciente.setTipoSanguineo("O++");
		paciente.setPlanoDeSaude(plano);
		paciente.setEndereço(endereçop1);

		Paciente pacientePatricia = new Paciente();
		pacientePatricia.setNome("Patrícia Abravanel");
		// Criar uma especialidade médica

		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologista");

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínica Geral");

		// Criar um médico
		Medico medico1 = new Medico();
		medico1.setNome("Roberto Pereira");
		medico1.setCrm("4562-9");
		medico1.setDataDeNascimento(LocalDate.of(1990, 6, 8));
		
		
		// Criar a lista de especialidadres do doutor Roberto
		Especialidade[] especialidadesMedico1 = { especialidade1, especialidade3 };

		medico1.setEspecialidades(especialidadesMedico1);

		System.out.println(paciente.getPlanoDeSaude().getOperadora());
		JOptionPane.showMessageDialog(null, paciente.getEndereço().getEndereçoCompleto());

		Medico medico2 = new Medico();
		medico2.setNome("Fabiana Gomes");
		medico2.setCrm("3214-5");
		medico2.setSexo("Feminino");
		medico2.setDataDeNascimento(LocalDate.of(1984, 11, 27));

		Especialidade[] especialidadesMedico2 = { especialidade2 };
		medico2.setEspecialidades(especialidadesMedico2);

		// Criar uma agenda
		// A Paciente Patricia ligou na clinica para agendar uma consulta
		// com um clinico geral para dia 22/09/2022 ás 14:20;

		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(pacientePatricia);
		agenda1.setEspecialidade(especialidade3);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(14, 20));
		// agenda1.setMedico(especialidade3.getNome());
		agenda1.setMedico(medico1);
		agenda1.setObservacoes("Nada a observar.");
		agenda1.setCompareceu(false);

		// **Imprimir dados do agendamento
		// Nome do paciente:
		// Nome do médico:
		// Especialidade
		// Dia e hora da consulta.

		System.out.println("Nome do Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Nome do Médico: " + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Dia e hora: " + agenda1.getDataDaConsulta() + " . " + agenda1.getHoraDaConsulta());
		System.out.println("Plano de Saúde: " + agenda1.getPaciente().getPlanoDeSaude().getDadosDoPlano());

	}

}
