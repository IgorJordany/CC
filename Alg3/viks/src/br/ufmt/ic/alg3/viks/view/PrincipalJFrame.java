/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.viks.view;

/**
 *
 * @author kiev
 */
public class PrincipalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJFrame
     */
    public PrincipalJFrame() {
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

        conteudojPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        usuariojMenuItem = new javax.swing.JMenuItem();
        cenariojMenuItem = new javax.swing.JMenuItem();
        EquipamentojMenuItem = new javax.swing.JMenuItem();
        habilidadesjMenuItem = new javax.swing.JMenuItem();
        historiajMenuItem = new javax.swing.JMenuItem();
        inventariojMenuItem = new javax.swing.JMenuItem();
        itensjMenuItem = new javax.swing.JMenuItem();
        npcjMenuItem = new javax.swing.JMenuItem();
        objetosjMenuItem = new javax.swing.JMenuItem();
        personagemjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conteudojPanel.setMinimumSize(new java.awt.Dimension(600, 400));
        conteudojPanel.setLayout(new javax.swing.BoxLayout(conteudojPanel, javax.swing.BoxLayout.LINE_AXIS));

        jMenu1.setText("Cadastro");

        usuariojMenuItem.setText("Usuario");
        usuariojMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariojMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(usuariojMenuItem);

        cenariojMenuItem.setText("Cenario");
        cenariojMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenariojMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cenariojMenuItem);

        EquipamentojMenuItem.setText("Equipamento");
        EquipamentojMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipamentojMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(EquipamentojMenuItem);

        habilidadesjMenuItem.setText("Habilidades");
        habilidadesjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habilidadesjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(habilidadesjMenuItem);

        historiajMenuItem.setText("Historia");
        historiajMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiajMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(historiajMenuItem);

        inventariojMenuItem.setText("Inventario");
        inventariojMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventariojMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(inventariojMenuItem);

        itensjMenuItem.setText("Itens");
        itensjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itensjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(itensjMenuItem);

        npcjMenuItem.setText("NPC");
        npcjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npcjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(npcjMenuItem);

        objetosjMenuItem.setText("Objetos");
        objetosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objetosjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(objetosjMenuItem);

        personagemjMenuItem.setText("Personagem");
        personagemjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personagemjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(personagemjMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conteudojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conteudojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariojMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariojMenuItemActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new UsuarioJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_usuariojMenuItemActionPerformed

    private void cenariojMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenariojMenuItemActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new CenarioJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_cenariojMenuItemActionPerformed

    private void EquipamentojMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipamentojMenuItemActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new EquipamentoJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_EquipamentojMenuItemActionPerformed

    private void habilidadesjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habilidadesjMenuItemActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new HabilidadesJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_habilidadesjMenuItemActionPerformed

    private void historiajMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiajMenuItemActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new HistoriaJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_historiajMenuItemActionPerformed

    private void inventariojMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventariojMenuItemActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new InventarioJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_inventariojMenuItemActionPerformed

    private void itensjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itensjMenuItemActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new ItensJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_itensjMenuItemActionPerformed

    private void npcjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npcjMenuItemActionPerformed
        // TODO add your handling code here
        conteudojPanel.removeAll();
        conteudojPanel.add(new NpcJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);        
    }//GEN-LAST:event_npcjMenuItemActionPerformed

    private void objetosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objetosjMenuItemActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new ObjetosJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_objetosjMenuItemActionPerformed

    private void personagemjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personagemjMenuItemActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new PersonagemJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_personagemjMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EquipamentojMenuItem;
    private javax.swing.JMenuItem cenariojMenuItem;
    private javax.swing.JPanel conteudojPanel;
    private javax.swing.JMenuItem habilidadesjMenuItem;
    private javax.swing.JMenuItem historiajMenuItem;
    private javax.swing.JMenuItem inventariojMenuItem;
    private javax.swing.JMenuItem itensjMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem npcjMenuItem;
    private javax.swing.JMenuItem objetosjMenuItem;
    private javax.swing.JMenuItem personagemjMenuItem;
    private javax.swing.JMenuItem usuariojMenuItem;
    // End of variables declaration//GEN-END:variables
}