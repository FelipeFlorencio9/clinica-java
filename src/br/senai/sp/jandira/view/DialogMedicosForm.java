package br.senai.sp.jandira.view;

import br.senai.sp.jandira.controller.IController;
import br.senai.sp.jandira.controller.MedicoController;
import br.senai.sp.jandira.model.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.dao.MedicoDAO;
import br.senai.sp.jandira.model.entity.Especialidade;
import br.senai.sp.jandira.model.entity.Medico;
import br.senai.sp.jandira.model.entity.TipoOperacao;


//import br.senai.sp.jandira.model.dao.EspecialidadeDAO;
//import br.senai.sp.jandira.model.dao.MedicoDAO;
//import br.senai.sp.jandira.model.entity.Especialidade;
//import br.senai.sp.jandira.model.entity.Medico;
//import br.senai.sp.jandira.model.entity.TipoOperacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DialogMedicosForm extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;

    private DefaultListModel<String> especialidadesListModel = new DefaultListModel();
    private ArrayList<Especialidade> nomeDasEspecialidades = new ArrayList<>();
    private List<String> selecionadas;
    private DefaultListModel especialidadesSelecionadasModel = new DefaultListModel();
    private ArrayList<Especialidade> especialidadesSelecionadas = new ArrayList<>();
  
    public DialogMedicosForm(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        carregarTodasAsEspecialidades();

        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    private void preencherFormulario() {
        textFieldCodigo.setText(medico.getCodigo().toString());
        textFieldCrm.setText(medico.getCrm());
        textFieldNomeDoMedico.setText(medico.getNome());
        textFieldEmail.setText(medico.getEmail());
        textFieldDataDeNascimento.setText(medico.getDataDeNascimento());
        textFieldTelefone.setText(medico.getTelefone());
        adicionarEspecialidadesDoMedicoAoModelo();
        refazerModelo();
        labelHome.setText("M??dicos - " + tipoOperacao);
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png")));
    }
    private void adicionarEspecialidadesDoMedicoAoModelo(){
 
        especialidadesSelecionadasModel.clear();
        especialidadesSelecionadasModel.addAll(medico.getEspecialidades());
        for(Especialidade e : medico.getEspecialidades()){
            System.out.println(e.getNome());
        }
        
       
    }
    private void carregarTodasAsEspecialidades() {
        carregarEspecialidadesDoBanco();
//      carregarEspecialidadesDoMedico(medico.getCodigoInterno());

//      especialidadesSelecionadasModel.clear();
//        
////      String[] especialidadesDoMedico = MedicoDAO.getEspecialidadesDoMedico();
//        jListSelecionados.setModel(especialidadesSelecionadasModel);
        }
    private void carregarEspecialidadesDoBanco(){
        
        for(Especialidade e : EspecialidadeDAO.getListaDeEspecialidades()){
            nomeDasEspecialidades.add(e);
        }
        for(Especialidade e : nomeDasEspecialidades){
            especialidadesListModel.addElement(e.getCodigo().toString() + " - " + e.getNome());
        }
        limparModels();
        jListEspecialidades.setModel(especialidadesListModel);
    }
    
    public String getTextFieldCRM(){
        return textFieldCrm.toString();
    }
    public String getTextFieldNomeDoMedico(){
        return textFieldNomeDoMedico.toString();
    }
    public String getTextFieldTelefone(){
        return textFieldTelefone.toString();
    }
    public String getTextFieldEmail(){
        return textFieldEmail.toString();
    }
    public String getTextFieldDataDeNascimento(){
        return textFieldDataDeNascimento.toString();
    }
    public ArrayList<Especialidade> getEspecialidadesSelecionadas(){
        return especialidadesSelecionadas;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelApp = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelHome = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        textFieldCrm = new javax.swing.JTextField();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldNomeDoMedico = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSelecionados = new javax.swing.JList<>();
        labelCodigo1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEspecialidades = new javax.swing.JList<>();
        labelCodigo3 = new javax.swing.JLabel();
        labelCodigo4 = new javax.swing.JLabel();
        labelCodigo5 = new javax.swing.JLabel();
        labelCodigo6 = new javax.swing.JLabel();
        textFieldDataDeNascimento = new javax.swing.JTextField();
        labelCodigo7 = new javax.swing.JLabel();
        labelCodigo8 = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        labelCodigo9 = new javax.swing.JLabel();
        jButtonRemoverEspecialidade = new javax.swing.JButton();
        jButtonAdicionarEspecialidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelApp.setBackground(new java.awt.Color(255, 255, 255));
        panelApp.setToolTipText("");
        panelApp.setLayout(null);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        panelApp.add(labelIcon);
        labelIcon.setBounds(60, 0, 40, 90);

        labelHome.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        labelHome.setForeground(new java.awt.Color(51, 153, 255));
        labelHome.setText("M??dico - Adicionar");
        panelApp.add(labelHome);
        labelHome.setBounds(110, 20, 510, 60);

        getContentPane().add(panelApp);
        panelApp.setBounds(0, 0, 680, 90);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        textFieldCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCrmActionPerformed(evt);
            }
        });
        panelHome.add(textFieldCrm);
        textFieldCrm.setBounds(120, 40, 100, 30);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelHome.add(textFieldCodigo);
        textFieldCodigo.setBounds(30, 40, 70, 30);

        textFieldNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDoMedicoActionPerformed(evt);
            }
        });
        panelHome.add(textFieldNomeDoMedico);
        textFieldNomeDoMedico.setBounds(240, 40, 330, 30);

        buttonCancelar.setBackground(new java.awt.Color(153, 204, 255));
        buttonCancelar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/saida.png"))); // NOI18N
        buttonCancelar.setText("Voltar");
        buttonCancelar.setToolTipText("Voltar ?? tela anterior.");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelHome.add(buttonCancelar);
        buttonCancelar.setBounds(480, 360, 130, 45);

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
        buttonSalvar.setBounds(340, 360, 130, 45);

        jListSelecionados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListSelecionados);

        panelHome.add(jScrollPane1);
        jScrollPane1.setBounds(290, 200, 140, 170);

        labelCodigo1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelCodigo1.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo1.setText("Nome do(a) M??dico(a)");
        panelHome.add(labelCodigo1);
        labelCodigo1.setBounds(240, 10, 330, 30);

        jListEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListEspecialidades);

        panelHome.add(jScrollPane2);
        jScrollPane2.setBounds(30, 200, 140, 170);

        labelCodigo3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelCodigo3.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo3.setText("C??digo");
        panelHome.add(labelCodigo3);
        labelCodigo3.setBounds(30, 10, 70, 30);

        labelCodigo4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelCodigo4.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo4.setText("Selecionadas");
        panelHome.add(labelCodigo4);
        labelCodigo4.setBounds(290, 170, 140, 30);

        labelCodigo5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelCodigo5.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo5.setText("CRM");
        panelHome.add(labelCodigo5);
        labelCodigo5.setBounds(120, 10, 100, 30);

        labelCodigo6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelCodigo6.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo6.setText("Especialidades");
        panelHome.add(labelCodigo6);
        labelCodigo6.setBounds(30, 170, 170, 30);

        textFieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDataDeNascimentoActionPerformed(evt);
            }
        });
        panelHome.add(textFieldDataDeNascimento);
        textFieldDataDeNascimento.setBounds(390, 120, 180, 30);

        labelCodigo7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelCodigo7.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo7.setText("Data De Nascimento");
        panelHome.add(labelCodigo7);
        labelCodigo7.setBounds(390, 90, 180, 30);

        labelCodigo8.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelCodigo8.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo8.setText("Telefone:");
        panelHome.add(labelCodigo8);
        labelCodigo8.setBounds(30, 90, 100, 30);

        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });
        panelHome.add(textFieldTelefone);
        textFieldTelefone.setBounds(30, 120, 100, 30);

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        panelHome.add(textFieldEmail);
        textFieldEmail.setBounds(150, 120, 220, 30);

        labelCodigo9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelCodigo9.setForeground(new java.awt.Color(51, 153, 255));
        labelCodigo9.setText("Email:");
        panelHome.add(labelCodigo9);
        labelCodigo9.setBounds(150, 90, 220, 30);

        jButtonRemoverEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-esquerda.png"))); // NOI18N
        jButtonRemoverEspecialidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonRemoverEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverEspecialidadeActionPerformed(evt);
            }
        });
        panelHome.add(jButtonRemoverEspecialidade);
        jButtonRemoverEspecialidade.setBounds(210, 250, 50, 40);

        jButtonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-direita.png"))); // NOI18N
        jButtonAdicionarEspecialidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        panelHome.add(jButtonAdicionarEspecialidade);
        jButtonAdicionarEspecialidade.setBounds(210, 200, 50, 40);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 100, 650, 420);

        setBounds(0, 0, 694, 566);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDoMedicoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        MedicoController controller = new MedicoController();
        controller.executa(evt, TipoOperacao.ADICIONAR);
        if (tipoOperacao == TipoOperacao.ADICIONAR){
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDataDeNascimentoActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void jButtonRemoverEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverEspecialidadeActionPerformed
       selecionadas = jListSelecionados.getSelectedValuesList();

//        for (String e : selecionadas) {
//            nomeDasEspecialidades.add(e);
//            especialidadesListModel.addElement(e);
//            especialidadesSelecionadas.remove(e);
//            especialidadesSelecionadasModel.removeElement(e);
//        }
//        especialidadesListModel.clear();
//        especialidadesListModel.addAll(nomeDasEspecialidades);
//        especialidadesSelecionadasModel.clear();
//        especialidadesSelecionadasModel.addAll(especialidadesSelecionadas);
//        
//        jListSelecionados.setModel(especialidadesSelecionadasModel);
//        jListEspecialidades.setModel(especialidadesListModel);
    }//GEN-LAST:event_jButtonRemoverEspecialidadeActionPerformed

    private void jButtonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarEspecialidadeActionPerformed
        
        List<String> selecionadas = jListEspecialidades.getSelectedValuesList();

        for (String e : selecionadas) {
//            especialidadesSelecionadas.add(e);
            especialidadesSelecionadasModel.addElement(e);
             nomeDasEspecialidades.remove(e);
            especialidadesListModel.removeElement(e);
        }
        limparModels();
        atualizarArray();
        refazerModelo();
    }//GEN-LAST:event_jButtonAdicionarEspecialidadeActionPerformed

    private void textFieldCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCrmActionPerformed
    private void atualizarArray(){
//        especialidadesListModel.addAll(nomeDasEspecialidades);;
        especialidadesSelecionadasModel.addAll(especialidadesSelecionadas);
    }
    private void refazerModelo(){
        jListEspecialidades.setModel(especialidadesListModel);
        jListSelecionados.setModel(especialidadesSelecionadasModel);
    }
    private void limparModels(){
        especialidadesListModel.clear();
        especialidadesSelecionadasModel.clear();
    }
    
    private void gravar(){
        Medico medico = new Medico();
        medico.setNome(textFieldNomeDoMedico.getText());
        medico.setCrm(textFieldCrm.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataDeNascimento(textFieldDataDeNascimento.getText());
        medico.setEspecialidades(especialidadesSelecionadas);
        
        if (validarCadastro()) {
            MedicoDAO dao = new MedicoDAO();
            dao.inserirMedico(medico);

            JOptionPane.showMessageDialog(
                    this,
                    "Plano de Sa??de gravado com sucesso",
                    "Plano De Sa??de",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
}
    private boolean validarCadastro() {
        
        if (textFieldCrm.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o crm do medico.",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);

            textFieldNomeDoMedico.requestFocus();
            return false;

        } else if (textFieldNomeDoMedico.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome do m??dico.",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);

            textFieldNomeDoMedico.requestFocus();
            return false;

        } else if (textFieldTelefone.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o telefone para ocntato.",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);

            textFieldTelefone.requestFocus();
            return false;
        } else if (textFieldEmail.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o email.",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);

            textFieldEmail.requestFocus();
            return false;
        }
        return true;

    }
    private void atualizar(){
        medico.setNome(textFieldNomeDoMedico.getText());
        medico.setCrm(textFieldCrm.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataDeNascimento(textFieldDataDeNascimento.getText());
        medico.setEspecialidades(especialidadesSelecionadas);
        if(validarCadastro()){
            MedicoDAO.atualizarMedico(medico);
            JOptionPane.showMessageDialog(
                null, 
                "Plano de Sa??de atualizado com sucesso.",
                "Plano de Sa??de",
                JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton jButtonAdicionarEspecialidade;
    private javax.swing.JButton jButtonRemoverEspecialidade;
    private javax.swing.JList<String> jListEspecialidades;
    private javax.swing.JList<String> jListSelecionados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCodigo1;
    private javax.swing.JLabel labelCodigo3;
    private javax.swing.JLabel labelCodigo4;
    private javax.swing.JLabel labelCodigo5;
    private javax.swing.JLabel labelCodigo6;
    private javax.swing.JLabel labelCodigo7;
    private javax.swing.JLabel labelCodigo8;
    private javax.swing.JLabel labelCodigo9;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JPanel panelApp;
    private javax.swing.JPanel panelHome;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCrm;
    private javax.swing.JTextField textFieldDataDeNascimento;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeDoMedico;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables

    private void addSelectionEspecialidadesInModel() {
        
    }
}
