/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.exercicio.jba;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jose
 */
public class Repositorio {

    @PersistenceContext(name = "Exercicio-jba_PU")
    private EntityManager em;

    public void salvar(Pessoa pessoa) {
        em.persist(pessoa);
    }
}
