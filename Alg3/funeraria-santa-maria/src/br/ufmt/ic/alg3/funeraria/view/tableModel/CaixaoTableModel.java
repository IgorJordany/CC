/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.funeraria.view.tableModel;

import br.ufmt.ic.alg3.funeraria.model.entidades.Caixao;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class CaixaoTableModel extends AbstractTableModel{
    private List<Caixao> lista;
    private static final String[] nomes = 
            new String[]{"Id","Largura","Altura","Cor"};

    public CaixaoTableModel(List<Caixao> lista) {
        this.lista = lista;
    }

    public String getColumnName(int column) {
        return nomes[column];
    }

    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Caixao caixao = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return caixao.getId();
            case 1:
                return caixao.getLargura();
            case 2:
                return caixao.getAltura();
            case 3:
                return caixao.getCor();
        }
        return null;
    }
}
