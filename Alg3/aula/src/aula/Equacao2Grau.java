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
public class Equacao2Grau extends Equacao1Grau {

    private float c;

    public float calcular2Grau(float x) {
        return x * calcular1Grau(x) + c;
    }

    public float getC() {
        return this.c;
    }

    public void setC(float c) {
        this.c = c;
    }

}
