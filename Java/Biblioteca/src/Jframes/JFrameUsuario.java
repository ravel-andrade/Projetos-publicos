/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;
import Classes.Biblioteca;
import Classes.GerenciadorDeArquivos;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author ravel
 */
public class JFrameUsuario extends javax.swing.JFrame {

   
    
    public JFrameUsuario() {
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

        ButtonRetiraLivros = new javax.swing.JButton();
        ButtonDevolveLivros = new javax.swing.JButton();
        ButtonDoarLivros = new javax.swing.JButton();
        jTextFieldNumeroLivroRetirada = new javax.swing.JTextField();
        jTextFieldNomeRetirante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNumeroLivroDevolucao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNomeLivroCadastro = new javax.swing.JTextField();
        jTextFieldAutorLivroCadastro = new javax.swing.JTextField();
        jTextFieldAnoLivroCadastro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumeroLivroDisponibilidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelNomeLivroDisponibilidade = new javax.swing.JLabel();
        jLabelDisponibilidadeLivroDisponibilidade = new javax.swing.JLabel();
        jButtonChecarDisponibilidade = new javax.swing.JButton();
        jLabelMensagemRetirarLivro = new javax.swing.JLabel();
        jLabelStatusDevolverLivro = new javax.swing.JLabel();
        jLabelStatusDoarLivro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonRetiraLivros.setText("Retirar livro");
        ButtonRetiraLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRetiraLivrosActionPerformed(evt);
            }
        });

        ButtonDevolveLivros.setText("Devolver livro");
        ButtonDevolveLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDevolveLivrosActionPerformed(evt);
            }
        });

        ButtonDoarLivros.setText("Doar livro");
        ButtonDoarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDoarLivrosActionPerformed(evt);
            }
        });

        jTextFieldNumeroLivroRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroLivroRetiradaActionPerformed(evt);
            }
        });

        jTextFieldNomeRetirante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeRetiranteActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero do livro:");

        jLabel2.setText("Nome de quem retira:");

        jLabel3.setText("Número do livro:");

        jTextFieldNumeroLivroDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroLivroDevolucaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome do livro:");

        jLabel5.setText("Autor do livro:");

        jLabel6.setText("Ano do livro:");

        jLabel7.setText("Número do livro:");

        jLabel8.setText("Disponibilidade:");

        jLabel9.setText("Nome do livro:");

        jButtonChecarDisponibilidade.setText("Checar disponibilidade");
        jButtonChecarDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChecarDisponibilidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumeroLivroRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumeroLivroDevolucao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeRetirante)
                                .addGap(25, 25, 25)
                                .addComponent(ButtonRetiraLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButtonDevolveLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldAutorLivroCadastro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldAnoLivroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNomeLivroCadastro)))
                                .addGap(175, 175, 175)
                                .addComponent(ButtonDoarLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumeroLivroDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelDisponibilidadeLivroDisponibilidade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelNomeLivroDisponibilidade)))
                                .addGap(154, 251, Short.MAX_VALUE)
                                .addComponent(jButtonChecarDisponibilidade)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabelMensagemRetirarLivro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabelStatusDevolverLivro)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelStatusDoarLivro)
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonRetiraLivros)
                    .addComponent(jTextFieldNumeroLivroRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeRetirante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabelMensagemRetirarLivro)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonDevolveLivros)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNumeroLivroDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabelStatusDevolverLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNomeLivroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAutorLivroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDoarLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAnoLivroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabelStatusDoarLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldNumeroLivroDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonChecarDisponibilidade))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabelNomeLivroDisponibilidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabelDisponibilidadeLivroDisponibilidade))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    
    GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos();
    Biblioteca bibliotecaExemplo = new Biblioteca();
    
    
    
    
    
    private void ButtonDevolveLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDevolveLivrosActionPerformed
        Integer numeroLivro =Integer.parseInt(this.jTextFieldNumeroLivroDevolucao.getText());
        this.jLabelStatusDevolverLivro.setText(bibliotecaExemplo.DevolverLivro(numeroLivro));
        gerenciador.salvarObjeto(bibliotecaExemplo);
    }//GEN-LAST:event_ButtonDevolveLivrosActionPerformed
    private void ButtonRetiraLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRetiraLivrosActionPerformed
        Integer numeroLivro =Integer.parseInt(this.jTextFieldNumeroLivroRetirada.getText());
        String NomeRetirante =this.jTextFieldNomeRetirante.getText();
        this.jLabelStatusDevolverLivro.setText(bibliotecaExemplo.RetirarLivro(numeroLivro, NomeRetirante));
        gerenciador.salvarObjeto(bibliotecaExemplo);
    }//GEN-LAST:event_ButtonRetiraLivrosActionPerformed

    private void jTextFieldNomeRetiranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeRetiranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeRetiranteActionPerformed

    private void jTextFieldNumeroLivroDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroLivroDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroLivroDevolucaoActionPerformed

    private void jTextFieldNumeroLivroRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroLivroRetiradaActionPerformed
        
        
    }//GEN-LAST:event_jTextFieldNumeroLivroRetiradaActionPerformed

    private void jButtonChecarDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChecarDisponibilidadeActionPerformed
        Integer numeroLivro =Integer.parseInt(this.jTextFieldNumeroLivroDisponibilidade.getText());
        
        this.jLabelDisponibilidadeLivroDisponibilidade.setText(bibliotecaExemplo.ChecarDisponibilidade(numeroLivro));
        this.jLabelNomeLivroDisponibilidade.setText(bibliotecaExemplo.getNomeLivro(numeroLivro));
        gerenciador.salvarObjeto(bibliotecaExemplo);
    }//GEN-LAST:event_jButtonChecarDisponibilidadeActionPerformed

    private void ButtonDoarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDoarLivrosActionPerformed
        Integer anoLivro =Integer.parseInt(this.jTextFieldAnoLivroCadastro.getText());
        String nomeEscritor =this.jTextFieldAutorLivroCadastro.getText();
        String tituloLivro =this.jTextFieldNomeLivroCadastro.getText();
        bibliotecaExemplo.DoarLivro(nomeEscritor, tituloLivro, anoLivro);
        gerenciador.salvarObjeto(bibliotecaExemplo);  
        
    }//GEN-LAST:event_ButtonDoarLivrosActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDevolveLivros;
    private javax.swing.JButton ButtonDoarLivros;
    private javax.swing.JButton ButtonRetiraLivros;
    private javax.swing.JButton jButtonChecarDisponibilidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDisponibilidadeLivroDisponibilidade;
    private javax.swing.JLabel jLabelMensagemRetirarLivro;
    private javax.swing.JLabel jLabelNomeLivroDisponibilidade;
    private javax.swing.JLabel jLabelStatusDevolverLivro;
    private javax.swing.JLabel jLabelStatusDoarLivro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldAnoLivroCadastro;
    private javax.swing.JTextField jTextFieldAutorLivroCadastro;
    private javax.swing.JTextField jTextFieldNomeLivroCadastro;
    private javax.swing.JTextField jTextFieldNomeRetirante;
    private javax.swing.JTextField jTextFieldNumeroLivroDevolucao;
    private javax.swing.JTextField jTextFieldNumeroLivroDisponibilidade;
    private javax.swing.JTextField jTextFieldNumeroLivroRetirada;
    // End of variables declaration//GEN-END:variables
}
