package com.pfa.parcBTP.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "chantier")
public class Chantier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chantier_id")
    private int id;


    private String nom;


    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="chantier", fetch=FetchType.EAGER)
    private Set<PiloteChantier> piloteChantiers;

    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="chantier", fetch=FetchType.LAZY)
    private Set<ObjetChantier> objetChantiers;


    public Chantier() {
    }



    public void setObjetChantiers(Set<ObjetChantier> objetChantiers) {
        this.objetChantiers = objetChantiers;
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

    public void setPiloteChantiers(Set<PiloteChantier> piloteChantiers) {
        this.piloteChantiers = piloteChantiers;
    }
}
