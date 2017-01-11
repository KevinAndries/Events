package BO;

/**
 *
 * @author Andries Kevin
 */
public class Zaal {

    private int ZaalId;
    private String naam;
    private String adres;
    private int huisnummer;
    private String gemeente;
    private int postcode;
    private String email;
    private String kenmerken;
    private String faciliteiten;
    private double tarieven;
    private int capZittend;
    private int capStaand;
    private int oppervlakte;
    private byte[] profiel;
    
// Constructor
    public Zaal() {
        ZaalId=0;
    }

    public Zaal(int ZaalId, String naam, String adres, int huisnummer, String gemeente, int postcode, String email, int capZittend, int capStaand, int oppervlakte, String kenmerken, String faciliteiten, double tarieven, byte[] profiel) {
        this.ZaalId = ZaalId;
        this.naam = naam;
        this.adres = adres;
        this.huisnummer = huisnummer;
        this.gemeente = gemeente;
        this.postcode = postcode;
        this.email = email;
        this.capZittend = capZittend;
        this.capStaand = capStaand;
        this.oppervlakte = oppervlakte;
        this.kenmerken = kenmerken;
        this.faciliteiten = faciliteiten;
        this.tarieven = tarieven;
        this.profiel = profiel;
    }

// Fields
    /**
     * @return the id
     */
    public int getZaalId() {
        return ZaalId;
    }

    /**
     * @param id the id to set
     */
 
        public void setZaalId(int ZaalId) {
        this.ZaalId = ZaalId;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * @return the adres
     */
    public String getAdres() {
        return adres;
    }

    /**
     * @param adres the adres to set
     */
    public void setAdres(String adres) {
        this.adres = adres;
    }

    /**
     * @return the huisnummer
     */
    public int getHuisnummer() {
        return huisnummer;
    }

    /**
     * @param huisnummer the huisnummer to set
     */
    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    /**
     * @return the gemeente
     */
    public String getGemeente() {
        return gemeente;
    }

    /**
     * @param gemeente the gemeente to set
     */
    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    /**
     * @return the postcode
     */
    public int getPostcode() {
        return postcode;
    }

    /**
     * @param postcode the postcode to set
     */
    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the capZittend
     */
    public int getCapZittend() {
        return capZittend;
    }

    /**
     * @param capZittend the capZittend to set
     */
    public void setCapZittend(int capZittend) {
        this.capZittend = capZittend;
    }

    /**
     * @return the capStaand
     */
    public int getCapStaand() {
        return capStaand;
    }

    /**
     * @param capStaand the capStaand to set
     */
    public void setCapStaand(int capStaand) {
        this.capStaand = capStaand;
    }

    /**
     * @return the oppervlakte
     */
    public int getOppervlakte() {
        return oppervlakte;
    }

    /**
     * @param oppervlakte the oppervlakte to set
     */
    public void setOppervlakte(int oppervlakte) {
        this.oppervlakte = oppervlakte;
    }

    /**
     * @return the kenmerken
     */
    public String getKenmerken() {
        return kenmerken;
    }

    /**
     * @param kenmerken the kenmerken to set
     */
    public void setKenmerken(String kenmerken) {
        this.kenmerken = kenmerken;
    }

    /**
     * @return the faciliteiten
     */
    public String getFaciliteiten() {
        return faciliteiten;
    }

    /**
     * @param faciliteiten the faciliteiten to set
     */
    public void setFaciliteiten(String faciliteiten) {
        this.faciliteiten = faciliteiten;
    }

    /**
     * @return the tarieven
     */
    public double getTarieven() {
        return tarieven;
    }

    /**
     * @param tarieven the tarieven to set
     */
    public void setTarieven(double tarieven) {
        this.tarieven = tarieven;
    }

    public byte[] getProfiel() {
        return profiel;
    }



    public void setProfiel(byte[] profiel) {
        this.profiel = profiel;
    }
    
    
    
    
    
    
    
    
    
    

// Override
    @Override
    public String toString() {
//        return "Id: " + id + " Zaal: " + naam +  "Adres: "+  adres + ", Huisnummer: " + huisnummer + ", Gemeente: " + gemeente + ", Postcode: " + postcode
//                + ", Capaciteit zittend: " + capZittend + ", Capaciteit Staand: " + capStaand + ", Oppervlakte: " + oppervlakte + ", Kenmerken: " + kenmerken
//                + ", Faciliteiten: " + faciliteiten + ", Tarieven: " + tarieven + "}";
        
                return "ID: " + ZaalId + " Zaal: " + naam +  "";//"Adres: "+  adres + ", Huisnummer: " + huisnummer + ", Gemeente: " + gemeente + ", Postcode: " + postcode
                //+ ", Capaciteit zittend: " + capZittend + ", Capaciteit Staand: " + capStaand + ", Oppervlakte: " + oppervlakte + ", Kenmerken: " + kenmerken
                //+ ", Faciliteiten: " + faciliteiten + ", Tarieven: " + tarieven + "}";
    }



    private void append(String property) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
