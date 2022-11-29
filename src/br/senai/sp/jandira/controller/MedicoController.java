package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.service.MedicoService;
import br.senai.sp.jandira.model.entity.Medico;
import br.senai.sp.jandira.model.entity.TipoOperacao;
import br.senai.sp.jandira.view.DialogMedicosForm;
import java.awt.event.ActionEvent;

public class MedicoController implements IController {

    private Medico medico;
    private DialogMedicosForm dialog;

    
    @Override
    public void executa(Object view, TipoOperacao ADICIONAR) {
       dialog = (DialogMedicosForm) view;
        medico = new Medico();
        medico.setCrm(dialog.getTextFieldCRM());
        medico.setNome(dialog.getTextFieldCRM());
        medico.setTelefone(dialog.getTextFieldTelefone());
        medico.setDataDeNascimento(dialog.getTextFieldDataDeNascimento());
//      medico.setEspecialidades(dialog.);s://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void executa(ActionEvent evt, TipoOperacao tipoOperacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
   
    
         
