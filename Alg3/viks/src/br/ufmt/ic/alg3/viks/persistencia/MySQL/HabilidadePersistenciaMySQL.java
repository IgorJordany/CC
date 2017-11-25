/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Habilidades;
import br.ufmt.ic.alg3.viks.persistencia.HabilidadesPersistencia;
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
public class HabilidadePersistenciaMySQL implements HabilidadesPersistencia{

    @Override
    public void inserir(Habilidades habilidades) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into habilidade "
                    + "(nome,xp,utilidade) "
                    + "values "
                    + "('"+habilidades.getNome()+"',"
                    + "'"+habilidades.getXp()+"',"
                    + "'"+habilidades.getUtilidade()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Habilidades habilidades) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update habilidade set nome=?, xp=?, utilidade=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, habilidades.getNome());
            prst.setFloat(2, habilidades.getXp());
            prst.setString(3, habilidades.getUtilidade());
            prst.setInt(4, habilidades.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Habilidades habilidades) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from habilidade " + "where id = "+habilidades.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Habilidades> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from habilidade;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Habilidades> lista = new ArrayList<Habilidades>();                 
            while(rs.next()){
                Habilidades resp = new Habilidades();
                resp.setNome(rs.getString("nome"));
                resp.setXp(rs.getFloat("xp"));
                resp.setUtilidade(rs.getString("utilidade"));
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