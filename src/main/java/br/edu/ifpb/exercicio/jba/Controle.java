/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.exercicio.jba;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jose
 */
@Named
@RequestScoped
public class Controle {

    private Pessoa pessoa;

    private Repositorio repositorio;

    @PostConstruct
    public void init() {
        pessoa = new Pessoa();
        repositorio = new Repositorio();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String savar() {

        repositorio.salvar(pessoa);
        this.pessoa = new Pessoa();
        return null;

    }

}
