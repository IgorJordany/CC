/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Historia;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class HistoriaTableModel extends AbstractTableModel {

    private List<Historia> lista;
    private static final String[] nomes = 
            new String[]{"Id","Titulo","Narração","Dialogo","Roteiro"};

    public HistoriaTableModel(List<Historia> lista) {
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
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Historia historia = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return historia.getId();
            case 1:
                return historia.getTitulo();
            case 2:
                return historia.getNarracao();
            case 3:
                return historia.getDialogo();
            case 4:
                return historia.getRoteiro();
        }
        return null;
    }

}
