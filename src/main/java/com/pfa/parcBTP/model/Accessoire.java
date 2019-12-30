package com.pfa.parcBTP.model;

import javax.persistence.*;

@Entity
public class Accessoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accessoire_id")
    private int id;


    private String nom;


    public Accessoire() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
