package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Medico extends Pessoa {

    private static int contador = 000;
    private Integer codigo;
    private String crm;
    private ArrayList<String> especialidades = new ArrayList<>();

    public Medico() {
        atualizarCodigo();
    }

    public Medico(Integer codigo, String crm) {
        this.codigo = codigo;
        this.crm = crm;

    }

    public Medico(
            Integer codigo,
            String crm,
            String nome,
            String telefone,
            String email,
            String dataDeNascimento,
            String especialidades) {

        super(nome, telefone, email, dataDeNascimento);
        this.codigo = codigo;
        this.crm = crm;
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setEmail(email);
        super.setDataDeNascimento(dataDeNascimento);
            
        if (especialidades != null) {
            String[] novasEspecialidades = especialidades.split("%");
            this.especialidades.addAll(Arrays.asList(novasEspecialidades));
        } else {
            this.especialidades = null;
        }
       
    }

    public Integer getCodigo() {
        return codigo;
    }

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public void cumprimentar() {
        System.out.printf("Olá, eu sou o Médico %s, tudo bem?\n", super.getNome());
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        String medicoStr = this.codigo + ";" + this.crm + ";" + this.especialidades;
        return medicoStr;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public String getEspecialidadesComoTextoUnico() {
        String especialidadesStr = this.especialidades.toString();
        return especialidadesStr;
    }
}
