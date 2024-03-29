/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

import javax.swing.JOptionPane;
import locadora.controller.ItemController;

/**
 *
 * @author Usuario
 */
public class TelaCadastroItem extends javax.swing.JFrame {
    private Integer codFilme = 0;
    private Integer codItem=0;
    /**
     * Creates new form TelaCadastroItem
     */
    public TelaCadastroItem() {
        initComponents();
    }

    
    public void buscarItem(Integer codFilme,Integer codItem,String titulo,String tipo,Double preco){
       this.codItem = codItem;
       jTextField1Titulo.setText(titulo);
       for(int i=0;i<jComboBox1Tipo.getItemCount();i++){
           if(jComboBox1Tipo.getItemAt(i).equals(tipo)){
               jComboBox1Tipo.setSelectedIndex(i);
               break;
           }
       }
       jTextField1Preco.setText(preco.toString());
        jButton1Buscar.setEnabled(false);
        jButton1Salvar.setText("Atualizar");
        jLabel1.setText("Atualizar Item");
        jButton1Apagar.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1Titulo = new javax.swing.JTextField();
        jButton1Buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1Tipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1Salvar = new javax.swing.JButton();
        jButton2Limpar = new javax.swing.JButton();
        jButton3Cancelar = new javax.swing.JButton();
        jButton4Consultar = new javax.swing.JButton();
        jTextField1Preco = new javax.swing.JTextField();
        jButton1Apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jLabel1.setText("Cadastro de Item");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Titulo:");

        jTextField1Titulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField1Titulo.setEnabled(false);

        jButton1Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton1Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");

        jComboBox1Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo", "Blu-Ray Disc", "CD", "DVD" }));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Preço:");

        jButton1Salvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1Salvar.setText("Salvar");
        jButton1Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalvarActionPerformed(evt);
            }
        });

        jButton2Limpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2Limpar.setText("Limpar");

        jButton3Cancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton3Cancelar.setText("Cancelar");
        jButton3Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3CancelarActionPerformed(evt);
            }
        });

        jButton4Consultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton4Consultar.setText("Consultar");
        jButton4Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ConsultarActionPerformed(evt);
            }
        });

        jTextField1Preco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jButton1Apagar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1Apagar.setText("Apagar");
        jButton1Apagar.setEnabled(false);
        jButton1Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1Titulo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1Tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1Preco))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButton1Salvar)
                .addGap(18, 18, 18)
                .addComponent(jButton2Limpar)
                .addGap(18, 18, 18)
                .addComponent(jButton3Cancelar)
                .addGap(18, 18, 18)
                .addComponent(jButton4Consultar)
                .addGap(18, 18, 18)
                .addComponent(jButton1Apagar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1Buscar)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Salvar)
                    .addComponent(jButton2Limpar)
                    .addComponent(jButton3Cancelar)
                    .addComponent(jButton4Consultar)
                    .addComponent(jButton1Apagar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel1)
                .addContainerGap(328, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void buscarFilme(Integer codFilme,String nome){
        this.codFilme =codFilme;
        jTextField1Titulo.setText(nome);
     
    }
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaPrincipal p = new TelaPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jButton3CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3CancelarActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton3CancelarActionPerformed

    private void jButton1BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BuscarActionPerformed
        this.setVisible(false);
        TelaConsultaFilme telaConsultaFilme = new TelaConsultaFilme(this);
        telaConsultaFilme.setVisible(true);
    }//GEN-LAST:event_jButton1BuscarActionPerformed

    private void jButton4ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ConsultarActionPerformed
       TelaConsultaItem telaConsultaItem = new TelaConsultaItem(this);
       telaConsultaItem.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_jButton4ConsultarActionPerformed

    private void jButton1SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalvarActionPerformed
        ItemController ic = new ItemController();
        Double preco = Double.parseDouble(jTextField1Preco.getText().replace(",", "."));
        boolean sucesso;
        try{
            if(codItem==0){
            sucesso = ic.cadastrarItem(codFilme, jTextField1Titulo.getText(),(String)jComboBox1Tipo.getSelectedItem(),preco);
            if(sucesso)
                JOptionPane.showMessageDialog(rootPane, "Item cadastrado com sucesso");
            else
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar item, verifique os dados");
            }
            else{
                sucesso = ic.atualizaItem(codItem, jComboBox1Tipo.getSelectedItem().toString(), preco);
                if(sucesso){
                    JOptionPane.showMessageDialog(rootPane, "Item ATUALIZADO com sucesso");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Erro ao ATUALIZAR item, verifique os dados");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1SalvarActionPerformed

    private void jButton1ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ApagarActionPerformed
       try{
           ItemController ic = new ItemController();
           boolean sucesso;
           if(JOptionPane.showConfirmDialog(rootPane, "Tem certeze que deseja apagar esse item?", "Atenção", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION)==0){              
                sucesso = ic.deletarItem(codItem);
                    if(sucesso)
                        JOptionPane.showMessageDialog(rootPane, "Item deletado com sucesso");
                    else
                        JOptionPane.showMessageDialog(rootPane, "Falha ao deletar item");
               }
          
       }catch(Exception e){
           e.printStackTrace();
       }
       this.dispose();
    }//GEN-LAST:event_jButton1ApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Apagar;
    private javax.swing.JButton jButton1Buscar;
    private javax.swing.JButton jButton1Salvar;
    private javax.swing.JButton jButton2Limpar;
    private javax.swing.JButton jButton3Cancelar;
    private javax.swing.JButton jButton4Consultar;
    private javax.swing.JComboBox<String> jComboBox1Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1Preco;
    private javax.swing.JTextField jTextField1Titulo;
    // End of variables declaration//GEN-END:variables
}
