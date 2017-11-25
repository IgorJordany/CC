/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Inventario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class InventarioTableModel extends AbstractTableModel {

    private List<Inventario> lista;
    private static final String[] nomes = 
            new String[]{"Id","Quantidade","Epções"};

    public InventarioTableModel(List<Inventario> lista) {
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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario inventario = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return inventario.getId();
            case 1:
                return inventario.getQuantidade();
            case 2:
                return inventario.getOpcoes();
        }
        return null;
    }

}
