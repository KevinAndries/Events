
package BO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andries Kevin
 */
@Entity
@Table(name = "afbeelding")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Afbeelding.findAll", query = "SELECT a FROM Afbeelding a"),
    @NamedQuery(name = "Afbeelding.findByAfbeeldingid", query = "SELECT a FROM Afbeelding a WHERE a.afbeeldingid = :afbeeldingid")})
public class Afbeelding implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AFBEELDINGID")
    private Integer afbeeldingid;
    @Lob
    @Column(name = "AFBEELDING")
    private String afbeelding;
    @JoinColumn(name = "ZAALID", referencedColumnName = "ZAALID")
    @ManyToOne(optional = false)
    private int zaalid;

    public Afbeelding() {
    }

    public Afbeelding(Integer afbeeldingid) {
        this.afbeeldingid = afbeeldingid;
    }

    public Integer getAfbeeldingid() {
        return afbeeldingid;
    }

    public void setAfbeeldingid(Integer afbeeldingid) {
        this.afbeeldingid = afbeeldingid;
    }

    public String getAfbeelding() {
        return afbeelding;
    }

    public void setAfbeelding(String afbeelding) {
        this.afbeelding = afbeelding;
    }

    public int getZaalid() {
        return zaalid;
    }

    public void setZaalid(int zaalid) {
        this.zaalid = zaalid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (afbeeldingid != null ? afbeeldingid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Afbeelding)) {
            return false;
        }
        Afbeelding other = (Afbeelding) object;
        if ((this.afbeeldingid == null && other.afbeeldingid != null) || (this.afbeeldingid != null && !this.afbeeldingid.equals(other.afbeeldingid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        
        String afb = afbeelding;
        String replAfb = afb.replaceAll("Images/Zalen/", "");
        
        return replAfb;
    }
    

    public void setZaalid(String zaalid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
