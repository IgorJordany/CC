/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view.tableModel;

import br.ufmt.ic.alg3.viks.model.entidades.Personagem;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiev
 */
public class PersonagemTableModel extends AbstractTableModel {

    private List<Personagem> lista;
    private static final String[] nomes = 
            new String[]{"Id","Nome","HP","Adrenalina"};

    public PersonagemTableModel(List<Personagem> lista) {
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
        Personagem personagem = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return personagem.getId();
            case 1:
                return personagem.getNome();
            case 2:
                return personagem.getHp();
            case 3:
                return personagem.getAdren();
        }
        return null;
    }

}
