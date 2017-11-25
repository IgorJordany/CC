/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> lista;
    private static final String[] nomes = 
            new String[]{"Id","Nome","Telefone","E-mail"};

    public UsuarioTableModel(List<Usuario> lista) {
        this.lista = lista;
    }

    @Override
    public String getColumnName(int column) {
        return nomes[column];
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getId();
            case 1:
                return usuario.getNome();
            case 2:
                return usuario.getTelefone();
            case 3:
                return usuario.getEmail();
        }
        return null;
    }

}
