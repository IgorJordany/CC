/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.alg3.funeraria.view;

import br.ufmt.ic.alg3.funeraria.model.entidades.Caixao;
import br.ufmt.ic.alg3.funeraria.persistencia.CaixaoPersistencia;
import br.ufmt.ic.alg3.funeraria.persistencia.arquivo.CaixaoPersistenciaArquivo;
import br.ufmt.ic.alg3.funeraria.view.tableModel.CaixaoTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author raphael
 */
public class CaixaoJPanel extends javax.swing.JPanel {
    
    private CaixaoTableModel tableModel;
    private CaixaoPersistencia banco = new CaixaoPersistenciaArquivo();
    /**
     * Creates new form CaixaoJPanel
     */
    public CaixaoJPanel() {
        tableModel = new CaixaoTableModel(banco.getAll());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idjLabel = new javax.swing.JLabel();
        idjTextField = new javax.swing.JTextField();
        largurajLabel = new javax.swing.JLabel();
        largurajTextField = new javax.swing.JTextField();
        alturajLabel = new javax.swing.JLabel();
        alturajTextField = new javax.swing.JTextField();
        comprimentojLabel = new javax.swing.JLabel();
        comprimentojTextField = new javax.swing.JTextField();
        precojLabel = new javax.swing.JLabel();
        precojTextField = new javax.swing.JTextField();
        tipoMadeirajLabel = new javax.swing.JLabel();
        tipoMadeirajTextField = new javax.swing.JTextField();
        corjLabel = new javax.swing.JLabel();
        corjTextField = new javax.swing.JTextField();
        salvarjButton = new javax.swing.JButton();
        cancelarjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelajTable = new javax.swing.JTable();
        editarjButton = new javax.swing.JButton();
        removerjButton = new javax.swing.JButton();

        idjLabel.setText("Id:");

        idjTextField.setEditable(false);
        idjTextField.setEnabled(false);

        largurajLabel.setText("Largura:");

        alturajLabel.setText("Altura:");

        comprimentojLabel.setText("Comprimento:");

        precojLabel.setText("Preço:");

        tipoMadeirajLabel.setText("Tipo de Madeira:");

        corjLabel.setText("Cor:");

        salvarjButton.setText("Salvar");
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        cancelarjButton.setText("Cancelar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        tabelajTable.setModel(tableModel);
        jScrollPane1.setViewportView(tabelajTable);

        editarjButton.setText("Editar");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        removerjButton.setText("Remover");
        removerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(corjLabel)
                        .addComponent(tipoMadeirajLabel)
                        .addComponent(precojLabel)
                        .addComponent(comprimentojLabel)
                        .addComponent(alturajLabel)
                        .addComponent(largurajLabel)
                        .addComponent(idjLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(removerjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(editarjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(largurajTextField)
                    .addComponent(alturajTextField)
                    .addComponent(comprimentojTextField)
                    .addComponent(precojTextField)
                    .addComponent(tipoMadeirajTextField)
                    .addComponent(corjTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvarjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarjButton)))
                        .addGap(0, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idjLabel)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(largurajLabel)
                    .addComponent(largurajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturajLabel)
                    .addComponent(alturajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprimentojLabel)
                    .addComponent(comprimentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precojLabel)
                    .addComponent(precojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoMadeirajLabel)
                    .addComponent(tipoMadeirajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corjLabel)
                    .addComponent(corjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarjButton)
                    .addComponent(cancelarjButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removerjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarjButton)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        // TODO add your handling code here:
        idjTextField.setText("");
        alturajTextField.setText("");
        comprimentojTextField.setText("");
        corjTextField.setText("");
        largurajTextField.setText("");
        precojTextField.setText("");
        tipoMadeirajTextField.setText("");
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        // TODO add your handling code here:
        
        Caixao novo = new Caixao();
        novo.setCor(corjTextField.getText());
        novo.setTipoDeMadeira(tipoMadeirajTextField.getText());
        float convertido;
        convertido = Float.parseFloat(largurajTextField.getText());
        novo.setLargura(convertido);
        
        convertido = Float.parseFloat(alturajTextField.getText());
        novo.setAltura(convertido);
        
        convertido = Float.parseFloat(comprimentojTextField.getText());
        novo.setComprimento(convertido);
        
        convertido = Float.parseFloat(precojTextField.getText());
        novo.setPreco(convertido);
        
        int id = 0;
        try {
            id = Integer.parseInt(idjTextField.getText());
            novo.setId(id);
            banco.alterar(novo);
        } catch (Exception erro) {
            banco.inserir(novo);
        }
        JOptionPane.showMessageDialog(this,"Inserido com Sucesso");
        
        cancelarjButtonActionPerformed(evt);
        tableModel.fireTableRowsInserted(1,1);
    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:

        int linha = tabelajTable.getSelectedRow();

        if (linha >= 0) {
            Caixao selecionado;
            selecionado = banco.getAll().get(linha);

            idjTextField.setText(selecionado.getId() + "");
            largurajTextField.setText(selecionado.getLargura()+"");
            alturajTextField.setText(selecionado.getAltura()+"");
            comprimentojTextField.setText(selecionado.getComprimento()+"");
            precojTextField.setText(selecionado.getPreco()+"");
            tipoMadeirajTextField.setText(selecionado.getTipoDeMadeira()+"");
            corjTextField.setText(selecionado.getCor()+"");
           
        } else {
            JOptionPane.showMessageDialog(this, "Selecione 1 registro");
        }

    }//GEN-LAST:event_editarjButtonActionPerformed

    private void removerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerjButtonActionPerformed
        // TODO add your handling code here:

        int[] linhas = tabelajTable.getSelectedRows();

            for (int i = linhas.length - 1; i >= 0; i--) {
                Caixao removido = banco
                .getAll().get(linhas[i]);
                banco.remover(removido);
                //            decremento++;

                CaixaoTableModel modelo
                = (CaixaoTableModel) tabelajTable.getModel();

                modelo.fireTableRowsDeleted(0, 1);
            }
    }//GEN-LAST:event_removerjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alturajLabel;
    private javax.swing.JTextField alturajTextField;
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JLabel comprimentojLabel;
    private javax.swing.JTextField comprimentojTextField;
    private javax.swing.JLabel corjLabel;
    private javax.swing.JTextField corjTextField;
    private javax.swing.JButton editarjButton;
    private javax.swing.JLabel idjLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel largurajLabel;
    private javax.swing.JTextField largurajTextField;
    private javax.swing.JLabel precojLabel;
    private javax.swing.JTextField precojTextField;
    private javax.swing.JButton removerjButton;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JTable tabelajTable;
    private javax.swing.JLabel tipoMadeirajLabel;
    private javax.swing.JTextField tipoMadeirajTextField;
    // End of variables declaration//GEN-END:variables
}
