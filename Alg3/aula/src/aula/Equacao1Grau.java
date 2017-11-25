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
public class Equacao1Grau {
    
    private float a;
    private float b;
    
    public float calcular1Grau(float x){
        return a*x+b;
    }
    
    public float getA(){
        return this.a;
    }
    
    public void setA(float a){
        this.a = a;
    }
    
    public float getB(){
        return this.b;
    }
    
    public void setB(float b){
        this.b = b;
    }
}