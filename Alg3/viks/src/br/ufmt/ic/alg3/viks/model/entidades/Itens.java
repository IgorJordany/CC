/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.model.entidades;

import java.io.Serializable;

/**
 *
 * @author kiev
 */
public class Itens implements Serializable{
    
    private int id;
    private String nome;
    private String utilidade;
    private String informacao;
    private String examinar;

    public String getExaminar() {
        return examinar;
    }

    public void setExaminar(String examinar) {
        this.examinar = examinar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUtilidade() {
        return utilidade;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
    
    
}
