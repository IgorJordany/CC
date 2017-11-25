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
public class Animal {
    
    private String nome;
    private int x;
    private int y;
    public Animal(String nome){
        this.nome = nome;
    }
    public Animal(){
        this.nome = "anonimo";
    }
    public String getNome(){
        return this.nome;
    }
    protected void setCoordenadas(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void mover(int x, int y){
        System.out.println("Movendo");
    }
    
}
