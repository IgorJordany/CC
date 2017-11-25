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
public class Conta {
    String nome;
    String numero;
    double saldo;
    double valor;
    
    String getNome(){
        return this.nome;
    }
    
    void setNome(String nome){
        if (nome != ""){
            this.nome = nome;
        }else{
            this.nome = "Sem nome";
        }
    }
        
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double sacar(double valor){
        
        if(saldo >= valor){
            saldo = saldo - valor;
            return valor;
        }
        throw new RuntimeException("Saldo insuficiente!");
    }
    
}
