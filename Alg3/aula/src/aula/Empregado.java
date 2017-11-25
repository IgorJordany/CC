/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author richtic
 */
public class Empregado {
    private String nome;
    private String cpf;
    private String rg;
    private String carteiraDeTrabalho;
    private float salario;
    private int horasTrabalhadas;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getRg(){
        return this.rg;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getCarteiraDeTrabalho(){
        return this.carteiraDeTrabalho;
    }
    
    public void setCarteiraDeTrabalho(String carteiraDeTrabalho){
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }
    public float getSalario(){
        return this.salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public int getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }
    
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
}