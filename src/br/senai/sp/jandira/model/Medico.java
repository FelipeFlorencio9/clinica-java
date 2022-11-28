package br.senai.sp.jandira.model;

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
            ArrayList<String> especialidades) {

        super(nome, telefone, email, dataDeNascimento);
        this.codigo = codigo;
        this.crm = crm;
        this.especialidades = especialidades;
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setEmail(email);
        super.setDataDeNascimento(dataDeNascimento);
        
       
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

    public String getStringMedicoForPanel() {
        String medicoStr = this.codigo + ";" + this.crm + ";" + this.especialidades;
        return medicoStr;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    
    
    
    @Override
    public String getSeparadoPorPontoEVirgula(){
        String medicoStr = 
                this.codigo + ";" + 
                this.crm + ";" +
                super.getSeparadoPorPontoEVirgula() +
                this.especialidades.toString();
        return medicoStr;
    }
}
