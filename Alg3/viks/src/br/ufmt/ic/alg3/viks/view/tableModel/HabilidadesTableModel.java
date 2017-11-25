/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Habilidades;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class HabilidadesTableModel extends AbstractTableModel {

    private List<Habilidades> lista;
    private static final String[] nomes = 
            new String[]{"Id","Nome","XP","Utilidade"};

    public HabilidadesTableModel(List<Habilidades> lista) {
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
        Habilidades habilidades = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return habilidades.getId();
            case 1:
                return habilidades.getNome();
            case 2:
                return habilidades.getXp();
            case 3:
                return habilidades.getUtilidade();
        }
        return null;
    }

}
