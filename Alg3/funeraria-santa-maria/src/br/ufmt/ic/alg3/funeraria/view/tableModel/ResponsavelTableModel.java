/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.funeraria.view.tableModel;

import br.ufmt.ic.alg3.funeraria.model.entidades.Responsavel;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author raphael
 */
public class ResponsavelTableModel extends AbstractTableModel {

    private List<Responsavel> lista;
    private static final String[] nomes = 
            new String[]{"Id","Nome","Telefone","Email"};

    public ResponsavelTableModel(List<Responsavel> lista) {
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
        Responsavel responsavel = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return responsavel.getId();
            case 1:
                return responsavel.getNome();
            case 2:
                return responsavel.getTelefone();
            case 3:
                return responsavel.getEmail();
        }
        return null;
    }

}
