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
public class DVD {
    
    private String marca;
    private String modelo;
    private float peso;
    private boolean slim;
    private float preco;
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public boolean getSlim(){
        return this.slim;
    }
    
    public void setSlim(boolean slim){
        this.slim = slim;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public void executarDVD(){
        System.out.println("Executando DVD");
    }
    
    public void avancar(){
        System.out.println("Avançando");
    }
    
    public void retroceder(){
        System.out.println("Retroceder");
    }
    
    public void parar(){
        System.out.println("Parado");
    }
}
