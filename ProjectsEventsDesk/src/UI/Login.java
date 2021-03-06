/**
 *
 * @author Andries Kevin
 */
package UI;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;


public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();       
    }


    Timer timer1 = new Timer(30, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (pnlLoginMessage.getHeight() != 105) {
                pnlLoginMessage.setBounds(0, 0, Login.this.getSize().width, pnlLoginMessage.getHeight() + 5);
                if (pnlLoginMessage.getHeight() == 105) {
                    timer1.stop();
                }
            }
        }
    });

    Timer timer2 = new Timer(30, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (pnlLoginMessage.getHeight() != 0) {
                pnlLoginMessage.setBounds(0, 0, Login.this.getSize().width, pnlLoginMessage.getHeight() - 5);
                if (pnlLoginMessage.getHeight() == 0) {
                    timer2.stop();
                }
            }
        }
    });

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pwfPassword = new javax.swing.JPasswordField();
        ckbPassword = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        pnlLoginMessage = new javax.swing.JPanel();
        LblLoginMessage = new javax.swing.JLabel();
        btnLoginOK = new javax.swing.JButton();
        btnWrong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsername.setText("Username : ");

        lblPassword.setText("Password : ");

        pwfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwfPasswordKeyPressed(evt);
            }
        });

        ckbPassword.setText("Show password");
        ckbPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbPasswordActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        btnLoginOK.setText("OK");
        btnLoginOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginOKActionPerformed(evt);
            }
        });

        btnWrong.setText("Try again");
        btnWrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWrongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginMessageLayout = new javax.swing.GroupLayout(pnlLoginMessage);
        pnlLoginMessage.setLayout(pnlLoginMessageLayout);
        pnlLoginMessageLayout.setHorizontalGroup(
            pnlLoginMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginMessageLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(LblLoginMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnLoginOK)
                .addContainerGap())
            .addGroup(pnlLoginMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginMessageLayout.createSequentialGroup()
                    .addContainerGap(269, Short.MAX_VALUE)
                    .addComponent(btnWrong)
                    .addContainerGap()))
        );
        pnlLoginMessageLayout.setVerticalGroup(
            pnlLoginMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginMessageLayout.createSequentialGroup()
                        .addComponent(btnLoginOK)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LblLoginMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlLoginMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLoginMessageLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnWrong)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(pwfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(ckbPassword)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlLoginMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addComponent(pnlLoginMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pwfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ckbPassword)))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ckbPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbPasswordActionPerformed

        if (ckbPassword.isSelected()) {
            pwfPassword.setEchoChar((char) 0);

        } else {
            pwfPassword.setEchoChar('*');
        }


    }//GEN-LAST:event_ckbPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

 
        
        Connection connection;
        PreparedStatement ps;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_zalen", "root", "usbw");
            ps = connection.prepareStatement("SELECT `username`, `password` FROM `tbl_users` WHERE `username` =? AND `password` =?");
            ps.setString(1, txtUsername.getText());
            ps.setString(2, String.valueOf(pwfPassword.getPassword()));

            ResultSet result = ps.executeQuery();
            


            if (result.next()) {
                LblLoginMessage.setText("Login succesvol");
                btnLoginOK.setVisible(true);
                btnWrong.setVisible(false);
                timer1.start();
                Mainframe mfr = new Mainframe();
                mfr.setVisible(true);
                this.dispose();

            } else {
                LblLoginMessage.setText("Ongeldige gebruikersnaam of paswoord");
                btnWrong.setVisible(true);
                btnLoginOK.setVisible(false);
                timer1.start();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginOKActionPerformed

    }//GEN-LAST:event_btnLoginOKActionPerformed

    private void btnWrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWrongActionPerformed
        this.dispose();
        Login lfr = new Login();
        lfr.setVisible(true);
        
    }//GEN-LAST:event_btnWrongActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
             
        
        Connection connection;
        PreparedStatement ps;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_zalen", "root", "usbw");
            ps = connection.prepareStatement("SELECT `username`, `password` FROM `tbl_users` WHERE `username` =? AND `password` =?");
            ps.setString(1, txtUsername.getText());
            ps.setString(2, String.valueOf(pwfPassword.getPassword()));

            ResultSet result = ps.executeQuery();
            
            if (result.next()) {
                LblLoginMessage.setText("Login succesvol");
                btnLoginOK.setVisible(true);
                btnWrong.setVisible(false);
                timer1.start();
                Mainframe mfr = new Mainframe();
                mfr.setVisible(true);
                this.dispose();

            } else {
                LblLoginMessage.setText("Ongeldige gebruikersnaam of paswoord");
                btnWrong.setVisible(true);
                btnLoginOK.setVisible(false);
                timer1.start();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void pwfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwfPasswordKeyPressed
        
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
             
        
        Connection connection;
        PreparedStatement ps;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_zalen", "root", "usbw");
            ps = connection.prepareStatement("SELECT `username`, `password` FROM `tbl_users` WHERE `username` =? AND `password` =?");
            ps.setString(1, txtUsername.getText());
            ps.setString(2, String.valueOf(pwfPassword.getPassword()));

            ResultSet result = ps.executeQuery();
           

            if (result.next()) {
                LblLoginMessage.setText("Login succesvol");
                btnLoginOK.setVisible(true);
                btnWrong.setVisible(false);
                timer1.start();
                Mainframe mfr = new Mainframe();
                mfr.setVisible(true);
                this.dispose();

            } else {
                LblLoginMessage.setText("Ongeldige gebruikersnaam of paswoord");
                btnWrong.setVisible(true);
                btnLoginOK.setVisible(false);
                timer1.start();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_pwfPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblLoginMessage;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginOK;
    private javax.swing.JButton btnWrong;
    private javax.swing.JCheckBox ckbPassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLoginMessage;
    private javax.swing.JPasswordField pwfPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
