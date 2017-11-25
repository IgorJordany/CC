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
public class Ocupa implements Serializable{

    private int id;
    private Velorio velorio;
    private Espaco espaco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Velorio getVelorio() {
        return velorio;
    }

    public void setVelorio(Velorio velorio) {
        this.velorio = velorio;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

}
