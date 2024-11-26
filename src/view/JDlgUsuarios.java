/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author alexl
 */
public class JDlgUsuarios extends javax.swing.JDialog {

    /**
     * Creates new form JDlgUsuarios
     *
     *
     *
     */
    private MaskFormatter mascaraCpfFormatter, mackaraData;

    public JDlgUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro");
        setLocationRelativeTo(null);

        Util.habilitar(false, jTxtCodico_afl, jTxtNome_afl, jTxtApelido_afl, jFmtCpf_afl,
                jFmtData_nascimento_afl, jCboMostrarS, jCboNivel_afl, jChbAtivo_afl,
                jPwfSenha_afl, jBtnConfimar, jBtnCancelar);
        try {
            mascaraCpfFormatter = new MaskFormatter("###.###.###-##");
            mackaraData = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf_afl.setFormatterFactory(new DefaultFormatterFactory(mascaraCpfFormatter));
        jFmtData_nascimento_afl.setFormatterFactory(new DefaultFormatterFactory(mackaraData));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtNome_afl = new javax.swing.JTextField();
        jTxtApelido_afl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFmtCpf_afl = new javax.swing.JFormattedTextField();
        jFmtData_nascimento_afl = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPwfSenha_afl = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jCboNivel_afl = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jChbAtivo_afl = new javax.swing.JCheckBox();
        jTxtCodico_afl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfimar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jCboMostrarS = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jTxtApelido_afl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApelido_aflActionPerformed(evt);
            }
        });

        jLabel2.setText("Apelido");

        jFmtCpf_afl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCpf_aflActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        jLabel4.setText("Nascimento");

        jPwfSenha_afl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwfSenha_aflActionPerformed(evt);
            }
        });

        jLabel5.setText("Senha");

        jCboNivel_afl.setEditable(true);
        jCboNivel_afl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convidado", "Funcionário", "Administrador" }));
        jCboNivel_afl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboNivel_aflActionPerformed(evt);
            }
        });

        jLabel6.setText("Nivel");

        jChbAtivo_afl.setText("Ativo");

        jTxtCodico_afl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodico_aflActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo");

        jBtnIncluir.setBackground(new java.awt.Color(153, 255, 255));
        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/Excluir_1.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfimar.setBackground(new java.awt.Color(51, 255, 0));
        jBtnConfimar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/confirmar.png"))); // NOI18N
        jBtnConfimar.setText("Confimar");
        jBtnConfimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfimarActionPerformed(evt);
            }
        });

        jBtnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setBackground(new java.awt.Color(102, 255, 255));
        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jCboMostrarS.setText("Mostrar Senha");
        jCboMostrarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/icons8-visível-24.png"))); // NOI18N
        jCboMostrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboMostrarSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnConfimar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPesquisar))
                    .addComponent(jCboMostrarS)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtCodico_afl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTxtNome_afl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTxtApelido_afl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFmtCpf_afl, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                    .addComponent(jPwfSenha_afl))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(97, 97, 97)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCboNivel_afl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jChbAtivo_afl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jFmtData_nascimento_afl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodico_afl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNome_afl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtApelido_afl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtCpf_afl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtData_nascimento_afl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPwfSenha_afl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboNivel_afl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChbAtivo_afl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCboMostrarS)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfimar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(16, 16, 16))
        );

        jCboNivel_afl.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtApelido_aflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApelido_aflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApelido_aflActionPerformed

    private void jCboNivel_aflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboNivel_aflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboNivel_aflActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTxtCodico_aflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodico_aflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodico_aflActionPerformed

    private void jFmtCpf_aflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCpf_aflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCpf_aflActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jTxtCodico_afl, jTxtNome_afl, jTxtApelido_afl, jFmtCpf_afl, jFmtData_nascimento_afl, jCboMostrarS,
                jCboNivel_afl, jChbAtivo_afl,
                jPwfSenha_afl, jBtnConfimar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

        Util.limpar(jTxtCodico_afl, jTxtNome_afl, jTxtApelido_afl, jFmtCpf_afl, jFmtData_nascimento_afl, jCboMostrarS,
                jCboNivel_afl, jChbAtivo_afl,
                jPwfSenha_afl);

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:

        jTxtCodico_afl.grabFocus();
        Util.habilitar(true, jTxtCodico_afl, jTxtNome_afl, jTxtApelido_afl, jFmtCpf_afl, jFmtData_nascimento_afl, jCboMostrarS,
                jCboNivel_afl, jChbAtivo_afl,
                jPwfSenha_afl, jBtnConfimar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limpar(jTxtCodico_afl, jTxtNome_afl, jTxtApelido_afl, jFmtCpf_afl, jFmtData_nascimento_afl, jCboMostrarS,
                jCboNivel_afl, jChbAtivo_afl,
                jPwfSenha_afl);
        jTxtCodico_afl.grabFocus();
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnConfimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfimarActionPerformed
        // TODO add your handling code here:

        Util.habilitar(false, jTxtCodico_afl, jTxtNome_afl, jTxtApelido_afl, jFmtCpf_afl, jFmtData_nascimento_afl, jCboMostrarS,
                jCboNivel_afl, jChbAtivo_afl,
                jPwfSenha_afl, jBtnConfimar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

        Util.limpar(jTxtCodico_afl, jTxtNome_afl, jTxtApelido_afl, jFmtCpf_afl, jFmtData_nascimento_afl, jCboMostrarS,
                jCboNivel_afl, jChbAtivo_afl,
                jPwfSenha_afl);

    }//GEN-LAST:event_jBtnConfimarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:

        int confimEx = JOptionPane.showConfirmDialog(null, "Confirmar Exclusão !", "Deletar registro", JOptionPane.YES_NO_OPTION);

        Util.limpar(jTxtCodico_afl, jTxtNome_afl, jTxtApelido_afl, jFmtCpf_afl, jFmtData_nascimento_afl, jCboMostrarS,
                jCboNivel_afl, jChbAtivo_afl,
                jPwfSenha_afl);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed

        JDlgUsuariosPesquisar jdlgUserSearch = new JDlgUsuariosPesquisar(null, true);
        jdlgUserSearch.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed


    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:

        Util.habilitar(true, jTxtCodico_afl, jTxtNome_afl, jTxtApelido_afl, jFmtCpf_afl, jFmtData_nascimento_afl, jCboMostrarS, jCboNivel_afl, jChbAtivo_afl,
                jPwfSenha_afl, jBtnConfimar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnExcluir, jBtnPesquisar, jBtnAlterar);


    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jPwfSenha_aflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwfSenha_aflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwfSenha_aflActionPerformed

    private void jCboMostrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboMostrarSActionPerformed
        // TODO add your handling code here:

        if (jCboMostrarS.isSelected() == true) {
            jPwfSenha_afl.setEchoChar((char) 0);
        } else {
            jPwfSenha_afl.setEchoChar('*');
        }
    }//GEN-LAST:event_jCboMostrarSActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgUsuarios dialog = new JDlgUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfimar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JCheckBox jCboMostrarS;
    private javax.swing.JComboBox<String> jCboNivel_afl;
    private javax.swing.JCheckBox jChbAtivo_afl;
    private javax.swing.JFormattedTextField jFmtCpf_afl;
    private javax.swing.JFormattedTextField jFmtData_nascimento_afl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPwfSenha_afl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtApelido_afl;
    private javax.swing.JTextField jTxtCodico_afl;
    private javax.swing.JTextField jTxtNome_afl;
    // End of variables declaration//GEN-END:variables
}
