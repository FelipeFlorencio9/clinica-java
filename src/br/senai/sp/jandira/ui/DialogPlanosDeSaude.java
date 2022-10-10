/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

/**
 *
 * @author 22282108
 */
public class DialogPlanosDeSaude extends javax.swing.JDialog {

    /**
     * Creates new form DialogPlanosDeSaude
     */
    public DialogPlanosDeSaude(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        panelApp = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelHome = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        labelTipoDoPlano = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelTipoDaOperadora = new javax.swing.JLabel();
        textFieldCodigo1 = new javax.swing.JTextField();
        textFieldCodigo2 = new javax.swing.JTextField();
        textFieldCodigo3 = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelApp.setBackground(new java.awt.Color(255, 255, 255));
        panelApp.setToolTipText("");
        panelApp.setLayout(null);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        panelApp.add(labelIcon);
        labelIcon.setBounds(50, 0, 40, 90);

        labelHome.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        labelHome.setForeground(new java.awt.Color(51, 153, 255));
        labelHome.setText("Planos de Saúde - Adicionar");
        panelApp.add(labelHome);
        labelHome.setBounds(110, 20, 510, 60);

        getContentPane().add(panelApp);
        panelApp.setBounds(0, 0, 660, 90);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        labelTipoDoPlano.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelTipoDoPlano.setForeground(new java.awt.Color(51, 153, 255));
        labelTipoDoPlano.setText("Tipo do plano");
        panelHome.add(labelTipoDoPlano);
        labelTipoDoPlano.setBounds(60, 220, 250, 30);

        labelCodigo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo.setText("Código");
        panelHome.add(labelCodigo);
        labelCodigo.setBounds(60, 40, 250, 30);

        labelTipoDaOperadora.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelTipoDaOperadora.setForeground(new java.awt.Color(51, 153, 255));
        labelTipoDaOperadora.setText("Tipo da operadora");
        panelHome.add(labelTipoDaOperadora);
        labelTipoDaOperadora.setBounds(60, 130, 250, 30);

        textFieldCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigo1ActionPerformed(evt);
            }
        });
        panelHome.add(textFieldCodigo1);
        textFieldCodigo1.setBounds(70, 250, 240, 30);

        textFieldCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigo2ActionPerformed(evt);
            }
        });
        panelHome.add(textFieldCodigo2);
        textFieldCodigo2.setBounds(70, 70, 100, 30);

        textFieldCodigo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigo3ActionPerformed(evt);
            }
        });
        panelHome.add(textFieldCodigo3);
        textFieldCodigo3.setBounds(70, 160, 240, 30);

        buttonCancelar.setBackground(new java.awt.Color(153, 204, 255));
        buttonCancelar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/saida.png"))); // NOI18N
        buttonCancelar.setText("Voltar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelHome.add(buttonCancelar);
        buttonCancelar.setBounds(470, 330, 130, 45);

        buttonSalvar.setBackground(new java.awt.Color(153, 204, 255));
        buttonSalvar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pasta.png"))); // NOI18N
        buttonSalvar.setText("Salvar");
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelHome.add(buttonSalvar);
        buttonSalvar.setBounds(340, 330, 120, 45);

        getContentPane().add(panelHome);
        panelHome.setBounds(20, 100, 620, 390);

        setBounds(0, 0, 678, 558);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigo1ActionPerformed

    private void textFieldCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigo2ActionPerformed

    private void textFieldCodigo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigo3ActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogPlanosDeSaude dialog = new DialogPlanosDeSaude(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTipoDaOperadora;
    private javax.swing.JLabel labelTipoDoPlano;
    private javax.swing.JPanel panelApp;
    private javax.swing.JPanel panelHome;
    private javax.swing.JTextField textFieldCodigo1;
    private javax.swing.JTextField textFieldCodigo2;
    private javax.swing.JTextField textFieldCodigo3;
    // End of variables declaration//GEN-END:variables
}
