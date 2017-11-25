/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.alg3.funeraria.model.entidades;

import java.io.Serializable;

/**
 *
 * @author raphael
 */
public class Espaco implements Serializable{
    
    private int id;
    private float m2;
    private int qtdPessoas;
    private boolean climatizada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getM2() {
        return m2;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public boolean isClimatizada() {
        return climatizada;
    }

    public void setClimatizada(boolean climatizada) {
        this.climatizada = climatizada;
    }
    
    
    
}
