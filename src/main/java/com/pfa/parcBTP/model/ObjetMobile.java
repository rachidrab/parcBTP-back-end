package com.pfa.parcBTP.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;


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


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="status")
    public Status status;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="marque")
    public Marque marque;


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


}
