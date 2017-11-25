/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.funeraria.persistencia.mysql;

import br.ufmt.ic.alg3.funeraria.model.entidades.Responsavel;
import br.ufmt.ic.alg3.funeraria.persistencia.ResponsavelPersistencia;
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
public class ResponsavelPersistenciaMySQL implements ResponsavelPersistencia{

    @Override
    public void inserir(Responsavel responsavel) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/funeraria", "root", "123");
            
            String sql = "insert into responsavel "
                    + "(nome,rg,telefone,endereco,email,cpf) "
                    + "values "
                    + "('"+responsavel.getNome()+"',"
                    + "'"+responsavel.getRg()+"',"
                    + "'"+responsavel.getTelefone()+"',"
                    + "'"+responsavel.getEndereco()+"',"
                    + " '"+responsavel.getEmail()+"',"
                    + "'"+responsavel.getCpf()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Responsavel responsavel) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funeraria", "root", "123");
            String sql ="update responsavel set nome=?, rg=?, telefone=?, endereco=?, email=?, cpf=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, responsavel.getNome());
            prst.setString(2, responsavel.getRg());
            prst.setString(3, responsavel.getTelefone());
            prst.setString(4, responsavel.getEndereco());
            prst.setString(5, responsavel.getEmail());
            prst.setString(6, responsavel.getCpf());
            prst.setInt(7, responsavel.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Responsavel responsavel) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/funeraria", "root", "123");
            
            String sql = "delete from responsavel " + "where id = "+responsavel.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Responsavel> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/funeraria", "root", "123");
            
            String sql = "select * from responsavel;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Responsavel> lista = new ArrayList<Responsavel>();                 
            while(rs.next()){
                Responsavel resp = new Responsavel();
                resp.setNome(rs.getString("nome"));
                resp.setCpf(rs.getString("cpf"));
                resp.setEmail(rs.getString("email"));
                resp.setEndereco(rs.getString("endereco"));
                resp.setRg(rs.getString("rg"));
                resp.setTelefone(rs.getString("telefone"));
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