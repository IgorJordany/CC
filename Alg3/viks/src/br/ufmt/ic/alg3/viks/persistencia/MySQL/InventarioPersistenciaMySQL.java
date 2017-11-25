/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Inventario;
import br.ufmt.ic.alg3.viks.persistencia.InventarioPersistencia;
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
public class InventarioPersistenciaMySQL implements InventarioPersistencia{

    @Override
    public void inserir(Inventario inventario) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into inventario "
                    + "(quantidade,opcoes) "
                    + "values "
                    + "('"+inventario.getQuantidade()+"',"
                    + "'"+inventario.getOpcoes()+"');";            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Inventario inventario) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update inventario set quantidade=?, opcoes=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setInt(1, inventario.getQuantidade());
            prst.setString(2, inventario.getOpcoes());
            prst.setInt(3, inventario.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Inventario inventario) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from inventario " + "where id = "+inventario.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Inventario> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from inventario;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Inventario> lista = new ArrayList<Inventario>();                 
            while(rs.next()){
                Inventario resp = new Inventario();
                resp.setQuantidade(rs.getInt("quantidade"));
                resp.setOpcoes(rs.getString("opcoes"));
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