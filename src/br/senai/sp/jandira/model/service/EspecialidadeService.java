package br.senai.sp.jandira.model.service;

import br.senai.sp.jandira.model.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.entity.Especialidade;
import java.util.ArrayList;

public class EspecialidadeService {
    private EspecialidadeDAO dao;
    private Especialidade entity;
    private ArrayList<Especialidade> especialidadesRapidas;

    public void carregarEspecialidadesRapidas() {
        EspecialidadeDAO.getListaDeEspecialidades();
    }

    
    
    

}
