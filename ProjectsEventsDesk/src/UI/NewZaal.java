/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BO.Zaal;
import Services.ZaalService;
import java.awt.FileDialog;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author andri
 */
public class NewZaal extends javax.swing.JFrame {

    ZaalService service = new ZaalService();
    boolean editmode = false;
    String path = "";

    public NewZaal() {
        initComponents();

    }

//    private void Opslaan() {
//        try {
//            FileInputStream fis = null;
//            File img = null;
//
//            img = new File(path);
//            fis = new FileInputStream(img);
//
//            if (new DaZalen().ToevoegenFoto(img, fis)) {
//                JOptionPane.showMessageDialog(null, "Opslaan succesvol");
//                //lblFoto.setIcon(icon);
//            } else {
//                JOptionPane.showMessageDialog(null, "Opslaan onsuccesvol");
//            }
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//
//    private void Ophalen() {
//        String AfbeeldingId = new DaZalen().OphalenFoto();
//
//        if (!AfbeeldingId.equals("-1")) {
//            JOptionPane.showMessageDialog(null, "Succesvol opgehaald");
//        } else {
//            JOptionPane.showMessageDialog(null, "ONSuccesvol opgehaald");
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        lblNaam = new javax.swing.JLabel();
        lblAdres = new javax.swing.JLabel();
        lblHuisnummer = new javax.swing.JLabel();
        lblPostcode = new javax.swing.JLabel();
        lblGemeente = new javax.swing.JLabel();
        lblCapZittend = new javax.swing.JLabel();
        lblCapStaand = new javax.swing.JLabel();
        lblKenmerken = new javax.swing.JLabel();
        lblFaciliteiten = new javax.swing.JLabel();
        lblTarieven = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblOppervlakte = new javax.swing.JLabel();
        txtNaam = new javax.swing.JTextField();
        txtAdres = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        txtGemeente = new javax.swing.JTextField();
        txtHuisnummer = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCapZittend = new javax.swing.JTextField();
        txtCapStaand = new javax.swing.JTextField();
        txtOppervlakte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaFaciliteiten = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaKenmerken = new javax.swing.JTextArea();
        txtTarieven = new javax.swing.JTextField();
        btnOpslaan = new javax.swing.JButton();
        btnAnnuleren = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOpslaanFoto = new javax.swing.JButton();
        JLabel = new javax.swing.JLabel();
        lblProfielFotoToevoegen = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNaam.setText("Naam");

        lblAdres.setText("Adres");

        lblHuisnummer.setText("Huisnummer");

        lblPostcode.setText("Postcode");

        lblGemeente.setText("Gemeente");

        lblCapZittend.setText("Capaciteit Zittend");

        lblCapStaand.setText("Capaciteit Staand");

        lblKenmerken.setText("Kenmerken");

        lblFaciliteiten.setText("Faciliteiten");

        lblTarieven.setText("Tarieven");

        lblEmail.setText("Email");

        lblOppervlakte.setText("Oppervlakte");

        txtAdres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdresActionPerformed(evt);
            }
        });

        txtPostcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPostcodeActionPerformed(evt);
            }
        });

        txtaFaciliteiten.setColumns(20);
        txtaFaciliteiten.setRows(5);
        jScrollPane1.setViewportView(txtaFaciliteiten);

        txtaKenmerken.setColumns(20);
        txtaKenmerken.setRows(5);
        jScrollPane2.setViewportView(txtaKenmerken);

        btnOpslaan.setText("Opslaan");
        btnOpslaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpslaanActionPerformed(evt);
            }
        });

        btnAnnuleren.setText("Annuleren");
        btnAnnuleren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel1.setText("Nieuwe zaal toevoegen");

        btnOpslaanFoto.setText("Profielfoto toevoegen");
        btnOpslaanFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpslaanFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProfielFotoToevoegen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOpslaanFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(btnOpslaan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnnuleren)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFaciliteiten, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTarieven, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCapZittend)
                                    .addComponent(lblOppervlakte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAdres)
                                    .addComponent(lblNaam)
                                    .addComponent(lblGemeente)
                                    .addComponent(lblEmail))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblKenmerken, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCapZittend, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(lblCapStaand)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCapStaand, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtOppervlakte, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(169, 169, 169))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTarieven, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNaam, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtGemeente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblHuisnummer)
                                                .addComponent(lblPostcode))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtHuisnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNaam)
                            .addComponent(lblHuisnummer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdres)
                            .addComponent(lblPostcode)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtHuisnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGemeente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGemeente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapZittend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCapStaand))
                    .addComponent(txtCapStaand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCapZittend)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOppervlakte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOppervlakte))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblKenmerken)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaciliteiten, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTarieven))
                    .addComponent(txtTarieven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpslaan)
                    .addComponent(btnAnnuleren)
                    .addComponent(btnOpslaanFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProfielFotoToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPostcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPostcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPostcodeActionPerformed

    private void btnOpslaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpslaanActionPerformed

        Zaal zaal = new Zaal();
        zaal.setNaam(txtNaam.getText());
        zaal.setAdres(txtAdres.getText());
        zaal.setHuisnummer(Integer.parseInt(txtHuisnummer.getText()));
        zaal.setGemeente(txtGemeente.getText());
        zaal.setPostcode(Integer.parseInt(txtPostcode.getText()));
        zaal.setEmail(txtEmail.getText());
        zaal.setKenmerken(txtaKenmerken.getText());
        zaal.setFaciliteiten(txtaFaciliteiten.getText());
        zaal.setCapStaand(Integer.parseInt(txtCapStaand.getText()));
        zaal.setCapZittend(Integer.parseInt(txtCapZittend.getText()));
        zaal.setOppervlakte(Integer.parseInt(txtOppervlakte.getText()));
        zaal.setTarieven(Double.parseDouble(txtTarieven.getText()));

        BufferedImage img;
        try {
            img = ImageIO.read(new File(path));
            ImageIcon icon = new ImageIcon(img);
            lblProfielFotoToevoegen.setIcon(icon);

        } catch (IOException ex) {
            Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }

        String target = "C:\\Users\\andri\\Desktop\\Programmeren 4 project thuis\\SVN GitHub\\ProjectsEventsDesk\\Images\\";

        String fullPath = path;

        StringBuffer sb = new StringBuffer(fullPath);
        int end = fullPath.lastIndexOf(target) + target.length();
        String sbfinal = "Images/" + (sb.replace(fullPath.lastIndexOf(target), end, "").toString());
        JOptionPane.showMessageDialog(null, sbfinal);

        zaal.setProfiel(sbfinal);

        service.SaveZaal(zaal);


    }//GEN-LAST:event_btnOpslaanActionPerformed

    private void btnAnnulerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerenActionPerformed
        this.dispose();

//        NewZaal zfr = new NewZaal();
//        zfr.setVisible(false);
        //zfr.dispose();
//        Mainframe mfr = new Mainframe();
//        mfr.setVisible(true);

    }//GEN-LAST:event_btnAnnulerenActionPerformed

    private void btnOpslaanFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpslaanFotoActionPerformed
        //this.Ophalen();

        Zaal zaal = new Zaal();

        FileDialog fd = new FileDialog(this);
        fd.show();
//           
        path = fd.getDirectory() + fd.getFile();
//            
//            
//            ps.setString(1, "Images/Zalen/" + fd.getFile());
//            ps.setInt(2, zaal.getZaalId());
//            int rs = ps.executeUpdate();
//
//            if (path.endsWith("nullnull")) {
//                JOptionPane.showMessageDialog(null, "Er werd geen afbeelding geselecteerd");
//            } else {
//                JOptionPane.showMessageDialog(null, "Afbeelding werd toegevoegd");
//            }
//
//       } catch (Exception e) {
//            System.out.println(e);
//        }

        BufferedImage img;
        try {
            img = ImageIO.read(new File(path));
            ImageIcon icon = new ImageIcon(img);
            lblProfielFotoToevoegen.setIcon(icon);

        } catch (IOException ex) {
            Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }

//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_zalen", "root", "usbw");
//            PreparedStatement ps = conn.prepareStatement("INSERT INTO afbeelding(Afbeelding,ZaalId) VALUES (?,?)");
//            FileDialog fd = new FileDialog(this);
//            fd.show();
//
//            path = fd.getDirectory() + fd.getFile();
//
//            ps.setString(1, "Images/Zalen/" + fd.getFile());
//            ps.setInt(2, zaal.getZaalId());
//            int rs = ps.executeUpdate();
//
//            if (path.endsWith("nullnull")) {
//                JOptionPane.showMessageDialog(null, "Er werd geen afbeelding geselecteerd");
//            } else {
//                JOptionPane.showMessageDialog(null, "Afbeelding werd toegevoegd");
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }//GEN-LAST:event_btnOpslaanFotoActionPerformed

    private void txtAdresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdresActionPerformed

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
            java.util.logging.Logger.getLogger(NewZaal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewZaal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewZaal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewZaal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewZaal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel;
    private javax.swing.JButton btnAnnuleren;
    private javax.swing.JButton btnOpslaan;
    private javax.swing.JButton btnOpslaanFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblAdres;
    private javax.swing.JLabel lblCapStaand;
    private javax.swing.JLabel lblCapZittend;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFaciliteiten;
    private javax.swing.JLabel lblGemeente;
    private javax.swing.JLabel lblHuisnummer;
    private javax.swing.JLabel lblKenmerken;
    private javax.swing.JLabel lblNaam;
    private javax.swing.JLabel lblOppervlakte;
    private javax.swing.JLabel lblPostcode;
    private javax.swing.JLabel lblProfielFotoToevoegen;
    private javax.swing.JLabel lblTarieven;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtCapStaand;
    private javax.swing.JTextField txtCapZittend;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGemeente;
    private javax.swing.JTextField txtHuisnummer;
    private javax.swing.JTextField txtNaam;
    private javax.swing.JTextField txtOppervlakte;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtTarieven;
    private javax.swing.JTextArea txtaFaciliteiten;
    private javax.swing.JTextArea txtaKenmerken;
    // End of variables declaration//GEN-END:variables
}
