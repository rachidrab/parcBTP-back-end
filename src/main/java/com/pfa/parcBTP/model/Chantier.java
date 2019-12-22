package com.pfa.parcBTP.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "chantier")
public class Chantier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chantier_id")
    private int chantier_id;


    private String nom;


    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="chantier", fetch=FetchType.EAGER)
    private Set<PiloteChantier> piloteChantiers;

    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="chantier", fetch=FetchType.EAGER)
    private Set<ObjetChantier> objetChantiers;


    public Chantier() {
    }

    public Set<ObjetChantier> getObjetChantiers() {
        return objetChantiers;
    }

    public void setObjetChantiers(Set<ObjetChantier> objetChantiers) {
        this.objetChantiers = objetChantiers;
    }

    public int getChantier_id() {
        return chantier_id;
    }

    public void setChantier_id(int chantier_id) {
        this.chantier_id = chantier_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<PiloteChantier> getPiloteChantiers() {
        return piloteChantiers;
    }

    public void setPiloteChantiers(Set<PiloteChantier> piloteChantiers) {
        this.piloteChantiers = piloteChantiers;
    }
}
