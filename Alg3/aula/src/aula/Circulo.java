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
public class Circulo implements IFormaGeometrica, Comparable<Circulo> {
    
    private float raio;
    
    public Circulo(float raio){
        this.raio = raio;
    }
    
    public float calcularPerimetro(){
        return (float) (2*Math.PI*raio);
    }
    
    public float calcularArea(){
        return (float) Math.PI * raio * raio;
    }

    public float getRaio() {
        return raio;
    }

    @Override
    public int compareTo(Circulo o) {
        
        if(raio==o.raio){
            return 0;
        }else if(raio>o.raio){
            return 1;
        }
        return -1;
    }
}
