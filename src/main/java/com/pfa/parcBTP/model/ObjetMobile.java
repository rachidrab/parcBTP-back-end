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


    @OneToMany(cascade=CascadeType.ALL)
    private List<Status> status ;


    @OneToMany(cascade=CascadeType.ALL)
    private List<Marque> marques;


    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="objetMobile", fetch=FetchType.EAGER)
    private Set<ObjetChantier> objetChantiers;

    public Set<ObjetChantier> getObjetChantiers() {
        return objetChantiers;
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

    public List<Status> getStatus() {
        return status;
    }

    public void setStatus(List<Status> status) {
        this.status = status;
    }

    public List<Marque> getMarques() {
        return marques;
    }

    public void setMarques(List<Marque> marques) {
        this.marques = marques;
    }
}
