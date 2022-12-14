package br.senai.sp.jandira.model.entity;

import br.senai.sp.jandira.model.dao.EspecialidadeDAO;
import java.util.ArrayList;
import java.util.Arrays;

public class Medico extends Pessoa {

    private static int contador = 000;
    private Integer codigo;
    private String crm;
    private ArrayList<Especialidade> especialidades = new ArrayList<>();
 

    

    public Medico(Integer codigo, String crm) {
        this.codigo = codigo;
        this.crm = crm;

    }

    public Medico(
            Integer codigo, String crm, String nome, String telefone, String email, String dataDeNascimento, ArrayList<Especialidade> especialidades) {

        super(nome, telefone, email, dataDeNascimento);
        this.codigo = codigo;
        this.crm = crm;
        this.especialidades = especialidades;
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setEmail(email);
        super.setDataDeNascimento(dataDeNascimento);
        
       
    }

    public Medico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
//    public ArrayList<Especialidade> getObjetosEspecialidades(){
//        ArrayList<Especialidade> objetosEspecialidades = new ArrayList<>();
//        for(Especialidade e : especialidades){
//         objetosEspecialidades.add(EspecialidadeDAO.getEspecialidade(e));
//        }
//        return objetosEspecialidades;
//    }
//    public String getEspecialidadesSeparadasPorVirgula(){
//        String linhaDeEspecialidades = "";
//       
//        for(Especialidade e : getObjetosEspecialidades()){
//            linhaDeEspecialidades = e.getNome() + ";";
//        }
//        return linhaDeEspecialidades;
//    }
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
        System.out.printf("Ol??, eu sou o M??dico %s, tudo bem?\n", super.getNome());
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
