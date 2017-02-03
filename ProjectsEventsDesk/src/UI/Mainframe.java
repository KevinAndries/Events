/**
 *
 * @author Andries Kevin
 */
package UI;

import BO.Zaal;
import BO.Afbeelding;
import Services.ZaalService;
import java.awt.FileDialog;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mainframe extends javax.swing.JFrame {

    ZaalService service = new ZaalService();
    boolean editmode = true;
    String path = "";
    JPanel panel = new JPanel();

    public Mainframe() {
        initComponents();
        fillList();
    }

    private void fillList() {

        lstbZalen.setListData(service.getAllZaal().toArray());
        jPanelUp.setVisible(false);
        btnWijzigen.setVisible(false);
        btnToevoegenFoto.setVisible(false);
        btnVerwijderenFoto.setVisible(false);
        lstbAfbeeldingen.setVisible(false);
        lblAfbeelding.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnToevoegen = new javax.swing.JButton();
        btnWijzigen = new javax.swing.JButton();
        btnVerwijderen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstbZalen = new javax.swing.JList();
        jPanelUp = new javax.swing.JPanel();
        txtTarievenUp = new javax.swing.JTextField();
        lblGemeenteUp = new javax.swing.JLabel();
        lblCapZittendUp = new javax.swing.JLabel();
        lblCapStaandUp = new javax.swing.JLabel();
        lblKenmerkenUp = new javax.swing.JLabel();
        lblFaciliteitenUp = new javax.swing.JLabel();
        lblTarievenUp = new javax.swing.JLabel();
        lblEmailUp = new javax.swing.JLabel();
        lblNaamUp = new javax.swing.JLabel();
        txtAdresUp = new javax.swing.JTextField();
        lblOppervlakteUp = new javax.swing.JLabel();
        txtPostcodeUp = new javax.swing.JTextField();
        txtNaamUp = new javax.swing.JTextField();
        txtGemeenteUp = new javax.swing.JTextField();
        txtOppervlakteUp = new javax.swing.JTextField();
        txtHuisnummerUp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaFaciliteitenUp = new javax.swing.JTextArea();
        txtEmailUp = new javax.swing.JTextField();
        txtCapZittendUp = new javax.swing.JTextField();
        lblAdresUp = new javax.swing.JLabel();
        txtCapStaandUp = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaKenmerkenUp = new javax.swing.JTextArea();
        lblHuisnummerUp = new javax.swing.JLabel();
        lblPostcodeUp = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnToevoegenFoto = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstbAfbeeldingen = new javax.swing.JList();
        lblAfbeelding = new javax.swing.JLabel();
        btnVerwijderenFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnToevoegen.setText("Zaal toevoegen");
        btnToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToevoegenActionPerformed(evt);
            }
        });

        btnWijzigen.setText("Zaal wijzigen");
        btnWijzigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWijzigenActionPerformed(evt);
            }
        });

        btnVerwijderen.setText("Zaal verwijderen");
        btnVerwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerwijderenActionPerformed(evt);
            }
        });

        lstbZalen.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstbZalen.setName(""); // NOI18N
        lstbZalen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstbZalenMouseClicked(evt);
            }
        });
        lstbZalen.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstbZalenValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstbZalen);

        lblGemeenteUp.setText("Gemeente");

        lblCapZittendUp.setText("Capaciteit Zittend");

        lblCapStaandUp.setText("Capaciteit Staand");

        lblKenmerkenUp.setText("Kenmerken");

        lblFaciliteitenUp.setText("Faciliteiten");

        lblTarievenUp.setText("Tarieven");

        lblEmailUp.setText("Email");

        lblNaamUp.setText("Naam");

        lblOppervlakteUp.setText("Oppervlakte");

        txtPostcodeUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPostcodeUpActionPerformed(evt);
            }
        });

        txtaFaciliteitenUp.setColumns(20);
        txtaFaciliteitenUp.setRows(5);
        jScrollPane2.setViewportView(txtaFaciliteitenUp);

        lblAdresUp.setText("Adres");

        txtaKenmerkenUp.setColumns(20);
        txtaKenmerkenUp.setRows(5);
        jScrollPane3.setViewportView(txtaKenmerkenUp);

        lblHuisnummerUp.setText("Huisnummer");

        lblPostcodeUp.setText("Postcode");

        javax.swing.GroupLayout jPanelUpLayout = new javax.swing.GroupLayout(jPanelUp);
        jPanelUp.setLayout(jPanelUpLayout);
        jPanelUpLayout.setHorizontalGroup(
            jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpLayout.createSequentialGroup()
                        .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCapZittendUp)
                            .addComponent(lblOppervlakteUp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUpLayout.createSequentialGroup()
                                .addComponent(txtCapZittendUp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCapStaandUp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCapStaandUp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtOppervlakteUp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(172, 172, 172))
                    .addGroup(jPanelUpLayout.createSequentialGroup()
                        .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUpLayout.createSequentialGroup()
                                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAdresUp)
                                    .addComponent(lblNaamUp)
                                    .addComponent(lblGemeenteUp)
                                    .addComponent(lblEmailUp))
                                .addGap(46, 46, 46)
                                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAdresUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNaamUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGemeenteUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHuisnummerUp)
                                    .addComponent(lblPostcodeUp))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 45, Short.MAX_VALUE)
                                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHuisnummerUp, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPostcodeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelUpLayout.createSequentialGroup()
                                .addComponent(lblFaciliteitenUp)
                                .addGap(44, 44, 44)
                                .addComponent(jScrollPane2)))
                        .addContainerGap())
                    .addGroup(jPanelUpLayout.createSequentialGroup()
                        .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKenmerkenUp)
                            .addComponent(lblTarievenUp))
                        .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUpLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtTarievenUp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelUpLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane3)
                                .addContainerGap())))))
        );
        jPanelUpLayout.setVerticalGroup(
            jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaamUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNaamUp)
                    .addComponent(lblHuisnummerUp)
                    .addComponent(txtHuisnummerUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdresUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdresUp)
                    .addComponent(lblPostcodeUp)
                    .addComponent(txtPostcodeUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGemeenteUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGemeenteUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailUp))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapZittendUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCapStaandUp)
                    .addComponent(txtCapStaandUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCapZittendUp))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOppervlakteUp)
                    .addComponent(txtOppervlakteUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKenmerkenUp)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFaciliteitenUp)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTarievenUp)
                    .addComponent(txtTarievenUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnToevoegenFoto.setText("Foto's toevoegen");
        btnToevoegenFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToevoegenFotoActionPerformed(evt);
            }
        });

        lstbAfbeeldingen.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstbAfbeeldingen.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstbAfbeeldingenValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstbAfbeeldingen);

        btnVerwijderenFoto.setText("Foto's verwijderen");
        btnVerwijderenFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerwijderenFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnToevoegen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerwijderen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWijzigen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnToevoegenFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerwijderenFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAfbeelding, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToevoegen)
                    .addComponent(btnWijzigen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerwijderen)
                    .addComponent(btnToevoegenFoto)
                    .addComponent(btnVerwijderenFoto))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAfbeelding, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenActionPerformed

        NewZaal zfr = new NewZaal();
        zfr.setVisible(true);

    }//GEN-LAST:event_btnToevoegenActionPerformed

    private void btnWijzigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWijzigenActionPerformed
        if (editmode == false) {
            txtNaamUp.setEnabled(true);
            txtAdresUp.setEnabled(true);
            txtHuisnummerUp.setEnabled(true);
            txtGemeenteUp.setEnabled(true);
            txtPostcodeUp.setEnabled(true);
            txtaKenmerkenUp.setEnabled(true);
            txtaFaciliteitenUp.setEnabled(true);
            txtCapZittendUp.setEnabled(true);
            txtCapStaandUp.setEnabled(true);
            txtOppervlakteUp.setEnabled(true);
            txtTarievenUp.setEnabled(true);
            lblFoto.setEnabled(true);

        } else {
            Zaal zaal = (Zaal) lstbZalen.getSelectedValue();
            zaal.setNaam(txtNaamUp.getText());
            zaal.setAdres(txtAdresUp.getText());
            zaal.setHuisnummer(Integer.parseInt(txtHuisnummerUp.getText()));
            zaal.setGemeente(txtGemeenteUp.getText());
            zaal.setPostcode(Integer.parseInt(txtPostcodeUp.getText()));
            zaal.setEmail(txtEmailUp.getText());
            zaal.setKenmerken(txtaKenmerkenUp.getText());
            zaal.setFaciliteiten(txtaFaciliteitenUp.getText());
            zaal.setCapZittend(Integer.parseInt(txtCapZittendUp.getText()));
            zaal.setCapStaand(Integer.parseInt(txtCapStaandUp.getText()));
            zaal.setOppervlakte(Integer.parseInt(txtOppervlakteUp.getText()));
            zaal.setTarieven(Double.parseDouble(txtTarievenUp.getText()));
            zaal.setProfiel(zaal.getProfiel());

            service.UpdateZaal(zaal.getZaalId(), zaal);

        }
    }//GEN-LAST:event_btnWijzigenActionPerformed

    private void btnVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerwijderenActionPerformed

        Zaal zaal = (Zaal) lstbZalen.getSelectedValue();
        service.DeleteZaal(zaal);


    }//GEN-LAST:event_btnVerwijderenActionPerformed

    private void lstbZalenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstbZalenValueChanged

        jPanelUp.setVisible(true);
        btnWijzigen.setVisible(true);
        btnToevoegenFoto.setVisible(true);
        btnVerwijderenFoto.setVisible(true);
        lstbAfbeeldingen.setVisible(true);
        lblAfbeelding.setVisible(true);

        Zaal zaal = (Zaal) lstbZalen.getSelectedValue();

        if (zaal != null) {

            txtNaamUp.setText(zaal.getNaam());
            txtAdresUp.setText(zaal.getAdres());
            txtHuisnummerUp.setText(String.valueOf(zaal.getHuisnummer()));
            txtGemeenteUp.setText(zaal.getGemeente());
            txtPostcodeUp.setText(String.valueOf(zaal.getPostcode()));
            txtEmailUp.setText(zaal.getEmail());
            txtaKenmerkenUp.setText(zaal.getKenmerken());
            txtaFaciliteitenUp.setText(zaal.getFaciliteiten());
            txtCapZittendUp.setText(String.valueOf(zaal.getCapZittend()));
            txtCapStaandUp.setText(String.valueOf(zaal.getCapStaand()));
            txtOppervlakteUp.setText(String.valueOf(zaal.getOppervlakte()));
            txtTarievenUp.setText(String.valueOf(zaal.getTarieven()));

            BufferedImage img;
            try {
                img = ImageIO.read(new File("C:\\Users\\andri\\Desktop\\Programmeren 4 project thuis\\SVN GitHub\\ProjectsEventsDesk\\" + zaal.getProfiel()));
                ImageIcon icon = new ImageIcon(img);
                lblFoto.setIcon(icon);

            } catch (IOException ex) {
                Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        List<Afbeelding> afbeeldingen = service.getAllAfbeeldingen(zaal);
        lstbAfbeeldingen.setListData(afbeeldingen.toArray());

    }//GEN-LAST:event_lstbZalenValueChanged

    private void txtPostcodeUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPostcodeUpActionPerformed

    }//GEN-LAST:event_txtPostcodeUpActionPerformed

    private void btnToevoegenFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenFotoActionPerformed

        Zaal zaal = (Zaal) lstbZalen.getSelectedValue();

        if (zaal != null) {

            txtNaamUp.setText(zaal.getNaam());
            txtAdresUp.setText(zaal.getAdres());
            txtHuisnummerUp.setText(String.valueOf(zaal.getHuisnummer()));
            txtGemeenteUp.setText(zaal.getGemeente());
            txtPostcodeUp.setText(String.valueOf(zaal.getPostcode()));
            txtEmailUp.setText(zaal.getEmail());
            txtaKenmerkenUp.setText(zaal.getKenmerken());
            txtaFaciliteitenUp.setText(zaal.getFaciliteiten());
            txtCapZittendUp.setText(String.valueOf(zaal.getCapZittend()));
            txtCapStaandUp.setText(String.valueOf(zaal.getCapStaand()));
            txtOppervlakteUp.setText(String.valueOf(zaal.getOppervlakte()));
            txtTarievenUp.setText(String.valueOf(zaal.getTarieven()));
        }

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_zalen", "root", "usbw");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO afbeelding(Afbeelding,ZaalId) VALUES (?,?)");
            FileDialog fd = new FileDialog(this);
            fd.show();

            path = fd.getDirectory() + fd.getFile();

            ps.setString(1, "Images/Zalen/" + fd.getFile());
            ps.setInt(2, zaal.getZaalId());
            int rs = ps.executeUpdate();

            if (path.endsWith("nullnull")) {
                JOptionPane.showMessageDialog(null, "Er werd geen afbeelding geselecteerd");
            } else {
                JOptionPane.showMessageDialog(null, "Afbeelding werd toegevoegd");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnToevoegenFotoActionPerformed

    private void lstbZalenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstbZalenMouseClicked

    }//GEN-LAST:event_lstbZalenMouseClicked

    private void lstbAfbeeldingenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstbAfbeeldingenValueChanged

        jPanelUp.setVisible(true);
        btnWijzigen.setVisible(true);
        btnToevoegenFoto.setVisible(true);
        btnVerwijderenFoto.setVisible(true);
        lstbAfbeeldingen.setVisible(true);
        lblAfbeelding.setVisible(true);

        Afbeelding afbeelding = (Afbeelding) lstbAfbeeldingen.getSelectedValue();

        if (afbeelding != null) {

            BufferedImage img;
            try {
                img = ImageIO.read(new File("C:\\Users\\andri\\Desktop\\Programmeren 4 project thuis\\SVN GitHub\\ProjectsEventsDesk\\" + afbeelding.getAfbeelding()));
                ImageIcon icon = new ImageIcon(img);
                lblAfbeelding.setIcon(icon);

            } catch (IOException ex) {
                Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_lstbAfbeeldingenValueChanged

    private void btnVerwijderenFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerwijderenFotoActionPerformed

        Zaal zaal = (Zaal) lstbZalen.getSelectedValue();
        Afbeelding afbeelding = (Afbeelding) lstbAfbeeldingen.getSelectedValue();
        service.DeleteAfbeelding(afbeelding);
        
        List<Afbeelding> afbeeldingen = service.getAllAfbeeldingen(zaal);
        lstbAfbeeldingen.setListData(afbeeldingen.toArray());

    }//GEN-LAST:event_btnVerwijderenFotoActionPerformed

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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnToevoegen;
    private javax.swing.JButton btnToevoegenFoto;
    private javax.swing.JButton btnVerwijderen;
    private javax.swing.JButton btnVerwijderenFoto;
    private javax.swing.JButton btnWijzigen;
    private javax.swing.JPanel jPanelUp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAdresUp;
    private javax.swing.JLabel lblAfbeelding;
    private javax.swing.JLabel lblCapStaandUp;
    private javax.swing.JLabel lblCapZittendUp;
    private javax.swing.JLabel lblEmailUp;
    private javax.swing.JLabel lblFaciliteitenUp;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblGemeenteUp;
    private javax.swing.JLabel lblHuisnummerUp;
    private javax.swing.JLabel lblKenmerkenUp;
    private javax.swing.JLabel lblNaamUp;
    private javax.swing.JLabel lblOppervlakteUp;
    private javax.swing.JLabel lblPostcodeUp;
    private javax.swing.JLabel lblTarievenUp;
    private javax.swing.JList lstbAfbeeldingen;
    private javax.swing.JList lstbZalen;
    private javax.swing.JTextField txtAdresUp;
    private javax.swing.JTextField txtCapStaandUp;
    private javax.swing.JTextField txtCapZittendUp;
    private javax.swing.JTextField txtEmailUp;
    private javax.swing.JTextField txtGemeenteUp;
    private javax.swing.JTextField txtHuisnummerUp;
    private javax.swing.JTextField txtNaamUp;
    private javax.swing.JTextField txtOppervlakteUp;
    private javax.swing.JTextField txtPostcodeUp;
    private javax.swing.JTextField txtTarievenUp;
    private javax.swing.JTextArea txtaFaciliteitenUp;
    private javax.swing.JTextArea txtaKenmerkenUp;
    // End of variables declaration//GEN-END:variables
}
