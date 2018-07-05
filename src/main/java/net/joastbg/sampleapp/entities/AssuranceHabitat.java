package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ASSURANCE_HABITATION")
public class AssuranceHabitat extends Assurance {
    
    //@Column(name="numeroAssurance")
   // private int numeroAssurance;
    
    @Column(name="adressAssure")
    private String adresseAssure;
    
    @Column(name="valeurCouverture")
    private String valeurCouverture;
    
    

    
    
    
}
