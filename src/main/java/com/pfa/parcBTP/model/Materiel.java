package com.pfa.parcBTP.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("materiel")
public class Materiel extends ObjetMobile implements Serializable {
    private static final long serialVersionUID = 1L;


    public Materiel() {
    }
}
