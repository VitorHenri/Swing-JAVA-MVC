/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import locadora.controller.ItemController;
import locadora.controller.SMSSendController;
import locadora.model.Item;


/**
 *
 * @author Usuario
 */
public class TelaItemAlugado extends javax.swing.JFrame {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    TelaConfiguracaoSistema config = null;
    Color bg = null;
    /**
     * Creates new form TelaItemAlugado
     */
    public TelaItemAlugado() {
        initComponents();
        config = new TelaConfiguracaoSistema();
    }

    public void buscarItem(String titulo){
        jTextField2Filme.setText(titulo);
    }
    
    public void buscarCliente(String nome){
        jTextField1Cliente.setText(nome);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1ItensAlugaods = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1Cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2Filme = new javax.swing.JTextField();
        jButton1Buscar = new javax.swing.JButton();
        jButton1BuscarItem = new javax.swing.JButton();
        jButton2BuscarFilme = new javax.swing.JButton();
        jButton1apagai = new javax.swing.JButton();
        jButton2apagac = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4Registros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/camera.png"))); // NOI18N
        jLabel1.setText("Itens Alugados");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jTable1ItensAlugaods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Item", "Filme", "Código Cliente", "Cliente", "Data Devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1ItensAlugaods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1ItensAlugaodsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1ItensAlugaods);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente:");
        jLabel2.setToolTipText("");

        jTextField1Cliente.setEnabled(false);
        jTextField1Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filme:");

        jTextField2Filme.setEnabled(false);

        jButton1Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton1Buscar.setText("Buscar");
        jButton1Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BuscarActionPerformed(evt);
            }
        });

        jButton1BuscarItem.setText("Buscar Item");
        jButton1BuscarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BuscarItemActionPerformed(evt);
            }
        });

        jButton2BuscarFilme.setText("Buscar Cliente");
        jButton2BuscarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BuscarFilmeActionPerformed(evt);
            }
        });

        jButton1apagai.setText("...");
        jButton1apagai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1apagaiActionPerformed(evt);
            }
        });

        jButton2apagac.setText("...");
        jButton2apagac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2apagacActionPerformed(evt);
            }
        });

        jLabel4Registros.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4Registros.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2Filme, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(jTextField1Cliente))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2BuscarFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1BuscarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1apagai, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2apagac, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2Filme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1BuscarItem)
                            .addComponent(jButton1apagai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2BuscarFilme)
                            .addComponent(jButton2apagac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButton1BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BuscarActionPerformed
        ItemController ic = new ItemController();
        ArrayList<Item> itens = new ArrayList<>();
        jProgressBar1.setBackground(Color.GREEN);
        for(int i =0;i<100;i++){
            jProgressBar1.setValue(i);
            jProgressBar1.setString(i+" %");
            try{
            Thread.sleep(3);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        try{
        itens = ic.consultaItensAlugados(jTextField1Cliente.getText(), jTextField2Filme.getText());
        DefaultTableModel tableModel = (DefaultTableModel) jTable1ItensAlugaods.getModel();
        tableModel.setRowCount(0);
        itens.forEach((Item item)->{
            tableModel.addRow(new Object[]{
                item.getCodItem(),
                item.getFilme().getTitulo(),
                item.getCliente().getCodCliente(),
                item.getCliente().getNome(),
                sdf.format(item.getDateDevolucao())
            });
        });
        
        if(config!=null){
                String cor = config.getCorAtrasado();
                if(cor.equals("Amarelo")){
                    bg = Color.YELLOW;
                }else if (cor.equals("Vermelho")){
                    bg = Color.RED;
                }else if(cor.equals("Azul")){
                    bg = Color.BLUE;
                }
            }
        
         jTable1ItensAlugaods.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                Date dataDevolucao=null;
                try{
                dataDevolucao = sdf.parse((String)table.getValueAt(row, 4));
                }catch(Exception e){
                    e.printStackTrace();
                } 
                if(dataDevolucao.before(new Date()))
                    label.setBackground(bg);
                else{
                    label.setBackground(Color.WHITE);
                    label.setForeground(Color.BLACK);
                }
                return label;
                }
            });
        jLabel4Registros.setText(String.valueOf(jTable1ItensAlugaods.getRowCount()) + " Itens encontrados");
        jTable1ItensAlugaods.setModel(tableModel);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1BuscarActionPerformed

    private void jTextField1ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ClienteActionPerformed

    private void jButton1BuscarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BuscarItemActionPerformed
        TelaConsultaItem item = new TelaConsultaItem(this);
        this.setVisible(false);
        item.setVisible(true);
    }//GEN-LAST:event_jButton1BuscarItemActionPerformed

    private void jButton2BuscarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BuscarFilmeActionPerformed
        TelaConsultaCliente telaConsultaCliente = new TelaConsultaCliente(this);
        this.setVisible(false);
        telaConsultaCliente.setVisible(true);
    }//GEN-LAST:event_jButton2BuscarFilmeActionPerformed

    private void jButton2apagacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2apagacActionPerformed
        jTextField1Cliente.setText("");
    }//GEN-LAST:event_jButton2apagacActionPerformed

    private void jButton1apagaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1apagaiActionPerformed
        jTextField2Filme.setText("");
    }//GEN-LAST:event_jButton1apagaiActionPerformed

    private void jTable1ItensAlugaodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1ItensAlugaodsMouseClicked
        if(evt.getClickCount()==2){
            DefaultTableModel tableModel = (DefaultTableModel) jTable1ItensAlugaods.getModel();
            Integer codItem = (Integer)tableModel.getValueAt(jTable1ItensAlugaods.getSelectedRow(), 0);
            Date dataDevolucao =null;
            String[] ops = {"Dar Baixa no Item","Enviar SMS de Aviso"};
            try{
                dataDevolucao = sdf.parse((String)tableModel.getValueAt(jTable1ItensAlugaods.getSelectedRow(), 4));
                if(dataDevolucao.before(new Date())){
                    int resp = JOptionPane.showOptionDialog(rootPane, "Selecione uma das opções abaixo", "Atenção", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, ops, ops[0]);
                        if(resp==0){
                        ItemController ic = new ItemController();
                        boolean sucesso = ic.baixaItem(codItem);
                        if(sucesso){
                            JOptionPane.showMessageDialog(rootPane, "Baixa no item realizado com sucesso");
                            
                        }
                    }else if(resp==1){
                            SMSSendController.SendEmail((String)tableModel.getValueAt(jTable1ItensAlugaods.getSelectedRow(), 3),(String)tableModel.getValueAt(jTable1ItensAlugaods.getSelectedRow(), 4),(String)tableModel.getValueAt(jTable1ItensAlugaods.getSelectedRow(),1));
                            JOptionPane.showMessageDialog(rootPane, "Mensagem enviada com sucesso");
                    
                    }else{
                        //DO NOTHING
                    }
                }else{
                    int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja dar baixa no item?","Atenção",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
                    if(resp==0){
                        ItemController ic = new ItemController();
                        boolean sucesso = ic.baixaItem(codItem);
                        if(sucesso){
                            JOptionPane.showMessageDialog(rootPane, "Baixa no item realizado com sucesso");
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Falha ao dar baixa no item");
                        }
                    }
                }
                atualizaDados();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTable1ItensAlugaodsMouseClicked

   public void atualizaDados(){
        ItemController ic = new ItemController();
        ArrayList<Item> itens = new ArrayList<>();
        try{
        itens = ic.consultaItensAlugados(jTextField1Cliente.getText(), jTextField2Filme.getText());
        DefaultTableModel tableModel = (DefaultTableModel) jTable1ItensAlugaods.getModel();
        tableModel.setRowCount(0);
        itens.forEach((Item item)->{
            tableModel.addRow(new Object[]{
                item.getCodItem(),
                item.getFilme().getTitulo(),
                item.getCliente().getCodCliente(),
                item.getCliente().getNome(),
                sdf.format(item.getDateDevolucao())
            });
        });
        jLabel4Registros.setText(String.valueOf(jTable1ItensAlugaods.getRowCount()) + " Itens encontrados");
         jTable1ItensAlugaods.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                Date dataDevolucao=null;
                try{
                dataDevolucao = sdf.parse((String)table.getValueAt(row, 4));
                }catch(Exception e){
                    e.printStackTrace();
                } 
                if(dataDevolucao.before(new Date()))
                    label.setBackground(Color.red);
                else{
                    label.setBackground(Color.WHITE);
                    label.setForeground(Color.BLACK);
                }
                return label;
                }
            });
        jTable1ItensAlugaods.setModel(tableModel);
        }catch(Exception e){
            e.printStackTrace();
        }
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Buscar;
    private javax.swing.JButton jButton1BuscarItem;
    private javax.swing.JButton jButton1apagai;
    private javax.swing.JButton jButton2BuscarFilme;
    private javax.swing.JButton jButton2apagac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4Registros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1ItensAlugaods;
    private javax.swing.JTextField jTextField1Cliente;
    private javax.swing.JTextField jTextField2Filme;
    // End of variables declaration//GEN-END:variables

  
    
}
