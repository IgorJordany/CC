/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Cenario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class CenarioTableModel extends AbstractTableModel {

    private List<Cenario> lista;
    private static final String[] nomes = 
            new String[]{"Id","Nome","Tamanho","Local"};

    public CenarioTableModel(List<Cenario> lista) {
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
        Cenario cenario = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cenario.getId();
            case 1:
                return cenario.getNome();
            case 2:
                return cenario.getTamanho();
            case 3:
                return cenario.getLocal();
        }
        return null;
    }

}
