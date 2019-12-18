package com.pfa.parcBTP.model;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("engin")
public class Engin extends ObjetMobile {

    // private static final long serialVersionUID = 1L;

    private String carburant;


    @OneToMany(fetch= FetchType.LAZY, cascade= CascadeType.ALL)
    private List<Accessoire> accessoires ;



    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public List<Accessoire> getAccessoires() {
        return accessoires;
    }

    public void setAccessoires(List<Accessoire> accessoires) {
        this.accessoires = accessoires;
    }
}
