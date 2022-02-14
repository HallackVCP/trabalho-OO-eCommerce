/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ecommerce.projeto.view;

import br.com.ecommerce.projeto.controller.ProdutoController;
import br.com.ecommerce.projeto.model.domain.Produto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author vinib
 */
public class telaGerenteProduto extends javax.swing.JFrame {

    /**
     * Creates new form telaProdutoGerente
     */
    public telaGerenteProduto() throws IOException {
        initComponents();
        setLocationRelativeTo(this);
        addAll();
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
        btEditar = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbProduto = new javax.swing.JLabel();
        tfProduto = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        lbValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGerenteProduto = new javax.swing.JTable();
        btRemoverTodos = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(790, 660));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(670, 410));
        jPanel1.setMinimumSize(new java.awt.Dimension(790, 660));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 660));

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btEditarActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btAdd.setText("Adicionar");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btAddActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btRemoverActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        lbProduto.setText("Produto");

        lbCodigo.setText("Codigo");

        lbQuantidade.setText("Quantidade");

        lbValor.setText("Valor");

        tbGerenteProduto.setBackground(new java.awt.Color(204, 204, 204));
        tbGerenteProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Codigo", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGerenteProduto.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(tbGerenteProduto);

        btRemoverTodos.setText("Remover todos");
        btRemoverTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btRemoverTodosActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProduto)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigo)
                    .addComponent(tfQuantidade)
                    .addComponent(lbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbQuantidade)
                    .addComponent(btRemoverTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbProduto)
                        .addGap(6, 6, 6)
                        .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbCodigo)
                        .addGap(6, 6, 6)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbQuantidade)
                        .addGap(6, 6, 6)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbValor)
                        .addGap(6, 6, 6)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(btRemoverTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltar)
                        .addGap(42, 42, 42)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_btAddActionPerformed
        String codigo = tfCodigo.getText();
        String prod = tfProduto.getText();
        verificaCampoValor(tfValor.getText());
        verificaCampoQtd(tfQuantidade.getText());
        verificaCampoProduto(prod);
        verificaCampoCodigo(codigo);
        double valor = Double.parseDouble(tfValor.getText());
        int qtd = Integer.parseInt(tfQuantidade.getText());
        Produto produto = new Produto(prod, codigo, valor, qtd);
        ProdutoController controller = new ProdutoController();
        controller.save(produto);
        DefaultTableModel model = (DefaultTableModel) tbGerenteProduto.getModel();
        model.addRow(new Object[]{produto.getNome(), produto.getCodigoProduto(),
                produto.getQtd(),produto.getPreco()});

    }//GEN-LAST:event_btAddActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_btRemoverActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbGerenteProduto.getModel();
        Object data = model.getDataVector().elementAt(tbGerenteProduto.getSelectedRow());
        String[] dados = data.toString().split(",");
        String prod = dados[0];
        String cod = dados[1];
        verificaCampoQtd(dados[2]);
        verificaCampoValor(dados[3]);
        double valor = Double.parseDouble(dados[3]);
        int qtd = Integer.parseInt(dados[2]);
        Produto produto = new Produto(prod, cod, valor, qtd);
        ProdutoController controller = new ProdutoController();
        controller.delete(produto);
        model.removeRow(tbGerenteProduto.getSelectedRow());
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_btEditarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbGerenteProduto.getModel();
        Object data = model.getDataVector().elementAt(tbGerenteProduto.getSelectedRow());
        String[] dados = data.toString().split(",");
        String prod = dados[0];
        String cod = dados[1];
        verificaCampoQtd(dados[2]);
        verificaCampoValor(dados[3]);
        double valor = Double.parseDouble(dados[3]);
        int qtd = Integer.parseInt(dados[2]);
        Produto produto = new Produto(prod, cod, valor, qtd);
        ProdutoController controller = new ProdutoController();
        controller.update(produto);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btRemoverTodosActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_btRemoverTodosActionPerformed
        ProdutoController controller = new ProdutoController();
        controller.deleteAll();
        DefaultTableModel model = (DefaultTableModel) tbGerenteProduto.getModel();
        for(int i =0; i<model.getRowCount(); i++){
            model.removeRow(i);
        }

    }//GEN-LAST:event_btRemoverTodosActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        telaOpcoesGerente tela = new telaOpcoesGerente();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void verificaCampoProduto(String var){
        if(var.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Produto vazio!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Campo Produto Preenchido com sucesso!");
        }
    }

    private void verificaCampoCodigo(String var){

        if(var.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Codigo vazio!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Campo Codigo Preenchido com sucesso!");
        }
    }
    private void verificaCampoValor(String var){
        try{
            Double.parseDouble(var);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Campo valor preenchido de forma invalida!");
        }
    }
    private void verificaCampoQtd(String var){
        try{
            Integer.parseInt(var);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Campo quantidade preenchido de forma invalida!");
        }
    }

    private void addAll() throws IOException {
        ProdutoController controller = new ProdutoController();
        List<Produto> produtos = controller.findAll();
        DefaultTableModel model = (DefaultTableModel) tbGerenteProduto.getModel();
        for (Produto produto:
             produtos) {
            model.addRow(new Object[]{produto.getNome(), produto.getCodigoProduto(),
                    produto.getQtd(), produto.getPreco()});
        }
    }

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
            java.util.logging.Logger.getLogger(telaGerenteProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGerenteProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGerenteProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGerenteProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new telaGerenteProduto().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btRemoverTodos;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTable tbGerenteProduto;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
