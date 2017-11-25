/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Npc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class NpcTableModel extends AbstractTableModel {

    private List<Npc> lista;
    private static final String[] nomes = 
            new String[]{"Id","Nome","Classificação","Itens","Cenário"};

    public NpcTableModel(List<Npc> lista) {
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
        Npc npc = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return npc.getId();
            case 1:
                return npc.getNome();
            case 2:
                return npc.getClassificacao();
            case 3:
                return npc.getItens();
            case 4:
                return npc.getCenario();
        }
        return null;        
    }

}
