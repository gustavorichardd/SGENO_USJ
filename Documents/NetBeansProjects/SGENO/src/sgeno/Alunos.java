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
import sgeno.Classes.Aluno;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sgeno.Classes.TodosArrays.listaAluno;

public class Alunos extends javax.swing.JFrame {

    public Alunos() {
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
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAlunos = new javax.swing.JTable();
        EXCLUIR = new javax.swing.JButton();
        EDITAR = new javax.swing.JButton();
        CADASTRAR = new javax.swing.JButton();

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

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALUNOS");
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i2_RPaluno.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
        );

        TabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Curso", "Fase", "Sexo", "Telefone", "Celular", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaAlunos.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jScrollPane1.setViewportView(TabelaAlunos);
        if (TabelaAlunos.getColumnModel().getColumnCount() > 0) {
            TabelaAlunos.getColumnModel().getColumn(0).setResizable(false);
            TabelaAlunos.getColumnModel().getColumn(0).setPreferredWidth(80);
            TabelaAlunos.getColumnModel().getColumn(1).setResizable(false);
            TabelaAlunos.getColumnModel().getColumn(2).setResizable(false);
            TabelaAlunos.getColumnModel().getColumn(2).setPreferredWidth(40);
            TabelaAlunos.getColumnModel().getColumn(3).setResizable(false);
            TabelaAlunos.getColumnModel().getColumn(3).setPreferredWidth(35);
            TabelaAlunos.getColumnModel().getColumn(4).setResizable(false);
            TabelaAlunos.getColumnModel().getColumn(4).setPreferredWidth(50);
            TabelaAlunos.getColumnModel().getColumn(5).setResizable(false);
            TabelaAlunos.getColumnModel().getColumn(5).setPreferredWidth(90);
            TabelaAlunos.getColumnModel().getColumn(6).setResizable(false);
            TabelaAlunos.getColumnModel().getColumn(6).setPreferredWidth(90);
            TabelaAlunos.getColumnModel().getColumn(7).setResizable(false);
        }

        EXCLUIR.setText("Excluir");
        EXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXCLUIRActionPerformed(evt);
            }
        });

        EDITAR.setText("Editar");
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });

        CADASTRAR.setText("Cadastrar Novo");
        CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    // Botão Excluir
    private void EXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIRActionPerformed
        DefaultTableModel model = (DefaultTableModel) TabelaAlunos.getModel();
        if (TabelaAlunos.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Para exclusão, selecione um aluno.");
        } else {
            try {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
                }
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sgeno?autoReconnect=true&useSSL=false", "root", "masterkey");
                PreparedStatement stmt = con.prepareStatement("UPDATE aluno SET ALUNO_STATUS = 'I' WHERE MATRICULA = ?");
                stmt.setInt(1, Integer.valueOf(TabelaAlunos.getValueAt(TabelaAlunos.getSelectedRow(), 0).toString()));

                stmt.executeUpdate();

                stmt.close();
                con.close();

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "ERRO!!");
                throw new RuntimeException("Erro na conexão com o banco", erro);
            }

            //ATUALIZA
            try {

                //procura a classe do Driver jdbc
                Class.forName("com.mysql.jdbc.Driver");
                //Cria uma variável do tipo conexão 
                // Verificar usuário a senha do banco!!
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sgeno?autoReconnect=true&useSSL=false", "root", "masterkey");
                // Query para inserir os alunos no banco
                String query = "SELECT MATRICULA, NOME, CURSO, FASE, SEXO, TELEFONE, CELULAR, EMAIL FROM aluno WHERE ALUNO_STATUS = 'A'";
                //Cria o comando para inserir no banco
                PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
                stmt.execute(); // cria o vetor

                ResultSet resultado = stmt.executeQuery(query);

                model.setNumRows(0);

                while (resultado.next()) {
                    model.addRow(new Object[]{
                        //retorna os dados da tabela do BD, cada campo e um coluna.
                        resultado.getString("MATRICULA"),
                        resultado.getString("NOME"),
                        resultado.getString("CURSO"),
                        resultado.getString("FASE"),
                        resultado.getString("SEXO"),
                        resultado.getString("TELEFONE"),
                        resultado.getString("CELULAR"),
                        resultado.getString("EMAIL"),});
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("o erro foi " + ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_EXCLUIRActionPerformed

    private void CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRARActionPerformed
        this.dispose();
        new CadastroAluno().setVisible(true);
    }//GEN-LAST:event_CADASTRARActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        try {

            //procura a classe do Driver jdbc
            Class.forName("com.mysql.jdbc.Driver");
            //Cria uma variável do tipo conexão 
            // Verificar usuário a senha do banco!!
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sgeno?autoReconnect=true&useSSL=false", "root", "masterkey");
            // Query para inserir os alunos no banco
            String query = "SELECT MATRICULA, NOME, CURSO, FASE, SEXO, TELEFONE, CELULAR, EMAIL FROM ALUNO WHERE ALUNO_STATUS = 'A'";
            //Cria o comando para inserir no banco
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
            stmt.execute(); // cria o vetor

            ResultSet resultado = stmt.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) TabelaAlunos.getModel();
            model.setNumRows(0);

            while (resultado.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("MATRICULA"),
                    resultado.getString("NOME"),
                    resultado.getString("CURSO"),
                    resultado.getString("FASE"),
                    resultado.getString("SEXO"),
                    resultado.getString("TELEFONE"),
                    resultado.getString("CELULAR"),
                    resultado.getString("EMAIL"),});
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowActivated

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed
        if (TabelaAlunos.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Para editar, selecione um aluno.");
        } else {
            try {
                //procura a classe do Driver jdbc
                Class.forName("com.mysql.jdbc.Driver");

                //Cria uma variável do tipo conexão 
                // Verificar usuário a senha do banco!!
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sgeno?autoReconnect=true&useSSL=false", "root", "masterkey");
                // Query para inserir os alunos no banco
                String query = "DELETE FROM EDITA_ALUNO_TEMP";
                //Cria o comando para inserir no banco
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.executeUpdate();
                stmt.close();
                con.close();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                //procura a classe do Driver jdbc
                Class.forName("com.mysql.jdbc.Driver");

                //Cria uma variável do tipo conexão 
                // Verificar usuário a senha do banco!!
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sgeno?autoReconnect=true&useSSL=false", "root", "masterkey");
                // Query para inserir os alunos no banco
                String query = "INSERT INTO edita_aluno_temp (matricula_temp) values (?)";
                //Cria o comando para inserir no banco
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, Integer.valueOf(TabelaAlunos.getValueAt(TabelaAlunos.getSelectedRow(), 0).toString()));
                stmt.executeUpdate();
                stmt.close();
                con.close();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.dispose();
            new EditarAluno().setVisible(true);

        }
    }//GEN-LAST:event_EDITARActionPerformed

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
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CADASTRAR;
    private javax.swing.JButton EDITAR;
    private javax.swing.JButton EXCLUIR;
    private javax.swing.JTable TabelaAlunos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
