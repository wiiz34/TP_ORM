package net.joastbg.sampleapp.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ASSURANCE_AUTO")
public class AssuranceAuto extends Assurance {
    
    @Column(name="bonusMalus")
    private int bonusmalus;
    
    @Column(name="immatriculation")
    private String immatriculation;
   // private PersonneMorale conducteurPrincipal;
   // private List<PersonnePhysique> conducteurSecondaire = new ArrayList<>();

  

    /**
     * @return the immatriculation
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * @param immatriculation the immatriculation to set
     */
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

   

    
    

    /**
     * @return the bonusmalus
     */
    public int getBonusmalus() {
        return bonusmalus;
    }

    /**
     * @param bonusmalus the bonusmalus to set
     */
    public void setBonusmalus(int bonusmalus) {
        this.bonusmalus = bonusmalus;
    }

   
    
}
