package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.service.MedicoService;
import br.senai.sp.jandira.model.entity.Medico;
import br.senai.sp.jandira.model.entity.TipoOperacao;
import br.senai.sp.jandira.view.DialogMedicosForm;

public class MedicoController implements IController {

    private Medico medico;
    private DialogMedicosForm dialog;
    private TipoOperacao tipoOperacao;

    public void executa(Object view, TipoOperacao tipoOperacao) {
        dialog = (DialogMedicosForm) view;
        medico = new Medico();
        medico.setCrm(dialog.getTextFieldCRM());
        medico.setNome(dialog.getTextFieldCRM());
        medico.setTelefone(dialog.getTextFieldTelefone());
        medico.setDataDeNascimento(dialog.getTextFieldDataDeNascimento());
//      medico.setEspecialidades(dialog.);
                
    }
    private Medico medicoATransferir (Medico medico){
          MedicoService service =  new MedicoService();
          TipoOperacao tipoOperacao;
          if (tipoOperacao == TipoOperacao.ADICIONAR){
            tipoOperacao = TipoOperacao.ADICIONAR
        } else {
            atualizar();
        }
          return resultado;
      }
}
