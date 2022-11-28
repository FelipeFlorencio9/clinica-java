package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.service.MedicoService;
import br.senai.sp.jandira.model.entity.Medico;
import br.senai.sp.jandira.model.entity.TipoOperacao;
import br.senai.sp.jandira.view.DialogMedicosForm;

public class MedicoController implements IController {

    private Medico medico;
    private DialogMedicosForm dialog;

    public void executa(Object view) {
        dialog = (DialogMedicosForm) view;
        medico = new Medico();
        medico.setCrm(dialog.getTextFieldCRM());
        medico.setNome(dialog.getTextFieldCRM());
        medico.setTelefone(dialog.getTextFieldTelefone());
        medico.setDataDeNascimento(dialog.getTextFieldDataDeNascimento());
        medico.setEspecialidades(dialog.getEspecialidadesSelecionadas());
                
    }
}
