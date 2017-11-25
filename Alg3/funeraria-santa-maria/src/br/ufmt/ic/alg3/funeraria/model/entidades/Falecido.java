/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.alg3.funeraria.model.entidades;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author raphael
 */
public class Falecido implements Serializable{
 
    private int id;
    private String nome;
    private Date dataNascimento;
    private Date diaObito;
    private Date diaEntrada;
    private Date diaSaida;
    private String medidas;
    private Responsavel responsavel;
    private Caixao caixao;
    private Ocupa ocupa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Ocupa getOcupa() {
        return ocupa;
    }

    public void setOcupa(Ocupa ocupa) {
        this.ocupa = ocupa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDiaObito() {
        return diaObito;
    }

    public void setDiaObito(Date diaObito) {
        this.diaObito = diaObito;
    }

    public Date getDiaEntrada() {
        return diaEntrada;
    }

    public void setDiaEntrada(Date diaEntrada) {
        this.diaEntrada = diaEntrada;
    }

    public Date getDiaSaida() {
        return diaSaida;
    }

    public void setDiaSaida(Date diaSaida) {
        this.diaSaida = diaSaida;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Caixao getCaixao() {
        return caixao;
    }

    public void setCaixao(Caixao caixao) {
        this.caixao = caixao;
    }
    
    
    
}
