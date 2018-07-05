package net.joastbg.sampleapp.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ECHEANCES")
public class Echeances {

    
    @Id
    @Column(name="idEcheance")
    private int idEcheance;
    
    
    @Column(name="numeroAssurance")
    private int numeroAssurance;
    
    
    
    @Column(name="prix")
    private double prix;
    @Column(name="dateEmission")
    private Date dateEmission;
    @Column(name="datePaiement")
    private Date datePaiement;
    @Column(name="dateEmissionFacture")
    private Date emissionFacture;
    
     // private List<Echeances> ech = new ArrayList<>();
    
    
    public void imprimeEcheance(){
    
        
    
    }

   

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * @return the dateEmission
     */
    public Date getDateEmission() {
        return dateEmission;
    }

    /**
     * @param dateEmission the dateEmission to set
     */
    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    /**
     * @return the datePaiement
     */
    public Date getDatePaiement() {
        return datePaiement;
    }

    /**
     * @param datePaiement the datePaiement to set
     */
    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    /**
     * @return the emissionFacture
     */
    public Date getEmissionFacture() {
        return emissionFacture;
    }

    /**
     * @param emissionFacture the emissionFacture to set
     */
    public void setEmissionFacture(Date emissionFacture) {
        this.emissionFacture = emissionFacture;
    }
    
}
