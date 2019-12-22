package com.pfa.parcBTP.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@DiscriminatorValue("conducteur")
@Table(name = "conducteur")
public class Conducteur extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="conducteur", fetch= FetchType.EAGER)
    private Set<ConducteurEngin> conducteurEngins;


    private String permis;

    public Conducteur() {
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }
}
