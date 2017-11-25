/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Equipamento;
import br.ufmt.ic.alg3.viks.persistencia.EquipamentoPersistencia;
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
public class EquipamentoPersistenciaMySQL implements EquipamentoPersistencia{

    @Override
    public void inserir(Equipamento equipamento) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into equipamento "
                    + "(nome,status,quantidade,descricao) "
                    + "values "
                    + "('"+equipamento.getNome()+"',"
                    + "'"+equipamento.getStatus()+"',"
                    + "'"+equipamento.getQuantidade()+"',"
                    + "'"+equipamento.getDescricao()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Equipamento equipamento) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update equipamento set nome=?, status=?, quantidade=?, descricao=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, equipamento.getNome());
            prst.setString(2, equipamento.getStatus());
            prst.setInt(3, equipamento.getQuantidade());
            prst.setString(4, equipamento.getDescricao());
            prst.setInt(5, equipamento.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Equipamento equipamento) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from equipamento " + "where id = "+equipamento.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Equipamento> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from equipamento;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Equipamento> lista = new ArrayList<Equipamento>();                 
            while(rs.next()){
                Equipamento resp = new Equipamento();
                resp.setNome(rs.getString("nome"));
                resp.setStatus(rs.getString("status"));
                resp.setQuantidade(rs.getInt("quantidade"));
                resp.setDescricao(rs.getString("descricao"));
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