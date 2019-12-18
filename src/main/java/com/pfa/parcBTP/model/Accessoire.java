package com.pfa.parcBTP.model;

import javax.persistence.*;

@Entity
public class Accessoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accessoire_id")
    private int accessoire_id;


    private String nom;


    public Accessoire() {
    }

    public int getAccessoire_id() {
        return accessoire_id;
    }

    public void setAccessoire_id(int accessoire_id) {
        this.accessoire_id = accessoire_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
