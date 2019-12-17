package com.pfa.parcBTP.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@DiscriminatorValue("chefChantier")
@Table(name = "chef_chantier")
public class ChefChantier extends User implements Serializable {

    private static final long serialVersionUID = 1L;


    private String specialite;

    public ChefChantier() {
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}

