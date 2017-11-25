/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Itens;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class ItensTableModel extends AbstractTableModel {

    private List<Itens> lista;
    private static final String[] nomes = 
            new String[]{"Id","Nome","Utilidade","Informação","Examinar"};

    public ItensTableModel(List<Itens> lista) {
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
        Itens itens = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return itens.getId();
            case 1:
                return itens.getNome();
            case 2:
                return itens.getUtilidade();
            case 3:
                return itens.getInformacao();
            case 4:
                return itens.getExaminar();
        }
        return null;
    }

}
