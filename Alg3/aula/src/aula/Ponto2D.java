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
public class Ponto2D {
    
    private double x;
    private double y;
    
    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Ponto2D(Ponto2D ponto){
        this.x = ponto.x;
        this.y = ponto.y;
    }
    
    public void mover(){
        this.mover(0,0);
    }
    
    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void mover(Ponto2D ponto){
        this.mover(ponto.x, ponto.y);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Ponto2D){
            Ponto2D ponto = (Ponto2D) obj;
            return this.x == ponto.x && this.y == ponto.y;
        }
        return false;
    }
    
    public String toString(){
        return "("+x+","+y+")";
    }
}
