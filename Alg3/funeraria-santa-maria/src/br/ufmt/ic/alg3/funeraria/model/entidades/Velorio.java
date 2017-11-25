package br.ufmt.ic.alg3.funeraria.model.entidades;

import java.io.Serializable;
import java.util.Date;

public class Velorio implements Serializable{
    
    private int id;
    private Date dataInicio;
    private Date dataFim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
    
    
}
