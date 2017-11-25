/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Historia;
import br.ufmt.ic.alg3.viks.persistencia.HistoriaPersistencia;
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
public class HistoriaPersistenciaMySQL implements HistoriaPersistencia{

    @Override
    public void inserir(Historia historia) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into historia "
                    + "(titulo,narracao,dialogo,roteiro) "
                    + "values "
                    + "('"+historia.getTitulo()+"',"
                    + "'"+historia.getNarracao()+"',"
                    + "'"+historia.getDialogo()+"',"
                    + "'"+historia.getRoteiro()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Historia historia) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update historia set titulo=?, narracao=?, dialogo=?, roteiro=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, historia.getTitulo());
            prst.setString(2, historia.getNarracao());
            prst.setString(3, historia.getDialogo());
            prst.setString(4, historia.getRoteiro());
            prst.setInt(5, historia.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Historia historia) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from historia " + "where id = "+historia.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Historia> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from historia;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Historia> lista = new ArrayList<Historia>();                 
            while(rs.next()){
                Historia resp = new Historia();
                resp.setTitulo(rs.getString("titulo"));
                resp.setNarracao(rs.getString("narracao"));
                resp.setDialogo(rs.getString("dialogo"));
                resp.setRoteiro(rs.getString("roteiro"));
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