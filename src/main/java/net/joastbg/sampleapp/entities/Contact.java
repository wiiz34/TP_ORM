package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CONTACT")
public class Contact {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="idContact")
    private int contact;
    
    @Column(name="typeContact")
    private String typeContact;
    
    @Column(name="valeur")
    private String valeur;
    
    @Column(name="idClient")
    private int idClient;
    
}
