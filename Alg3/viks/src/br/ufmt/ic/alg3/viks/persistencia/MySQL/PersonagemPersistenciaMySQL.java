/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Personagem;
import br.ufmt.ic.alg3.viks.persistencia.PersonagemPersistencia;
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
public class PersonagemPersistenciaMySQL implements PersonagemPersistencia{

    @Override
    public void inserir(Personagem personagem) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into personagem "
                    + "(nome,hp,adren) "
                    + "values "
                    + "('"+personagem.getNome()+"',"
                    + "'"+personagem.getHp()+"',"
                    + "'"+personagem.getAdren()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Personagem personagem) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update personagem set nome=?, hp=?, adren=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, personagem.getNome());
            prst.setInt(2, personagem.getHp());
            prst.setInt(3, personagem.getAdren());
            prst.setInt(4, personagem.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Personagem personagem) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from personagem " + "where id = "+personagem.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Personagem> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from personagem;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Personagem> lista = new ArrayList<Personagem>();                 
            while(rs.next()){
                Personagem resp = new Personagem();
                resp.setNome(rs.getString("nome"));
                resp.setHp(rs.getInt("hp"));
                resp.setAdren(rs.getInt("adren"));
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