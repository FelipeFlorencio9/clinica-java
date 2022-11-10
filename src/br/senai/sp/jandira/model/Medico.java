package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private static int contador = 000;
    private Integer codigoInterno;
    private String crm;
    private ArrayList<Especialidade> especialidades;

    public Medico(){
        atualizarCodigo();
    }
    
    public Medico(Integer codigoInterno, String crm){
        this.codigoInterno = codigoInterno;
        this.crm = crm;
        this.especialidades = especialidades;
        
    }
    public Integer getCodigoInterno() {
        return codigoInterno;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
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
    public String getMedicoSeparadoPorPontoEVirgula(){
        String medicoStr = this.codigoInterno + ";" + this.crm + ";" + this.especialidades;
        return medicoStr;
    }
    private void atualizarCodigo() {
        contador++;
        this.codigoInterno = contador;
    }
    
    public String getEspecialidadesComoTextoUnico(){
        String especialidadesStr = this.especialidades.toString();
        return especialidadesStr;
    }
}
