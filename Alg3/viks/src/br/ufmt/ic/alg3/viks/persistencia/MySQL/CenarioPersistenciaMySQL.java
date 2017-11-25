/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Cenario;
import br.ufmt.ic.alg3.viks.persistencia.CenarioPersistencia;
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
public class CenarioPersistenciaMySQL implements CenarioPersistencia{

    @Override
    public void inserir(Cenario cenario) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into cenario "
                    + "(nome,tamanho,local) "
                    + "values "
                    + "('"+cenario.getNome()+"',"
                    + "'"+cenario.getTamanho()+"',"
                    + "'"+cenario.getLocal()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Cenario cenario) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update cenario set nome=?, tamanho=?, local=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, cenario.getNome());
            prst.setFloat(2, cenario.getTamanho());
            prst.setString(3, cenario.getLocal());
            prst.setInt(4, cenario.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Cenario cenario) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from cenario " + "where id = "+cenario.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Cenario> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from cenario;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Cenario> lista = new ArrayList<Cenario>();                 
            while(rs.next()){
                Cenario resp = new Cenario();
                resp.setNome(rs.getString("nome"));
                resp.setTamanho(rs.getFloat("tamanho"));
                resp.setLocal(rs.getString("local"));
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