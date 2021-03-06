package br.ufmt.ic.alg3.viks.view;

import br.ufmt.ic.alg3.viks.view.tableModel.ObjetosTableModel;
import br.ufmt.ic.alg3.viks.model.entidades.Objetos;
import br.ufmt.ic.alg3.viks.persistencia.MySQL.ObjetoPersistenciaMySQL;
import br.ufmt.ic.alg3.viks.persistencia.ObjetosPersistencia;
import br.ufmt.ic.alg3.viks.persistencia.arquivo.ObjetosPersistenciaArquivo;
import javax.swing.JOptionPane;

public class ObjetosJPanel extends javax.swing.JPanel {

    private final ObjetosPersistencia banco = new ObjetoPersistenciaMySQL();
    private final ObjetosTableModel tableModel;
    
    /**
     * Creates new form ObjetosJPanel
     */
    public ObjetosJPanel() {
        tableModel = new ObjetosTableModel(banco.getAll());
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idjLabel = new javax.swing.JLabel();
        interacaojLabel = new javax.swing.JLabel();
        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        statusjLabel = new javax.swing.JLabel();
        statusjTextField = new javax.swing.JTextField();
        salvarjButton = new javax.swing.JButton();
        cancelarjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelajTable = new javax.swing.JTable();
        removerjButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();
        interacaojTextField = new javax.swing.JTextField();
        idjTextField = new javax.swing.JTextField();
        examinarjLabel = new javax.swing.JLabel();
        examinarjTextField = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("jLabel1");

        idjLabel.setText("Id:");

        interacaojLabel.setText("Interação:");

        nomejLabel.setText("Nome:");

        nomejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomejTextFieldActionPerformed(evt);
            }
        });

        statusjLabel.setText("Status:");

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

        idjTextField.setEditable(false);

        examinarjLabel.setText("Examinar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(salvarjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarjButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(statusjLabel)
                                    .addComponent(nomejLabel)
                                    .addComponent(interacaojLabel)
                                    .addComponent(idjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(statusjTextField)
                                    .addComponent(interacaojTextField)
                                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(examinarjTextField))))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(removerjButton)
                                    .addComponent(editarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(examinarjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idjLabel)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interacaojLabel)
                    .addComponent(interacaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusjLabel)
                    .addComponent(statusjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examinarjLabel)
                    .addComponent(examinarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarjButton)
                    .addComponent(cancelarjButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removerjButton)
                        .addGap(18, 18, 18)
                        .addComponent(editarjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        // TODO add your handling code here:
        float convertido;
        Objetos novo = new Objetos();
        novo.setNome(nomejTextField.getText());
        novo.setInteracao(interacaojTextField.getText());
        novo.setStatus(statusjTextField.getText());
        novo.setExaminar(examinarjTextField.getText());
        

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

        ObjetosTableModel modelo
                = (ObjetosTableModel) tabelajTable.getModel();

        modelo.fireTableRowsInserted(0, 1);
    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        // TODO add your handling code here:
        idjTextField.setText("");
        nomejTextField.setText("");
        interacaojTextField.setText("");
        statusjTextField.setText("");
        examinarjTextField.setText("");
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void removerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerjButtonActionPerformed
        // TODO add your handling code here:
        int[] linhas = tabelajTable.getSelectedRows();

        for (int i = linhas.length - 1; i >= 0; i--) {
            Objetos removido = banco
                    .getAll().get(linhas[i]);
            banco.remover(removido);

            ObjetosTableModel modelo
                    = (ObjetosTableModel) tabelajTable.getModel();

            modelo.fireTableRowsDeleted(0, 1);
        }
    }//GEN-LAST:event_removerjButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:
        int linha = tabelajTable.getSelectedRow();

        if (linha >= 0) {
            Objetos selecionado;
            float convertido;
            selecionado = banco.getAll().get(linha);

            idjTextField.setText(selecionado.getId() + "");
            nomejTextField.setText(selecionado.getNome());
            interacaojTextField.setText(selecionado.getInteracao());
            statusjTextField.setText(selecionado.getStatus());
            examinarjTextField.setText(selecionado.getExaminar());
        } else {
            JOptionPane.showMessageDialog(this, "Selecione 1 registro");
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void nomejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomejTextFieldActionPerformed
                                                                                                                                                                             
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JButton editarjButton;
    private javax.swing.JLabel examinarjLabel;
    private javax.swing.JTextField examinarjTextField;
    private javax.swing.JLabel idjLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JLabel interacaojLabel;
    private javax.swing.JTextField interacaojTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton removerjButton;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JLabel statusjLabel;
    private javax.swing.JTextField statusjTextField;
    private javax.swing.JTable tabelajTable;
    // End of variables declaration//GEN-END:variables
}
