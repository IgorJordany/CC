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
public class Equacao3Grau extends Equacao2Grau{

    private float d;

    public float calcular3Grau(float x) {
        return x * calcular2Grau(x) + d;
    }
    
    public float getD(){
        return this.d;
    }
    
    public void setD(float d){
        this.d = d;
    }

}
