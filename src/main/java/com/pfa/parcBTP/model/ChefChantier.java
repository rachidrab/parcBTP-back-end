package com.pfa.parcBTP.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@DiscriminatorValue("chefChantier")
@Table(name = "chef_chantier")
public class ChefChantier extends User implements Serializable {

    private static final long serialVersionUID = 1L;


    private String specialite;


    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="chefChantier", fetch=FetchType.EAGER)
    private Set<PiloteChantier> piloteChantiers;

    public ChefChantier() {
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}

