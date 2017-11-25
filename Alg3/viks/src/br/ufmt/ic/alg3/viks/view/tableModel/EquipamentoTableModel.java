/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Equipamento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class EquipamentoTableModel extends AbstractTableModel {

    private List<Equipamento> lista;
    private static final String[] nomes = 
            new String[]{"Id","Nome","Status","Descrição"};

    public EquipamentoTableModel(List<Equipamento> lista) {
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
        Equipamento equipamento = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return equipamento.getId();
            case 1:
                return equipamento.getNome();
            case 2:
                return equipamento.getStatus();
            case 3:
                return equipamento.getDescricao();
        }
        return null;
    }

}
