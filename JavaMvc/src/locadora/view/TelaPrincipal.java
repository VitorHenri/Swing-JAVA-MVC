/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

import locadora.controller.ReportController;

/**
 *
 * @author Usuario
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1Principal = new javax.swing.JPanel();
        jButton1GerarRF2 = new javax.swing.JButton();
        jButton1GerarRF3 = new javax.swing.JButton();
        jButton1GerarRF4 = new javax.swing.JButton();
        jButton1RelatorioItem = new javax.swing.JButton();
        jMenuBar1TelaPrincipal = new javax.swing.JMenuBar();
        jMenu1Locacao = new javax.swing.JMenu();
        jMenuItem1Alugar = new javax.swing.JMenuItem();
        jMenuItem2Consulta = new javax.swing.JMenuItem();
        jMenu2Cadastro = new javax.swing.JMenu();
        jMenuItem2Ator = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenuItem();
        Filme = new javax.swing.JMenuItem();
        Item = new javax.swing.JMenuItem();
        jMenu1Sair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vídeo Locadora Hora da Pipoca");

        jPanel1Principal.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1Principal.setName(""); // NOI18N
        jPanel1Principal.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1Principal.setVerifyInputWhenFocusTarget(false);

        jButton1GerarRF2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1GerarRF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pipoca.png"))); // NOI18N
        jButton1GerarRF2.setText("Gerar Relatório Filme");
        jButton1GerarRF2.setToolTipText("");
        jButton1GerarRF2.setFocusPainted(false);
        jButton1GerarRF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GerarRF2ActionPerformed(evt);
            }
        });

        jButton1GerarRF3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1GerarRF3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pipoca.png"))); // NOI18N
        jButton1GerarRF3.setText("Gerar Relatório Cliente");
        jButton1GerarRF3.setToolTipText("");
        jButton1GerarRF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GerarRF3ActionPerformed(evt);
            }
        });

        jButton1GerarRF4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1GerarRF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pipoca.png"))); // NOI18N
        jButton1GerarRF4.setText("Gerar Relatório Ator");
        jButton1GerarRF4.setToolTipText("");
        jButton1GerarRF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GerarRF4ActionPerformed(evt);
            }
        });

        jButton1RelatorioItem.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1RelatorioItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pipoca.png"))); // NOI18N
        jButton1RelatorioItem.setText("Gerar Relatório Item");
        jButton1RelatorioItem.setMaximumSize(new java.awt.Dimension(266, 70));
        jButton1RelatorioItem.setMinimumSize(new java.awt.Dimension(266, 70));
        jButton1RelatorioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RelatorioItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1PrincipalLayout = new javax.swing.GroupLayout(jPanel1Principal);
        jPanel1Principal.setLayout(jPanel1PrincipalLayout);
        jPanel1PrincipalLayout.setHorizontalGroup(
            jPanel1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1PrincipalLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addGroup(jPanel1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1RelatorioItem, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1GerarRF4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(jPanel1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1PrincipalLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jButton1GerarRF2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(372, Short.MAX_VALUE)))
            .addGroup(jPanel1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1PrincipalLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jButton1GerarRF3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(375, Short.MAX_VALUE)))
        );
        jPanel1PrincipalLayout.setVerticalGroup(
            jPanel1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1PrincipalLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1GerarRF4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton1RelatorioItem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1PrincipalLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jButton1GerarRF2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(238, Short.MAX_VALUE)))
            .addGroup(jPanel1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1PrincipalLayout.createSequentialGroup()
                    .addContainerGap(226, Short.MAX_VALUE)
                    .addComponent(jButton1GerarRF3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );

        jMenu1Locacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jMenu1Locacao.setText("Locação");
        jMenu1Locacao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem1Alugar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem1Alugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItem1Alugar.setText("Alugar");
        jMenuItem1Alugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1AlugarActionPerformed(evt);
            }
        });
        jMenu1Locacao.add(jMenuItem1Alugar);

        jMenuItem2Consulta.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem2Consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItem2Consulta.setText("Consulta");
        jMenu1Locacao.add(jMenuItem2Consulta);

        jMenuBar1TelaPrincipal.add(jMenu1Locacao);

        jMenu2Cadastro.setText("Cadastro");
        jMenu2Cadastro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem2Ator.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem2Ator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItem2Ator.setText("Ator");
        jMenuItem2Ator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2AtorActionPerformed(evt);
            }
        });
        jMenu2Cadastro.add(jMenuItem2Ator);

        Cliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        jMenu2Cadastro.add(Cliente);

        Filme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Filme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        Filme.setText("Filme");
        Filme.setToolTipText("");
        Filme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilmeActionPerformed(evt);
            }
        });
        jMenu2Cadastro.add(Filme);

        Item.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        Item.setText("Item");
        Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemActionPerformed(evt);
            }
        });
        jMenu2Cadastro.add(Item);

        jMenuBar1TelaPrincipal.add(jMenu2Cadastro);

        jMenu1Sair.setText("Sair");
        jMenu1Sair.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu1Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1SairMouseClicked(evt);
            }
        });
        jMenu1Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1SairActionPerformed(evt);
            }
        });
        jMenuBar1TelaPrincipal.add(jMenu1Sair);

        setJMenuBar(jMenuBar1TelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel1Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2AtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2AtorActionPerformed
        TelaCadastroAtor t =  new TelaCadastroAtor();
        this.dispose();
        t.setVisible(true);
    }//GEN-LAST:event_jMenuItem2AtorActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        TelaCadastroCliente c = new TelaCadastroCliente();
        this.dispose();
        c.setVisible(true);
    }//GEN-LAST:event_ClienteActionPerformed

    private void FilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilmeActionPerformed
        TelaCadastroFilme f = new TelaCadastroFilme();
        this.dispose();
        f.setVisible(true);
    }//GEN-LAST:event_FilmeActionPerformed

    private void ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemActionPerformed
        TelaCadastroItem i = new TelaCadastroItem();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_ItemActionPerformed

    private void jButton1GerarRF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GerarRF2ActionPerformed
        ReportController.relatorioFilmes();
    }//GEN-LAST:event_jButton1GerarRF2ActionPerformed

    private void jButton1GerarRF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GerarRF3ActionPerformed
        ReportController.relatorioClientes();
    }//GEN-LAST:event_jButton1GerarRF3ActionPerformed

    private void jButton1GerarRF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GerarRF4ActionPerformed
        ReportController.relatorioAtor();
    }//GEN-LAST:event_jButton1GerarRF4ActionPerformed

    private void jMenu1SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1SairActionPerformed
        
    }//GEN-LAST:event_jMenu1SairActionPerformed

    private void jMenu1SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1SairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu1SairMouseClicked

    private void jButton1RelatorioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RelatorioItemActionPerformed
        new ReportController().Item();
    }//GEN-LAST:event_jButton1RelatorioItemActionPerformed

    private void jMenuItem1AlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1AlugarActionPerformed
        TelaAlugarFilme telaAlugarFilme = new TelaAlugarFilme();
        telaAlugarFilme.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1AlugarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem Filme;
    private javax.swing.JMenuItem Item;
    private javax.swing.JButton jButton1GerarRF2;
    private javax.swing.JButton jButton1GerarRF3;
    private javax.swing.JButton jButton1GerarRF4;
    private javax.swing.JButton jButton1RelatorioItem;
    private javax.swing.JMenu jMenu1Locacao;
    private javax.swing.JMenu jMenu1Sair;
    private javax.swing.JMenu jMenu2Cadastro;
    private javax.swing.JMenuBar jMenuBar1TelaPrincipal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1Alugar;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem2Ator;
    private javax.swing.JMenuItem jMenuItem2Consulta;
    private javax.swing.JPanel jPanel1Principal;
    // End of variables declaration//GEN-END:variables
}
