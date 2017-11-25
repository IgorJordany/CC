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
public class Caixao implements Serializable{

    private int id;
    private float largura;
    private float altura;
    private float comprimento;
    private float preco;
    private String tipoDeMadeira;
    private String cor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTipoDeMadeira() {
        return tipoDeMadeira;
    }

    public void setTipoDeMadeira(String tipoDeMadeira) {
        this.tipoDeMadeira = tipoDeMadeira;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
