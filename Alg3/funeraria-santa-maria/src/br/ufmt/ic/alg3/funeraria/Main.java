/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.alg3.funeraria;

import br.ufmt.ic.alg3.funeraria.model.entidades.Responsavel;
import br.ufmt.ic.alg3.funeraria.persistencia.ResponsavelPersistencia;
import br.ufmt.ic.alg3.funeraria.persistencia.lista.ResponsavelPersistenciaLista;
import br.ufmt.ic.alg3.funeraria.persistencia.mysql.ResponsavelPersistenciaMySQL;
import br.ufmt.ic.alg3.funeraria.view.PrincipalJFrame;

/**
 *
 * @author raphael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PrincipalJFrame tela = new PrincipalJFrame();
        tela.setVisible(true);
//        ResponsavelPersistenciaMySQL c = new ResponsavelPersistenciaMySQL();
//        Responsavel r = new Responsavel();
//        r.setNome("jao");
//        r.setCpf("jao");
//        r.setEmail("jao");
//        r.setEndereco("jao");
//        r.setRg("jao");
//        r.setTelefone("Jao");
//        r.setId(3);
//        c.inserir(r);
//        c.remover(r);
//        System.out.println(c.getAll().size());
    } 
}
