package com.pfa.parcBTP.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Inheritance(strategy =InheritanceType.JOINED)
@DiscriminatorColumn(name="objets")
// @NamedQuery(name="user.findAll", query="SELECT u FROM user u")
@Table(name = "objet_mobile")
public class ObjetMobile implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Size(min=3, max = 50)
    private String type;

    @NotBlank
    @Size(min=3, max = 50)
    private String designation;


    @NotBlank
    @Size(min=3, max = 50)
    private double poids;

    private String marque;

    private String modele;



    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="objetMobile", fetch=FetchType.EAGER)
    private Set<HistoriquePannes> historiquePannes;





    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="objetMobile", fetch=FetchType.LAZY)
    private Set<ObjetChantier> objetChantiers;


    public void setObjetChantiers(Set<ObjetChantier> objetChantiers) {
        this.objetChantiers = objetChantiers;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setHistoriquePannes(Set<HistoriquePannes> historiquePannes) {
        this.historiquePannes = historiquePannes;
    }
}
