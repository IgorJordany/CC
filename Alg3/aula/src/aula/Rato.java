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
public class Rato extends Animal{
    
    public Rato(String nome){
        super(nome);
    }
    public void mover(int x, int y){
        setCoordenadas(x, y);
        System.out.println("Movendo o Rato");
    }
}
