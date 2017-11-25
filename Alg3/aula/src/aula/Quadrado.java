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
public class Quadrado extends Quadrilatero {

    private float lado;

    public Quadrado(float l) {
        super(l, l, l, l);
        this.lado = l;
    }
    
    public float calcularArea(){
        return lado*lado;
    }
}
