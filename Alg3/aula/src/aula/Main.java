/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author richtic
 * @param <T>
 */
public class Main<T extends Comparable<T>> {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Float[] a = new Float[]{1f,2f,3f,4f};
        float p = 2;
        
        Main<Float> m = new Main<Float>();
        System.out.println(m.maiores(a, p));
        

    }
    public int maiores(T[] vetor, T elem){
        int count = 0;
        for(T t : vetor){
            int ret = t.compareTo(elem);
            count += (ret > 0) ? ret : 0;
        }
        return count;
    }
}
