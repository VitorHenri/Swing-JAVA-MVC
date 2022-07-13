/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import locadora.controller.AtorController;
import locadora.model.Ator;

/**
 *
 * @author Usuario
 */
public class TelaConsutaAtor extends javax.swing.JFrame {
    private TelaCadastroAtor telaCadastroAtor;
    /**
     * Creates new form TelaConsutaAtor
     */
    public TelaConsutaAtor() {
        initComponents();
    }

    public TelaConsutaAtor(TelaCadastroAtor telaCadastroAtor){
        this.telaCadastroAtor = telaCadastroAtor;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1NomeAutor = new javax.swing.JTextField();
        jButton1ConsultarAtor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1ResultadoAtor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vídeo Locadora");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome Autor:");

        jTextField1NomeAutor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jButton1ConsultarAtor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton1ConsultarAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ConsultarAtorActionPerformed(evt);
            }
        });

        jTable1ResultadoAtor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Nacionalidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1ResultadoAtor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1ResultadoAtorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1ResultadoAtor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1NomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1ConsultarAtor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1NomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1ConsultarAtor)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/camera.png"))); // NOI18N
        jLabel1.setText("Consulta Ator");
        jLabel1.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        telaCadastroAtor.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ConsultarAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ConsultarAtorActionPerformed
        AtorController ac = new AtorController();
        ArrayList<Ator> atores = new ArrayList<>();
        try{
            atores = ac.consultaFilmes(jTextField1NomeAutor.getText());
            DefaultTableModel tableModel = (DefaultTableModel) jTable1ResultadoAtor.getModel();
            tableModel.setRowCount(0);
            atores.forEach((Ator ator)->{
                tableModel.addRow(new Object[]{
                    ator.getCodAtor(),
                    ator.getName(),
                    ator.getNacionalidade()
                });
            });
            jTable1ResultadoAtor.setModel(tableModel);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Contate o administrador, ERRO");
        }
    }//GEN-LAST:event_jButton1ConsultarAtorActionPerformed

    private void jTable1ResultadoAtorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1ResultadoAtorMouseClicked
        if(evt.getClickCount()==2){
            Integer id = (Integer) jTable1ResultadoAtor.getModel().getValueAt(jTable1ResultadoAtor.getSelectedRow(), 0);
            String  nome = (String) jTable1ResultadoAtor.getModel().getValueAt(jTable1ResultadoAtor.getSelectedRow(), 1);
            String nacionaliade = (String) jTable1ResultadoAtor.getModel().getValueAt(jTable1ResultadoAtor.getSelectedRow(), 2);
            telaCadastroAtor.buscarFilme(id, nome, nacionaliade);
            telaCadastroAtor.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jTable1ResultadoAtorMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ConsultarAtor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1ResultadoAtor;
    private javax.swing.JTextField jTextField1NomeAutor;
    // End of variables declaration//GEN-END:variables
}
