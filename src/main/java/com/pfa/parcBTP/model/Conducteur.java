package com.pfa.parcBTP.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@DiscriminatorValue("conducteur")
@Table(name = "conducteur")
public class Conducteur extends User implements Serializable {

    private static final long serialVersionUID = 1L;


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
