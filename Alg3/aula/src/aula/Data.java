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
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        if(ano>0 && mes>0 && dia>0){
            verificaDia(dia, mes, ano);
        }
    }
    
    private void verificaDia(int dia, int mes, int ano){
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (dia <= 31) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia <= 30) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        } else if (mes == 2) {
            int aux = 28;
            if (ano % 4 == 0) {
                aux = 29;
            }
            if (dia <= aux) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        }
    }
    
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
}
