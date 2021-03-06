/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.funeraria.view;

import br.ufmt.ic.alg3.funeraria.view.tableModel.ResponsavelTableModel;
import br.ufmt.ic.alg3.funeraria.model.entidades.Responsavel;
import br.ufmt.ic.alg3.funeraria.persistencia.ResponsavelPersistencia;
import br.ufmt.ic.alg3.funeraria.persistencia.arquivo.ResponsavelPersistenciaArquivo;
import br.ufmt.ic.alg3.funeraria.persistencia.lista.ResponsavelPersistenciaLista;
import br.ufmt.ic.alg3.funeraria.persistencia.mysql.ResponsavelPersistenciaMySQL;
import javax.swing.JOptionPane;

/**
 *
 * @author raphael
 */
public class ResponsavelJPanel extends javax.swing.JPanel {

    private ResponsavelPersistencia banco = new ResponsavelPersistenciaMySQL();
    private ResponsavelTableModel tableModel;
    
    /**
     * Creates new form ResponsavelJPanel
     */
    public ResponsavelJPanel() {
        tableModel = new ResponsavelTableModel(banco.getAll());
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
        salvarjButton = new javax.swing.JButton();
        cpfjLabel = new javax.swing.JLabel();
        cpfjTextField = new javax.swing.JTextField();
        rgjLabel = new javax.swing.JLabel();
        rgjTextField = new javax.swing.JTextField();
        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        telefonejLabel = new javax.swing.JLabel();
        telefonejTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        enderecojLabel = new javax.swing.JLabel();
        enderecojTextField = new javax.swing.JTextField();
        cancelarjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelajTable = new javax.swing.JTable();
        removerjButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();

        idjLabel.setText("Id:");

        idjTextField.setEditable(false);
        idjTextField.setEnabled(false);

        salvarjButton.setText("Salvar");
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        cpfjLabel.setText("CPF:");

        rgjLabel.setText("RG:");

        nomejLabel.setText("Nome:");

        telefonejLabel.setText("Telefone:");

        emailjLabel.setText("Email:");

        enderecojLabel.setText("Endereço:");

        cancelarjButton.setText("Cancelar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        tabelajTable.setModel(tableModel);
        jScrollPane1.setViewportView(tabelajTable);

        removerjButton.setText("Remover");
        removerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerjButtonActionPerformed(evt);
            }
        });

        editarjButton.setText("Editar");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(enderecojLabel)
                        .addComponent(emailjLabel)
                        .addComponent(telefonejLabel)
                        .addComponent(nomejLabel)
                        .addComponent(rgjLabel)
                        .addComponent(cpfjLabel)
                        .addComponent(idjLabel))
                    .addComponent(removerjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cpfjTextField)
                    .addComponent(rgjTextField)
                    .addComponent(nomejTextField)
                    .addComponent(telefonejTextField)
                    .addComponent(emailjTextField)
                    .addComponent(enderecojTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 215, Short.MAX_VALUE)))
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
                    .addComponent(cpfjLabel)
                    .addComponent(cpfjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgjLabel)
                    .addComponent(rgjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonejLabel)
                    .addComponent(telefonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailjLabel)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecojLabel)
                    .addComponent(enderecojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarjButton)
                    .addComponent(cancelarjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removerjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarjButton)
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        // TODO add your handling code here:
        idjTextField.setText("");
        cpfjTextField.setText("");
        rgjTextField.setText("");
        nomejTextField.setText("");
        emailjTextField.setText("");
        enderecojTextField.setText("");
        telefonejTextField.setText("");

    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        Responsavel novo = new Responsavel();
        novo.setCpf(cpfjTextField.getText());
        novo.setRg(rgjTextField.getText());
        novo.setNome(nomejTextField.getText());
        novo.setEndereco(enderecojTextField.getText());
        novo.setTelefone(telefonejTextField.getText());
        novo.setEmail(emailjTextField.getText());

        int id = 0;
        try {
            id = Integer.parseInt(idjTextField.getText());
            novo.setId(id);
            banco.alterar(novo);
        } catch (Exception erro) {
            banco.inserir(novo);
        }

        JOptionPane.showMessageDialog(
                salvarjButton, "Salvo com Sucesso!");

        cancelarjButtonActionPerformed(null);

        ResponsavelTableModel modelo
                = (ResponsavelTableModel) tabelajTable.getModel();

        modelo.fireTableRowsInserted(0, 1);

    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void removerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerjButtonActionPerformed
        // TODO add your handling code here:

        int[] linhas = tabelajTable.getSelectedRows();

//        int decremento = 0;
//        for(int i = 0; i < linhas.length;i++){
//            Responsavel removido = banco
//                    .getAll().get(linhas[i]-decremento);
        for (int i = linhas.length - 1; i >= 0; i--) {
            Responsavel removido = banco
                    .getAll().get(linhas[i]);
            banco.remover(removido);
//            decremento++;

            ResponsavelTableModel modelo
                    = (ResponsavelTableModel) tabelajTable.getModel();

            modelo.fireTableRowsDeleted(0, 1);
        }

    }//GEN-LAST:event_removerjButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:

        int linha = tabelajTable.getSelectedRow();

        if (linha >= 0) {
            Responsavel selecionado;
            selecionado = banco.getAll().get(linha);

            idjTextField.setText(selecionado.getId() + "");
            nomejTextField.setText(selecionado.getNome());
            cpfjTextField.setText(selecionado.getCpf());
            emailjTextField.setText(selecionado.getEmail());
            enderecojTextField.setText(selecionado.getEndereco());
            rgjTextField.setText(selecionado.getRg());
            telefonejTextField.setText(selecionado.getTelefone());
        } else {
            JOptionPane.showMessageDialog(this, "Selecione 1 registro");
        }


    }//GEN-LAST:event_editarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JLabel cpfjLabel;
    private javax.swing.JTextField cpfjTextField;
    private javax.swing.JButton editarjButton;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel enderecojLabel;
    private javax.swing.JTextField enderecojTextField;
    private javax.swing.JLabel idjLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton removerjButton;
    private javax.swing.JLabel rgjLabel;
    private javax.swing.JTextField rgjTextField;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JTable tabelajTable;
    private javax.swing.JLabel telefonejLabel;
    private javax.swing.JTextField telefonejTextField;
    // End of variables declaration//GEN-END:variables
}
