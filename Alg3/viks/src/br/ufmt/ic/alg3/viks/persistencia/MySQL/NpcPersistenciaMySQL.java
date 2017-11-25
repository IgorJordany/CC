/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Npc;
import br.ufmt.ic.alg3.viks.persistencia.NpcPersistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kiev
 */
public class NpcPersistenciaMySQL implements NpcPersistencia{

    @Override
    public void inserir(Npc npc) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into npc "
                    + "(nome,classificacao) "
                    + "values "
                    + "('"+npc.getNome()+"',"
                    //+ "'"+npc.getClassificacao()+"',"
                    //+ "'"+npc.getItens()+"',"
                    + "'"+npc.getCenario()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Npc npc) {//Alterar com problema de chave estrangeira
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update npc set nome=?, classificacao=?, coditem=?, codcenario=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, npc.getNome());
            prst.setString(2, npc.getClassificacao());
            prst.setInt(3, 0);//Da problema com a chave estrangeira
            prst.setInt(4, 0);//Da problema com a chave estrangeira
            prst.setInt(5, npc.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Npc npc) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from npc " + "where id = "+npc.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Npc> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from npc;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Npc> lista = new ArrayList<Npc>();                 
            while(rs.next()){
                Npc resp = new Npc();
                resp.setNome(rs.getString("nome"));
                resp.setClassificacao(rs.getString("classificacao"));
                //resp.setItens(rs.getInt("coditem"));
                //resp.setCenario(rs.getInt("codcenario"));
                resp.setId(rs.getInt("id"));
                lista.add(resp);
            }
            
            con.close();
            return lista;
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return null;
    }
}