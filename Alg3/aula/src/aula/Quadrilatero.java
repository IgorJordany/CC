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
public abstract class Quadrilatero implements IFormaGeometrica {

    private float l1;
    private float l2;
    private float l3;
    private float l4;

    public Quadrilatero(float l1, float l2, float l3, float l4) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }

    public float calcularPerimetro() {
        return l1 + l2 + l3 + l4;
    }
}
