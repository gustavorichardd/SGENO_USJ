/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgeno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sgeno.Classes.Contrato;
import sgeno.Classes.Empresa;
import sgeno.Classes.Vaga;

/**
 *
 * @author VJM
 */
public class BancoVagas extends javax.swing.JFrame {

    /**
     * Creates new form Aluno
     */
    public BancoVagas() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVagas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Edita = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("USJsgeno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Centro Universitário Municipal de São José (USJ)");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE VAGAS");
        setMinimumSize(new java.awt.Dimension(705, 535));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(40, 132, 194));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usj_300x110.png"))); // NOI18N

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(40, 132, 194));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i2_RPvaga.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 223, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
        );

        tabelaVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título da Vaga", "Empresa", "Curso", "Fase", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabelaVagas.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jScrollPane1.setViewportView(tabelaVagas);
        if (tabelaVagas.getColumnModel().getColumnCount() > 0) {
            tabelaVagas.getColumnModel().getColumn(0).setResizable(false);
            tabelaVagas.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabelaVagas.getColumnModel().getColumn(1).setResizable(false);
            tabelaVagas.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabelaVagas.getColumnModel().getColumn(2).setResizable(false);
            tabelaVagas.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabelaVagas.getColumnModel().getColumn(3).setResizable(false);
            tabelaVagas.getColumnModel().getColumn(3).setPreferredWidth(35);
            tabelaVagas.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Edita.setText("Editar");
        Edita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditaActionPerformed(evt);
            }
        });

        jButton4.setText("Cadastrar Novo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Edita, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edita, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Inicial().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditaActionPerformed
        if (tabelaVagas.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Para editar, selecione uma empresa na tabela.");
        } else {

            try {
                //procura a classe do Driver jdbc
                Class.forName("com.mysql.jdbc.Driver");

                //Cria uma variável do tipo conexão 
                // Verificar usuário a senha do banco!!
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sgeno?autoReconnect=true&useSSL=false", "root", "masterkey");
                //Executa a limpeza da tabela EDITA_EMPRESA_TEMP
                PreparedStatement cleanT = con.prepareStatement("DELETE FROM edita_vaga_temp");
                cleanT.executeUpdate();
                cleanT.close();
                //System.out.println(TabelaEmpresas.getValueAt(TabelaEmpresas.getSelectedRow(), 0).toString());
                int codVag = 0;
                PreparedStatement vaga = con.prepareStatement("SELECT COD_VAGA FROM vaga \n"
                        + "INNER JOIN EMPRESA ON VAGA.COD_EMPRESA = EMPRESA.COD_EMPRESA\n"
                        + "WHERE vaga.DESC_VAGA = (?) and empresa.nome = (?);");
                vaga.setString(1, (tabelaVagas.getValueAt(tabelaVagas.getSelectedRow(), 0).toString()));
                vaga.setString(2, (tabelaVagas.getValueAt(tabelaVagas.getSelectedRow(), 1).toString()));

                ResultSet vagA = vaga.executeQuery();
                while (vagA.next()) {
                    codVag = (vagA.getInt("COD_VAGA"));
                }
                vagA.close();
                vaga.close();

                PreparedStatement edtV = con.prepareStatement("INSERT INTO edita_vaga_temp (cod_vaga_temp) values (?)");
                edtV.setInt(1, codVag);
                edtV.executeUpdate();
                edtV.close();
                con.close();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            new EditarVaga().setVisible(true);
        }


    }//GEN-LAST:event_EditaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tabelaVagas.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Para excluir, selecione uma vaga na tabela.");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sgeno?autoReconnect=true&useSSL=false", "root", "masterkey");
                String query = "UPDATE vaga set VAGA_STATUS = 'I' where COD_VAGA = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                //pegar cod_vaga
                int codEmp = 0;
                PreparedStatement tabVag = con.prepareStatement("SELECT COD_VAGA FROM vaga WHERE DESC_VAGA = (?)");
                tabVag.setString(1, tabelaVagas.getValueAt(tabelaVagas.getSelectedRow(), 0).toString());
                ResultSet tabVagR = tabVag.executeQuery();
                while (tabVagR.next()) {
                    codEmp = Integer.parseInt(tabVagR.getString("COD_VAGA"));
                }
                stmt.setInt(1, codEmp);

                tabVagR.close();
                tabVag.close();

                stmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("o erro foi " + ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);


    }//GEN-LAST:event_jButton2ActionPerformed
            try {

                //procura a classe do Driver jdbc
                Class.forName("com.mysql.jdbc.Driver");
                //Cria uma variável do tipo conexão 
                // Verificar usuário a senha do banco!!
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sgeno?autoReconnect=true&useSSL=false", "root", "masterkey");
                // Query para inserir os alunos no banco
                String query = "select VAGA.DESC_VAGA, EMPRESA.NOME, CURSO.DESC_CURSO, VAGA.FASEMIN, VAGA.VALOR FROM vaga\n"
                        + "inner join empresa on empresa.cod_empresa = vaga.cod_empresa\n"
                        + "inner join curso on vaga.cod_curso = curso.cod_curso\n"
                        + "where vaga.vaga_status = 'A';";
                //Cria o comando para inserir no banco
                PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
                stmt.execute(); // cria o vetor

                ResultSet resultado = stmt.executeQuery(query);

                DefaultTableModel model = (DefaultTableModel) tabelaVagas.getModel();
                model.setNumRows(0);

                while (resultado.next()) {
                    model.addRow(new Object[]{
                        //retorna os dados da tabela do BD, cada campo e um coluna.
                        resultado.getString("VAGA.DESC_VAGA"),
                        resultado.getString("EMPRESA.NOME"),
                        resultado.getString("CURSO.DESC_CURSO"),
                        resultado.getString("VAGA.FASEMIN"),
                        resultado.getString("VAGA.VALOR"),});
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("o erro foi " + ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        new CadastroVaga().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        try {

            //procura a classe do Driver jdbc
            Class.forName("com.mysql.jdbc.Driver");
            //Cria uma variável do tipo conexão 
            // Verificar usuário a senha do banco!!
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sgeno?autoReconnect=true&useSSL=false", "root", "masterkey");
            // Query para inserir os alunos no banco
            String query = "select VAGA.DESC_VAGA, EMPRESA.NOME, CURSO.DESC_CURSO, VAGA.FASEMIN, VAGA.VALOR FROM vaga\n"
                    + "inner join empresa on empresa.cod_empresa = vaga.cod_empresa\n"
                    + "inner join curso on vaga.cod_curso = curso.cod_curso\n"
                    + "where vaga.vaga_status = 'A';";
            //Cria o comando para inserir no banco
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
            stmt.execute(); // cria o vetor

            ResultSet resultado = stmt.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) tabelaVagas.getModel();
            model.setNumRows(0);

            while (resultado.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("VAGA.DESC_VAGA"),
                    resultado.getString("EMPRESA.NOME"),
                    resultado.getString("CURSO.DESC_CURSO"),
                    resultado.getString("VAGA.FASEMIN"),
                    resultado.getString("VAGA.VALOR"),});
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(BancoVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoVagas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVagas;
    // End of variables declaration//GEN-END:variables

}
