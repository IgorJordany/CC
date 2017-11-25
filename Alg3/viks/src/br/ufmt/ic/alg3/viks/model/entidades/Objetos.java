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
public class Objetos implements Serializable{
    
    private int id;
    private String nome;
    private String interacao;
    private String status;
    private String examinar;

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

    public String getInteracao() {
        return interacao;
    }

    public void setInteracao(String interacao) {
        this.interacao = interacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExaminar() {
        return examinar;
    }

    public void setExaminar(String examinar) {
        this.examinar = examinar;
    }
    
    
}
