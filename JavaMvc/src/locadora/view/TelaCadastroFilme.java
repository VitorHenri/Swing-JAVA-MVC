/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import locadora.controller.FilmeController;
import locadora.util.SistemaUtil;

/**
 *
 * @author Usuario
 */
public class TelaCadastroFilme extends javax.swing.JFrame implements SistemaUtil {
    
    private Integer codFilme = 0;
    
    /**
     * Creates new form TelaCadastroFilme
     */
    public TelaCadastroFilme() {
        initComponents();
    }
    
    public void buscarFilme(Integer codFilme,String titulo,String genero,String sinopse,Integer duracao){
        this.codFilme = codFilme;
        jTextField1Titulo.setText(titulo);
        for(int contador = 0; contador<jComboBox1Genero.getItemCount();contador++){
            if(jComboBox1Genero.getItemAt(contador).equals(genero))
                jComboBox1Genero.setSelectedIndex(contador);      
        }
        jSpinner1Duracao.setValue(duracao);
        jTextPane1Sinopse.setText(sinopse);
        jLabel1.setText("Atualizar dados do Filme");
        jButton2Limpar.setEnabled(false);
        jButton1Apagar.setEnabled(true);
        JOptionPane.showMessageDialog(rootPane, "Atualize os dados desse filme!");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1Genero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1Sinopse = new javax.swing.JTextPane();
        jSpinner1Duracao = new javax.swing.JSpinner();
        jButton1Salvar = new javax.swing.JButton();
        jButton2Limpar = new javax.swing.JButton();
        jButton3Cancelar = new javax.swing.JButton();
        jButton4Consultar = new javax.swing.JButton();
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
        jLabel1.setText("Cadastro de Filme");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Título:");

        jTextField1Titulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gênero:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sinopse:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Duração:");

        jComboBox1Genero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um gênero", "Ação", "Animação", "Aventura", "Cinema de arte", "Chanchada", "Comédia", "Comédia romântica", "Comédia dramática", "Comédia de ação", "Dança", "Documentário", "Docuficção", "Drama", "Espionagem", "Faroeste", "Fantasia científica", "Ficção científica", "Filmes de guerra", "Musical", "Filme policial", "Romance", "Seriado", "Suspense", "Terror" }));

        jScrollPane1.setViewportView(jTextPane1Sinopse);

        jSpinner1Duracao.setModel(new javax.swing.SpinnerNumberModel(20, 20, 300, 20));

        jButton1Salvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1Salvar.setText("Salvar");
        jButton1Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalvarActionPerformed(evt);
            }
        });

        jButton2Limpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2Limpar.setText("Limpar");
        jButton2Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LimparActionPerformed(evt);
            }
        });

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
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton1Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2Limpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3Cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4Consultar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1Apagar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                        .addComponent(jComboBox1Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner1Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Salvar)
                    .addComponent(jButton2Limpar)
                    .addComponent(jButton3Cancelar)
                    .addComponent(jButton4Consultar)
                    .addComponent(jButton1Apagar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalvarActionPerformed
        int duracao = Integer.parseInt(jSpinner1Duracao.getValue().toString());
        String genero = jComboBox1Genero.getSelectedIndex()==0?null:jComboBox1Genero.getSelectedItem().toString();
        boolean sucesso;
        try{
        FilmeController fc = new FilmeController();
        if(codFilme==0){
        sucesso = fc.cadastrarFilme(jTextField1Titulo.getText(), genero, jTextPane1Sinopse.getText(), duracao);
        if(sucesso)
            JOptionPane.showMessageDialog(rootPane, "Filme cadastrado com sucesso");
        else
            JOptionPane.showMessageDialog(rootPane, "Alguns Campos não foram preenchidos");
        }else{
            sucesso = fc.atualizarFilme(codFilme,jTextField1Titulo.getText(), genero, jTextPane1Sinopse.getText(), duracao);
            if(sucesso)
            JOptionPane.showMessageDialog(rootPane, "Filme ATUALIZADO com sucesso");
            else
            JOptionPane.showMessageDialog(rootPane, "Alguns Campos não foram preenchidos");
        }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1SalvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaPrincipal p = new TelaPrincipal();
        p.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButton2LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LimparActionPerformed
        limpaTela();
    }//GEN-LAST:event_jButton2LimparActionPerformed

    private void jButton4ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ConsultarActionPerformed
        TelaConsultaFilme telaConsultaFilme = new TelaConsultaFilme(this);
        telaConsultaFilme.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ConsultarActionPerformed

    private void jButton3CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3CancelarActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton3CancelarActionPerformed

    private void jButton1ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ApagarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir esse registro?","Atenção", JOptionPane.OK_OPTION,JOptionPane.CANCEL_OPTION);
        if(resposta==0){
        FilmeController fc = new FilmeController();
        boolean sucesso;
        try{
            sucesso = fc.apagarFilme(codFilme);
            if(sucesso)
                JOptionPane.showMessageDialog(rootPane, "Filme apagado!");
            else
                JOptionPane.showMessageDialog(rootPane, "Erro ao apagar filme");
        }catch(Exception e){
            e.printStackTrace();
        }
        this.dispose();
        }
    }//GEN-LAST:event_jButton1ApagarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Apagar;
    private javax.swing.JButton jButton1Salvar;
    private javax.swing.JButton jButton2Limpar;
    private javax.swing.JButton jButton3Cancelar;
    private javax.swing.JButton jButton4Consultar;
    private javax.swing.JComboBox<String> jComboBox1Genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1Duracao;
    private javax.swing.JTextField jTextField1Titulo;
    private javax.swing.JTextPane jTextPane1Sinopse;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpaTela() {
        jTextField1Titulo.setText("");
        jComboBox1Genero.setSelectedIndex(0);
        jTextPane1Sinopse.setText("");
        
        
    }
}