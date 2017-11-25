/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.persistencia.MySQL;

import br.ufmt.ic.alg3.viks.model.entidades.Usuario;
import br.ufmt.ic.alg3.viks.persistencia.UsuarioPersistencia;
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
public class UsuarioPersistenciaMySQL implements UsuarioPersistencia{

    @Override
    public void inserir(Usuario usuario) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "insert into usuario "
                    + "(nome,rg,telefone,endereco,email,cpf) "
                    + "values "
                    + "('"+usuario.getNome()+"',"
                    + "'"+usuario.getRg()+"',"
                    + "'"+usuario.getTelefone()+"',"
                    + "'"+usuario.getEndereco()+"',"
                    + "'"+usuario.getEmail()+"',"
                    + "'"+usuario.getCpf()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            String sql ="update usuario set nome=?, rg=?, telefone=?, endereco=?, email=?, cpf=? where id = ?;";
            
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, usuario.getNome());
            prst.setString(2, usuario.getRg());
            prst.setString(3, usuario.getTelefone());
            prst.setString(4, usuario.getEndereco());
            prst.setString(5, usuario.getEmail());
            prst.setString(6, usuario.getCpf());
            prst.setInt(7, usuario.getId());
            prst.execute();
            
            con.close();
        }catch (Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(Usuario usuario) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "delete from usuario " + "where id = "+usuario.getId();
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public List<Usuario> getAll() {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/viks", "root", "123");
            
            String sql = "select * from usuario;";
                        
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Usuario> lista = new ArrayList<Usuario>();                 
            while(rs.next()){
                Usuario resp = new Usuario();
                resp.setNome(rs.getString("nome"));
                resp.setRg(rs.getString("rg"));
                resp.setTelefone(rs.getString("telefone"));
                resp.setEndereco(rs.getString("endereco"));
                resp.setEmail(rs.getString("email"));
                resp.setCpf(rs.getString("cpf"));
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