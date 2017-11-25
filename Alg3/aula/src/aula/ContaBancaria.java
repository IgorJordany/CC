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
public class ContaBancaria {
    String nome;
    String cpf;
    float saldo;
    
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
    
    String getCpf(){
        return this.cpf;
    }
    
    void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    float getSaldo(){
        return this.saldo;
    }
    
    void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    float saque(float valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            return valor;
        }
        System.out.println("Saldo insuficiente para esse valor de saque!");
        return 0;
    }
    String deposito(float valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
            return "Depósito realizado com sucesso!!!!";
        }
        return "Depósito não realizado!";
    }
    void saldoTela(){
        System.out.println(this.nome + " seu saldo é: " + this.saldo);
    }
}
