/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUQ.gui;

import RUQ.modelo.Alimento;
import RUQ.modelo.Cuba;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Isaias
 */
public class FCadCubas extends javax.swing.JFrame {

    /**
     * Creates new form FCadCubas
     */
    public FCadCubas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtNomeCuba = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPesoCuba = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jListCubas = new javax.swing.JList();
        btRemoverCuba = new javax.swing.JButton();
        btAddCuba = new javax.swing.JButton();
        jExcluirEssaaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cubas v0.9.2  13Abr2015");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setViewportView(txtNomeCuba);

        jLabel1.setText("Nome da Cuba");

        jScrollPane2.setViewportView(txtPesoCuba);

        jLabel2.setText("Peso");

        jListCubas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Carregando..." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListCubas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListCubas.setToolTipText("");

        btRemoverCuba.setText("-");
        btRemoverCuba.setToolTipText("Adicionar alimento ao sistema");
        btRemoverCuba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverCubaActionPerformed(evt);
            }
        });

        btAddCuba.setText("+");
        btAddCuba.setToolTipText("Adicionar alimento ao sistema");
        btAddCuba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCubaActionPerformed(evt);
            }
        });

        jExcluirEssaaLabel.setText("USAR TABLE PRA APARECER O NOME E O PESO!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRemoverCuba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jExcluirEssaaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jListCubas, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAddCuba)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAddCuba))
                .addGap(18, 18, 18)
                .addComponent(jListCubas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemoverCuba)
                    .addComponent(jExcluirEssaaLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Preenche a lista com as cubas
        listarCubas();
        jExcluirEssaaLabel.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btAddCubaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCubaActionPerformed
        //Inserir cubas
        if (!txtNomeCuba.getText().isEmpty()) {
        double peso = Double.parseDouble(txtPesoCuba.getText());
        Cuba cu = new Cuba(txtNomeCuba.getText(), peso);
        JOptionPane.showMessageDialog(this,cadastrarCuba(cu)); //ESTOU PASSANDO MEU CU COMO ARGUMENTO!
        listarCubas();
        }
    }//GEN-LAST:event_btAddCubaActionPerformed

    private void btRemoverCubaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverCubaActionPerformed
        // Apagar Cubas
        Cuba cu = new Cuba(jListCubas.getSelectedValue().toString(), 0);
        JOptionPane.showMessageDialog(this,apagarCuba(cu));
        listarCubas();
    }//GEN-LAST:event_btRemoverCubaActionPerformed

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
            java.util.logging.Logger.getLogger(FCadCubas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadCubas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadCubas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadCubas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCadCubas().setVisible(true);
            }
        });
    }
    Connection c = null;
    Statement stmt = null;
    //Mover esses metodos pro controle!
    public String cadastrarCuba(Cuba cba){
        try 
        {
            //banco de dados
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:dzero.db");
            c.setAutoCommit(false); //desliga transacao automatica
            stmt = c.createStatement(); //prepara a query
            //Obs, os \" são para as aspas fazer parte da string
            String sql = "INSERT INTO TblCuba VALUES (\""+ cba.getNome() +"\", " + cba.getPeso() + ");";

            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
            return "Inserido";
        } 
        catch (ClassNotFoundException | SQLException e) {
            return "0 - ERRO AO CADASTRAR USUARIO : " + e.toString();
        }
    }
    public void listarCubas(){
        DefaultListModel modelListaCubas = new DefaultListModel();
        Alimento al = null;
        try 
        {
            //banco de dados
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:dzero.db");
            stmt = c.createStatement(); //prepara a query
            //Obs, os \" são para as aspas fazer parte da string
            String sql = "SELECT Nome FROM TblCuba;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) 
            {
                //txAreaAlimento.setText(txAreaAlimento.getText() + al.getNome() + "\n");
                modelListaCubas.addElement(rs.getString("Nome"));
            }
            jListCubas.setModel(modelListaCubas);
            stmt.close();
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
                JOptionPane.showMessageDialog(this, "0 - ERRO AO LISTAR USUARIOS : " + e.toString());
        }

    }
    public String apagarCuba (Cuba cu){
        try {
            //banco de dados
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:dzero.db");
            c.setAutoCommit(false);
            stmt = c.createStatement(); //prepara a query
            //Obs, os \" são para as aspas fazer parte da string
            String sql = "DELETE FROM TblCuba Where Nome = \"" + cu.getNome()+"\";";
            
            int linhasAfetadas = stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            return "1 - Alteracoes realizadas";

        } catch (Exception e) {
            return "0 - Falha ao deletar Cuba " + e.toString();
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCuba;
    private javax.swing.JButton btRemoverCuba;
    private javax.swing.JLabel jExcluirEssaaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jListCubas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane txtNomeCuba;
    private javax.swing.JTextPane txtPesoCuba;
    // End of variables declaration//GEN-END:variables
}
