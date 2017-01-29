//    Author     : Andries Kevin

package DAL;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "afbeelding")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "afbeelding.findAll", query = "SELECT a FROM afbeelding a"),
    @NamedQuery(name = "afbeelding.findByAfbeeldingid", query = "SELECT a FROM afbeelding a WHERE a.afbeeldingid = :afbeeldingid")})
public class afbeelding implements Serializable {

    @Lob
    @Size(max = 65535)
    @Column(name = "AFBEELDING")
    private String afbeelding;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AFBEELDINGID")
    private Integer afbeeldingid;
    @JoinColumn(name = "ZAALID", referencedColumnName = "ZAALID")
    @ManyToOne(optional = false)
    private zaal zaalid;
   
    public afbeelding() {
    }

    public afbeelding(Integer afbeeldingid) {
        this.afbeeldingid = afbeeldingid;
    }

    public afbeelding(Integer afbeeldingid, byte[] afbeelding) {
        this.afbeeldingid = afbeeldingid;

    }

    public Integer getAfbeeldingid() {
        return afbeeldingid;
    }

    public void setAfbeeldingid(Integer afbeeldingid) {
        this.afbeeldingid = afbeeldingid;
    }

    public zaal getZaalid() {
        return zaalid;
    }

    public void setZaalid(zaal zaalid) {
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
        if (!(object instanceof afbeelding)) {
            return false;
        }
        afbeelding other = (afbeelding) object;
        if ((this.afbeeldingid == null && other.afbeeldingid != null) || (this.afbeeldingid != null && !this.afbeeldingid.equals(other.afbeeldingid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.afbeelding[ afbeeldingid=" + afbeeldingid + " ]";
    }

    public String getAfbeelding() {
        return afbeelding;
    }

    public void setAfbeelding(String afbeelding) {
        this.afbeelding = afbeelding;
    }

}
