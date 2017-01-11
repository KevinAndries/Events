/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andri
 */
@Entity
@Table(name = "zaal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "zaal.findAll", query = "SELECT z FROM zaal z"),
    @NamedQuery(name = "zaal.findByZaalid", query = "SELECT z FROM zaal z WHERE z.zaalid = :zaalid"),
    @NamedQuery(name = "zaal.findByNaam", query = "SELECT z FROM zaal z WHERE z.naam = :naam"),
    @NamedQuery(name = "zaal.findByAdres", query = "SELECT z FROM zaal z WHERE z.adres = :adres"),
    @NamedQuery(name = "zaal.findByHuisnummer", query = "SELECT z FROM zaal z WHERE z.huisnummer = :huisnummer"),
    @NamedQuery(name = "zaal.findByGemeente", query = "SELECT z FROM zaal z WHERE z.gemeente = :gemeente"),
    @NamedQuery(name = "zaal.findByPostcode", query = "SELECT z FROM zaal z WHERE z.postcode = :postcode"),
    @NamedQuery(name = "zaal.findByEmail", query = "SELECT z FROM zaal z WHERE z.email = :email"),
    @NamedQuery(name = "zaal.findByFaciliteiten", query = "SELECT z FROM zaal z WHERE z.faciliteiten = :faciliteiten"),
    @NamedQuery(name = "zaal.findByKenmerken", query = "SELECT z FROM zaal z WHERE z.kenmerken = :kenmerken"),
    @NamedQuery(name = "zaal.findByTarieven", query = "SELECT z FROM zaal z WHERE z.tarieven = :tarieven"),
    @NamedQuery(name = "zaal.findByCapzittend", query = "SELECT z FROM zaal z WHERE z.capzittend = :capzittend"),
    @NamedQuery(name = "zaal.findByCapstaand", query = "SELECT z FROM zaal z WHERE z.capstaand = :capstaand"),
    @NamedQuery(name = "zaal.findByOppervlakte", query = "SELECT z FROM zaal z WHERE z.oppervlakte = :oppervlakte")})
public class zaal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ZAALID", nullable = false)
    private Integer zaalid;
    @Size(max = 255)
    @Column(name = "NAAM", length = 255)
    private String naam;
    @Size(max = 255)
    @Column(name = "ADRES", length = 255)
    private String adres;
    @Column(name = "HUISNUMMER")
    private Integer huisnummer;
    @Size(max = 255)
    @Column(name = "GEMEENTE", length = 255)
    private String gemeente;
    @Column(name = "POSTCODE")
    private Integer postcode;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL", length = 255)
    private String email;
    @Size(max = 255)
    @Column(name = "FACILITEITEN", length = 255)
    private String faciliteiten;
    @Size(max = 255)
    @Column(name = "KENMERKEN", length = 255)
    private String kenmerken;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TARIEVEN", precision = 22)
    private Double tarieven;
    @Column(name = "CAPZITTEND")
    private Integer capzittend;
    @Column(name = "CAPSTAAND")
    private Integer capstaand;
    @Column(name = "OPPERVLAKTE")
    private Integer oppervlakte;
    @Lob
    @Size(max = 65535)
    @Column(name = "PROFIEL", length = 65535)
    private String profiel;

    public zaal() {
    }

    public zaal(Integer zaalid) {
        this.zaalid = zaalid;
    }

    public Integer getZaalid() {
        return zaalid;
    }

    public void setZaalid(Integer zaalid) {
        this.zaalid = zaalid;
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

    public Integer getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(Integer huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaciliteiten() {
        return faciliteiten;
    }

    public void setFaciliteiten(String faciliteiten) {
        this.faciliteiten = faciliteiten;
    }

    public String getKenmerken() {
        return kenmerken;
    }

    public void setKenmerken(String kenmerken) {
        this.kenmerken = kenmerken;
    }

    public Double getTarieven() {
        return tarieven;
    }

    public void setTarieven(Double tarieven) {
        this.tarieven = tarieven;
    }

    public Integer getCapzittend() {
        return capzittend;
    }

    public void setCapzittend(Integer capzittend) {
        this.capzittend = capzittend;
    }

    public Integer getCapstaand() {
        return capstaand;
    }

    public void setCapstaand(Integer capstaand) {
        this.capstaand = capstaand;
    }

    public Integer getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(Integer oppervlakte) {
        this.oppervlakte = oppervlakte;
    }

    public String getProfiel() {
        return profiel;
    }

    public void setProfiel(String profiel) {
        this.profiel = profiel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zaalid != null ? zaalid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof zaal)) {
            return false;
        }
        zaal other = (zaal) object;
        if ((this.zaalid == null && other.zaalid != null) || (this.zaalid != null && !this.zaalid.equals(other.zaalid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.zaal[ zaalid=" + zaalid + " ]";
    }
    
}
