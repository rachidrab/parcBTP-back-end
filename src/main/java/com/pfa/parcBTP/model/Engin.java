package com.pfa.parcBTP.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("engin")
public class Engin extends ObjetMobile {

    // private static final long serialVersionUID = 1L;

    private String carburant;

    public Engin() {
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }
}
