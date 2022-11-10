package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {
    int linha;
    public PanelMedico() {
        initComponents();
        criarTableMedico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTable = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        buttonEditarMedico = new javax.swing.JButton();
        buttonDeletarMedico = new javax.swing.JButton();
        labelTableNome = new javax.swing.JLabel();

        setLayout(null);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTable.setViewportView(tableMedico);

        add(scrollTable);
        scrollTable.setBounds(20, 40, 870, 280);

        buttonEditarMedico.setBackground(new java.awt.Color(153, 204, 255));
        buttonEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png"))); // NOI18N
        buttonEditarMedico.setToolTipText("Editar plano de saúde selecionado.");
        buttonEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicoActionPerformed(evt);
            }
        });
        add(buttonEditarMedico);
        buttonEditarMedico.setBounds(730, 340, 70, 50);

        buttonDeletarMedico.setBackground(new java.awt.Color(153, 204, 255));
        buttonDeletarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete.png"))); // NOI18N
        buttonDeletarMedico.setToolTipText("Excluir plano de saúde selecionado.");
        buttonDeletarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarMedicoActionPerformed(evt);
            }
        });
        add(buttonDeletarMedico);
        buttonDeletarMedico.setBounds(650, 340, 70, 50);

        labelTableNome.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        labelTableNome.setText("Médicos");
        add(labelTableNome);
        labelTableNome.setBounds(40, 0, 210, 30);
    }// </editor-fold>//GEN-END:initComponents
    private void criarTableMedico() {
        tableMedico.setModel(MedicoDAO.getTableModel());
        
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(300);
        
        tableMedico.getTableHeader().setReorderingAllowed(false);

       
        tableMedico.setDefaultEditor(Object.class, null);
    }
    private void buttonEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicoActionPerformed
//
//        linha = tableMedico.getSelectedRow();
//
//        if (linha != -1) {
//            editar();
//        } else {
//            JOptionPane.showMessageDialog(
//                this,
//                "Por favor, selecione um plano de saúde para alterar.",
//                "Planos de Saúde",
//                JOptionPane.WARNING_MESSAGE);
//        };
    }//GEN-LAST:event_buttonEditarMedicoActionPerformed

    private void buttonDeletarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarMedicoActionPerformed
        //Obtemos o indice da linha selecionada na tabela
        linha = tableMedico.getSelectedRow();

        //Verificamos se a linha é diferente de -1
        //-1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showConfirmDialog(
                this,
                "Por favor, selecione o plano que você deseja excluir!",
                "Plano de saúde",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonDeletarMedicoActionPerformed
    private void excluir() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você tem certeza que quer excluir o item selecionado?",
                "Especialidade",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(resposta);
        
        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
            criarTableMedico();
        }
    }
     private Integer getCodigo(){
            String codigoStr = tableMedico.getValueAt(linha, 0).toString();
            return Integer.valueOf(codigoStr);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDeletarMedico;
    private javax.swing.JButton buttonEditarMedico;
    private javax.swing.JLabel labelTableNome;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables
}
