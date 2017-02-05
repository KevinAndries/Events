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
import static java.rmi.Naming.list;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static org.eclipse.persistence.jpa.jpql.utility.CollectionTools.list;

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
        jPanelZaal.setVisible(false);
        jPanelAfbeelding.setVisible(false);
        btnWijzigen.setVisible(false);
        btnToevoegenFoto.setVisible(false);
        btnVerwijderenFoto.setVisible(false);
        lstbAfbeeldingen.setVisible(false);
        lblAfbeelding.setVisible(false);
        lblFoto.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelStart = new javax.swing.JPanel();
        btnToevoegen = new javax.swing.JButton();
        btnVerwijderen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstbZalen = new javax.swing.JList();
        lblFoto = new javax.swing.JLabel();
        jPanelZaal = new javax.swing.JPanel();
        btnWijzigen = new javax.swing.JButton();
        btnToevoegenFoto = new javax.swing.JButton();
        btnVerwijderenFoto = new javax.swing.JButton();
        lblNaamUp = new javax.swing.JLabel();
        txtNaamUp = new javax.swing.JTextField();
        lblHuisnummerUp = new javax.swing.JLabel();
        txtHuisnummerUp = new javax.swing.JTextField();
        lblAdresUp = new javax.swing.JLabel();
        lblGemeenteUp = new javax.swing.JLabel();
        lblEmailUp = new javax.swing.JLabel();
        txtEmailUp = new javax.swing.JTextField();
        txtGemeenteUp = new javax.swing.JTextField();
        txtAdresUp = new javax.swing.JTextField();
        lblPostcodeUp1 = new javax.swing.JLabel();
        txtPostcodeUp = new javax.swing.JTextField();
        lblCapZittendUp = new javax.swing.JLabel();
        txtCapZittendUp = new javax.swing.JTextField();
        lblCapStaandUp = new javax.swing.JLabel();
        txtCapStaandUp = new javax.swing.JTextField();
        lblOppervlakteUp = new javax.swing.JLabel();
        txtOppervlakteUp = new javax.swing.JTextField();
        lblKenmerkenUp = new javax.swing.JLabel();
        lblFaciliteitenUp = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaKenmerkenUp = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtaFaciliteitenUp = new javax.swing.JTextArea();
        lblTarievenUp = new javax.swing.JLabel();
        txtTarievenUp = new javax.swing.JTextField();
        jPanelAfbeelding = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstbAfbeeldingen = new javax.swing.JList();
        lblAfbeelding = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnToevoegen.setText("Zaal toevoegen");
        btnToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToevoegenActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelStartLayout = new javax.swing.GroupLayout(jPanelStart);
        jPanelStart.setLayout(jPanelStartLayout);
        jPanelStartLayout.setHorizontalGroup(
            jPanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerwijderen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnToevoegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelStartLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelStartLayout.setVerticalGroup(
            jPanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnToevoegen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerwijderen)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnWijzigen.setText("Zaal wijzigen");
        btnWijzigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWijzigenActionPerformed(evt);
            }
        });

        btnToevoegenFoto.setText("Foto's toevoegen");
        btnToevoegenFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToevoegenFotoActionPerformed(evt);
            }
        });

        btnVerwijderenFoto.setText("Foto's verwijderen");
        btnVerwijderenFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerwijderenFotoActionPerformed(evt);
            }
        });

        lblNaamUp.setText("Naam");

        lblHuisnummerUp.setText("Huisnummer");

        lblAdresUp.setText("Adres");

        lblGemeenteUp.setText("Gemeente");

        lblEmailUp.setText("Email");

        lblPostcodeUp1.setText("Postcode");

        txtPostcodeUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPostcodeUpActionPerformed(evt);
            }
        });

        lblCapZittendUp.setText("Capaciteit Zittend");

        lblCapStaandUp.setText("Capaciteit Staand");

        lblOppervlakteUp.setText("Oppervlakte");

        lblKenmerkenUp.setText("Kenmerken");

        lblFaciliteitenUp.setText("Faciliteiten");

        txtaKenmerkenUp.setColumns(20);
        txtaKenmerkenUp.setRows(5);
        jScrollPane4.setViewportView(txtaKenmerkenUp);

        txtaFaciliteitenUp.setColumns(20);
        txtaFaciliteitenUp.setRows(5);
        jScrollPane5.setViewportView(txtaFaciliteitenUp);

        lblTarievenUp.setText("Tarieven");

        javax.swing.GroupLayout jPanelZaalLayout = new javax.swing.GroupLayout(jPanelZaal);
        jPanelZaal.setLayout(jPanelZaalLayout);
        jPanelZaalLayout.setHorizontalGroup(
            jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelZaalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelZaalLayout.createSequentialGroup()
                        .addComponent(lblKenmerkenUp)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanelZaalLayout.createSequentialGroup()
                        .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelZaalLayout.createSequentialGroup()
                                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNaamUp)
                                    .addComponent(lblAdresUp)
                                    .addComponent(lblGemeenteUp)
                                    .addComponent(lblEmailUp))
                                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelZaalLayout.createSequentialGroup()
                                        .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelZaalLayout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(txtNaamUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelZaalLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAdresUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPostcodeUp1)
                                            .addComponent(lblHuisnummerUp))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtHuisnummerUp, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(txtPostcodeUp)))
                                    .addGroup(jPanelZaalLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtGemeenteUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmailUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanelZaalLayout.createSequentialGroup()
                                .addComponent(btnToevoegenFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btnVerwijderenFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnWijzigen, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanelZaalLayout.createSequentialGroup()
                        .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelZaalLayout.createSequentialGroup()
                                .addComponent(lblOppervlakteUp)
                                .addGap(36, 36, 36)
                                .addComponent(txtOppervlakteUp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelZaalLayout.createSequentialGroup()
                                .addComponent(lblCapZittendUp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCapZittendUp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblCapStaandUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCapStaandUp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanelZaalLayout.createSequentialGroup()
                        .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFaciliteitenUp)
                            .addComponent(lblTarievenUp))
                        .addGap(44, 44, 44)
                        .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelZaalLayout.createSequentialGroup()
                                .addComponent(txtTarievenUp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane5)))))
        );
        jPanelZaalLayout.setVerticalGroup(
            jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelZaalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnWijzigen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToevoegenFoto)
                    .addComponent(btnVerwijderenFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaamUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNaamUp)
                    .addComponent(lblHuisnummerUp)
                    .addComponent(txtHuisnummerUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdresUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdresUp)
                    .addComponent(lblPostcodeUp1)
                    .addComponent(txtPostcodeUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGemeenteUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGemeenteUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapZittendUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCapStaandUp)
                    .addComponent(txtCapStaandUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCapZittendUp))
                .addGap(18, 18, 18)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOppervlakteUp)
                    .addComponent(txtOppervlakteUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKenmerkenUp)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFaciliteitenUp)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelZaalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTarievenUp)
                    .addComponent(txtTarievenUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lstbAfbeeldingen.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstbAfbeeldingen.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstbAfbeeldingen.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstbAfbeeldingenValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(lstbAfbeeldingen);

        javax.swing.GroupLayout jPanelAfbeeldingLayout = new javax.swing.GroupLayout(jPanelAfbeelding);
        jPanelAfbeelding.setLayout(jPanelAfbeeldingLayout);
        jPanelAfbeeldingLayout.setHorizontalGroup(
            jPanelAfbeeldingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAfbeeldingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAfbeelding, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAfbeeldingLayout.setVerticalGroup(
            jPanelAfbeeldingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAfbeeldingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAfbeeldingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAfbeelding, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelAfbeelding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelZaal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelZaal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelAfbeelding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenActionPerformed

        NewZaal zfr = new NewZaal();
        zfr.setVisible(true);
        lstbZalen.setListData(service.getAllZaal().toArray());
    }//GEN-LAST:event_btnToevoegenActionPerformed

    private void btnVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerwijderenActionPerformed

        Zaal zaal = (Zaal) lstbZalen.getSelectedValue();
        service.DeleteZaal(zaal);
        lstbZalen.setListData(service.getAllZaal().toArray());
    }//GEN-LAST:event_btnVerwijderenActionPerformed

    private void lstbZalenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstbZalenMouseClicked

    }//GEN-LAST:event_lstbZalenMouseClicked

    private void lstbZalenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstbZalenValueChanged

        int index = 1;

        jPanelZaal.setVisible(true);
        jPanelAfbeelding.setVisible(true);
        btnWijzigen.setVisible(true);
        btnToevoegenFoto.setVisible(true);
        btnVerwijderenFoto.setVisible(true);
        lstbAfbeeldingen.setVisible(true);
        lblAfbeelding.setVisible(true);
        lblFoto.setVisible(true);

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

        if (lstbAfbeeldingen.getModel().getSize() > 0) {
            lstbAfbeeldingen.setSelectedIndex(index);
        }

        List<Afbeelding> afbeeldingen = service.getAllAfbeeldingen(zaal);
        lstbAfbeeldingen.setListData(afbeeldingen.toArray());
    }//GEN-LAST:event_lstbZalenValueChanged

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
        List<Afbeelding> afbeeldingen = service.getAllAfbeeldingen(zaal);
        lstbAfbeeldingen.setListData(afbeeldingen.toArray());
    }//GEN-LAST:event_btnToevoegenFotoActionPerformed

    private void btnVerwijderenFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerwijderenFotoActionPerformed

        Zaal zaal = (Zaal) lstbZalen.getSelectedValue();
        Afbeelding afbeelding = (Afbeelding) lstbAfbeeldingen.getSelectedValue();
        service.DeleteAfbeelding(afbeelding);

        List<Afbeelding> afbeeldingen = service.getAllAfbeeldingen(zaal);
        lstbAfbeeldingen.setListData(afbeeldingen.toArray());
    }//GEN-LAST:event_btnVerwijderenFotoActionPerformed

    private void txtPostcodeUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPostcodeUpActionPerformed

    }//GEN-LAST:event_txtPostcodeUpActionPerformed

    private void lstbAfbeeldingenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstbAfbeeldingenValueChanged

        jPanelAfbeelding.setVisible(true);
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
    private javax.swing.JPanel jPanelAfbeelding;
    private javax.swing.JPanel jPanelStart;
    private javax.swing.JPanel jPanelZaal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JLabel lblPostcodeUp1;
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
