/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

/**
 *
 * @author andri
 */
@Entity
@Table
//@PersistenceContext(unitName = "ProjectEventsWebPU")
@NamedQueries(
        @NamedQuery(name = "Zaal.getAll", query = "SELECT z FROM Zaal z"))
public class Zaal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int zaalId;
    @Column
    private String naam;
    @Column
    private String adres;
    @Column
    private int huisnummer;
    @Column
    private String gemeente;
    @Column
    private int postcode;
    @Column
    private String email;
    @Column
    private String kenmerken;
    @Column
    private String faciliteiten;
    @Column
    private double tarieven;
    @Column
    private int capZittend;
    @Column
    private int capStaand;
    @Column
    private int oppervlakte;
    @Column
    private byte[] profiel;

    public int getZaalId() {
        return zaalId;
    }

    public void setZaalId(int zaalId) {
        this.zaalId = zaalId;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKenmerken() {
        return kenmerken;
    }

    public void setKenmerken(String kenmerken) {
        this.kenmerken = kenmerken;
    }

    public String getFaciliteiten() {
        return faciliteiten;
    }

    public void setFaciliteiten(String faciliteiten) {
        this.faciliteiten = faciliteiten;
    }

    public double getTarieven() {
        return tarieven;
    }

    public void setTarieven(double tarieven) {
        this.tarieven = tarieven;
    }

    public int getCapZittend() {
        return capZittend;
    }

    public int getCapStaand() {
        return capStaand;
    }

    public int getOppervlakte() {
        return oppervlakte;
    }

    public byte[] getProfiel() {
        return profiel;
    }

    public void setCapZittend(int capZittend) {
        this.capZittend = capZittend;
    }

    public void setCapStaand(int capStaand) {
        this.capStaand = capStaand;
    }

    public void setOppervlakte(int oppervlakte) {
        this.oppervlakte = oppervlakte;
    }

    public void setProfiel(byte[] profiel) {
        this.profiel = profiel;
    }

    public Zaal(int zaalId, String naam, String adres, int huisnummer, String gemeente, int postcode, String email, String kenmerken, String faciliteiten, double tarieven, int capZittend, int capStaand, int oppervlakte) { // byte[] profiel) {
        this.zaalId = zaalId;
        this.naam = naam;
        this.adres = adres;
        this.huisnummer = huisnummer;
        this.gemeente = gemeente;
        this.postcode = postcode;
        this.email = email;
        this.kenmerken = kenmerken;
        this.faciliteiten = faciliteiten;
        this.tarieven = tarieven;
        this.capZittend = capZittend;
        this.capStaand = capStaand;
        this.oppervlakte = oppervlakte;
        this.profiel = profiel;
    }

    public Zaal() {

    }

}
