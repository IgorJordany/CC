/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Objetos;
import br.ufmt.ic.alg3.viks.persistencia.ObjetosPersistencia;
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
public class ObjetoPersistenciaMySQL implements ObjetosPersistencia{

    @Override
    public void inserir(Objetos objeto) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into objeto "
                    + "(nome,interacao,status,examinar) "
                    + "values "
                    + "('"+objeto.getNome()+"',"
                    + "'"+objeto.getInteracao()+"',"
                    + "'"+objeto.getStatus()+"',"
                    + "'"+objeto.getExaminar()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Objetos objeto) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update objeto set nome=?, interacao=?, status=?, examinar=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, objeto.getNome());
            prst.setString(2, objeto.getInteracao());
            prst.setString(3, objeto.getStatus());
            prst.setString(4, objeto.getExaminar());
            prst.setInt(5, objeto.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Objetos objeto) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from objeto " + "where id = "+objeto.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Objetos> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from objeto;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Objetos> lista = new ArrayList<Objetos>();                 
            while(rs.next()){
                Objetos resp = new Objetos();
                resp.setNome(rs.getString("nome"));
                resp.setInteracao(rs.getString("interacao"));
                resp.setStatus(rs.getString("status"));
                resp.setExaminar(rs.getString("examinar"));
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