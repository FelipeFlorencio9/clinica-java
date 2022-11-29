package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.entity.TipoOperacao;

public interface IController {
    public void executa(Object view, TipoOperacao ADICIONAR);
}
