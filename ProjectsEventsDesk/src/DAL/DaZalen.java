/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BO.Zaal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andries Kevin
 */
public class DaZalen {

    PreparedStatement ps;

    public static Connection GetConnection() throws SQLException {

        return DriverManager.getConnection("jdbc:mysql://localhost:3307/db_zalen", "root", "usbw");
    }

    //Foto toevoegen aan database
    public boolean ToevoegenFoto(File img, FileInputStream fis) {

        try {
            String sql = "INSERT INTO afbeelding(Naam,Omschrijving,Afbeelding,ZaalId) VALUES (?, ?, ?, ?)";

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_zalen", "root", "usbw");

            ps = conn.prepareStatement(sql);
            ps.setBinaryStream(1, fis, img.length());
            ps.executeUpdate();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(DaZalen.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Foto ophalen uit database
    public String OphalenFoto() {

        FileOutputStream fos = null;

        String sql = "SELECT * FROM afbeelding";
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_zalen", "root", "usbw");
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            rs.last();

            Blob b = rs.getBlob("Image");
            String AFBEELDINGID = rs.getString("AfbeeldingId");

            fos = new FileOutputStream("D://Imgs/" + AFBEELDINGID + ".jpg");

            int len = (int) b.length();
            byte[] buf = b.getBytes(1, len);

            fos.write(buf, 0, len);

            return AFBEELDINGID;

        } catch (SQLException ex) {
            Logger.getLogger(DaZalen.class.getName()).log(Level.SEVERE, null, ex);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaZalen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DaZalen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "-1";
    }

    public ArrayList<Zaal> getAll() {

        ArrayList<Zaal> result = new ArrayList<>();

        try {
            Connection conn = GetConnection();
            Statement stmt;

            stmt = conn.createStatement();
            String sqlGegevens = "SELECT * FROM zaal";
            ResultSet rs = stmt.executeQuery(sqlGegevens);
            while (rs.next()) {
                Zaal zaal = new Zaal();
                zaal.setZaalId(rs.getInt("zaalId"));
                zaal.setNaam(rs.getString("naam"));
                zaal.setAdres(rs.getString("adres"));
                zaal.setHuisnummer(rs.getInt("huisnummer"));
                zaal.setGemeente(rs.getString("gemeente"));
                zaal.setPostcode(rs.getInt("postcode"));
                zaal.setEmail(rs.getString("email"));
                zaal.setKenmerken(rs.getString("kenmerken"));
                zaal.setFaciliteiten(rs.getString("faciliteiten"));
                zaal.setTarieven(rs.getDouble("tarieven"));
                zaal.setCapZittend(rs.getInt("capZittend"));
                zaal.setCapStaand(rs.getInt("capStaand"));
                zaal.setOppervlakte(rs.getInt("Oppervlakte"));
                zaal.setProfiel(rs.getString("Profiel"));
                result.add(zaal);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;

    }

    public static void ZaalToevoegen(Zaal zaal) {

        try {
            Connection conn = GetConnection();
            String sql = "";
            Statement stmt;

            stmt = conn.createStatement();

            if (zaal.getZaalId() == 0) {

                sql = "INSERT INTO zaal(Naam,Adres,Huisnummer,Gemeente,Postcode,Email,Kenmerken,Faciliteiten,Tarieven,CapZittend,CapStaand,Oppervlakte,Profiel) VALUES ('" + zaal.getNaam() + "','"
                        + zaal.getAdres() + "'," + zaal.getHuisnummer() + ",'" + zaal.getGemeente() + "'," + zaal.getPostcode() + ",'" + zaal.getEmail() + "','" + zaal.getKenmerken() + "','"
                        + zaal.getFaciliteiten() + "'," + zaal.getTarieven() + "," + zaal.getCapZittend() + "," + zaal.getCapStaand() + "," + zaal.getOppervlakte() + ",'" + zaal.getProfiel() + "'); ";

                int result = stmt.executeUpdate(sql);

                System.out.println(result);
                stmt = conn.createStatement();

                JOptionPane.showMessageDialog(null, "Er is een insert gebeurd");

            } else {

                sql = "UPDATE zaal SET Naam='" + zaal.getNaam() + "',Adres='" + zaal.getAdres() + "',Huisnummer=" + zaal.getHuisnummer() + ",Gemeente='" + zaal.getGemeente() + "',Postcode=" + zaal.getPostcode() + ",Email='" + zaal.getEmail() + "',Kenmerken='"
                        + zaal.getKenmerken() + "',Faciliteiten='" + zaal.getFaciliteiten() + "',Tarieven=" + zaal.getTarieven() + ",CapZittend=" + zaal.getCapZittend() + ",CapStaand=" + zaal.getCapStaand() + ",Oppervlakte=" + zaal.getOppervlakte() + ",Profiel='" + zaal.getProfiel() + "' WHERE ZaalId=" + zaal.getZaalId() + ";";

                int resultUp = stmt.executeUpdate(sql);

                System.out.println(resultUp);
                stmt = conn.createStatement();

                JOptionPane.showMessageDialog(null, "Er is een update gebeurd");

            }

            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void ZaalVerwijderen(Zaal zaal) {

        try {
            Connection conn = GetConnection();
            String sql2 = "";
            Statement stmt;

            stmt = conn.createStatement();

            if (zaal.getZaalId() != 0) {

                sql2 = "DELETE FROM zaal WHERE ZaalId=" + zaal.getZaalId() + ";";

                int resultDel2 = stmt.executeUpdate(sql2);
                System.out.println(resultDel2);

                JOptionPane.showMessageDialog(null, "Zaal verwijderen gelukt");

            } else {

                JOptionPane.showMessageDialog(null, "Gelieve een zaal te selecteren");

            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
