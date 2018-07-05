package net.joastbg.sampleapp.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ASSURANCE")
public class Assurance {

    @Id
    @Column(name ="numeroAssurance")
    private int numeroAssurance;
    @Column(name="dateSouscription")
    private Date dateSouscription;
    @Column(name="dateAnniverssaire")
    private Date dateAnniversaire;
    @Column(name="datePrelevement")
    private Date datePrelevement;
     // private Echeances echeances;
    
    public Assurance(){
        
    
    }
    
    

    /**
     * @return the dateSouscription
     */
    public Date getDateSouscription() {
        return dateSouscription;
    }

    /**
     * @param dateSouscription the dateSouscription to set
     */
    public void setDateSouscription(Date dateSouscription) {
        this.dateSouscription = dateSouscription;
    }

    /**
     * @return the dateAnniversaire
     */
    public Date getDateAnniversaire() {
        return dateAnniversaire;
    }

    /**
     * @param dateAnniversaire the dateAnniversaire to set
     */
    public void setDateAnniversaire(Date dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    /**
     * @return the datePrelevement
     */
    public Date getDatePrelevement() {
        return datePrelevement;
    }

    /**
     * @param datePrelevement the datePrelevement to set
     */
    public void setDatePrelevement(Date datePrelevement) {
        this.datePrelevement = datePrelevement;
    }
    
    
    public void resilie(){
        
    
    
    }

}
