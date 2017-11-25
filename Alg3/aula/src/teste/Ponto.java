/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author richtic
 */
public class Ponto {
    
    private float x;
    private float y;
    
    public float getX(){
        return this.x;
    }
    
    public void setX(float x){
        if(x >= 0){
            this.x = x;
        }
    }
    
    public float getY(){
        return this.y;
    }
    
    public void setY(float y){
        if(y >= 0){
            this.y = y;
        }
    }
    
    public float calculaDistancia(Ponto ponto){
        return (float) Math.sqrt((this.x - ponto.x) * (this.x - ponto.x)
                + (this.y - ponto.y) * (this.y - ponto.y));
    }
}
