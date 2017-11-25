/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Itens;
import br.ufmt.ic.alg3.viks.persistencia.ItensPersistencia;
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
public class ItensPersistenciaMySQL implements ItensPersistencia{

    @Override
    public void inserir(Itens itens) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into itens "
                    + "(nome,utilidade,informacao,examinar) "
                    + "values "
                    + "('"+itens.getNome()+"',"
                    + "'"+itens.getUtilidade()+"',"
                    + "'"+itens.getInformacao()+"',"
                    + "'"+itens.getExaminar()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Itens itens) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update itens set nome=?, utilidade=?, informacao=?, examinar=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, itens.getNome());
            prst.setString(2, itens.getUtilidade());
            prst.setString(3, itens.getInformacao());
            prst.setString(4, itens.getExaminar());
            prst.setInt(5, itens.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Itens itens) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from itens " + "where id = "+itens.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Itens> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from itens;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Itens> lista = new ArrayList<Itens>();                 
            while(rs.next()){
                Itens resp = new Itens();
                resp.setNome(rs.getString("nome"));
                resp.setUtilidade(rs.getString("utilidade"));
                resp.setInformacao(rs.getString("informacao"));
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