/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Objetos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class ObjetosTableModel extends AbstractTableModel {

    private List<Objetos> lista;
    private static final String[] nomes = 
            new String[]{"Id","Nome","Interação","Status","Examinar"};

    public ObjetosTableModel(List<Objetos> lista) {
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
        Objetos objetos = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return objetos.getId();
            case 1:
                return objetos.getNome();
            case 2:
                return objetos.getInteracao();
            case 3:
                return objetos.getStatus();
            case 4:
                return objetos.getExaminar();
        }
        return null;
    }

}
