
package br.senai.sp.jandira.model.service;

import br.senai.sp.jandira.model.dao.MedicoDAO;
import br.senai.sp.jandira.model.entity.Especialidade;
import br.senai.sp.jandira.model.entity.Medico;
import java.util.ArrayList;

public class MedicoService {
    
    private Medico entity;
    private MedicoDAO dao;
    
    public MedicoService() {
          this.dao = new MedicoDAO();
      }
    
    public void salvar(Medico medico) {
         dao = new MedicoDAO();
         Integer codigo = entity.getCodigo();
         String crm = entity.getCrm();
         String nome = entity.getNome();
         String telefone = entity.getDataDeNascimento();
         String email = entity.getEmail();
         String dataDeNascimento = entity.getDataDeNascimento();
         ArrayList<Especialidade> especialidades = entity.getEspecialidades();
         Medico novoMedico = new Medico(codigo, crm, nome, telefone, email, dataDeNascimento, especialidades);
         MedicoDAO.adicionarMedico(novoMedico);
      }
}