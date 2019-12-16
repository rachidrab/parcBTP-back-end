package com.pfa.parcBTP.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@DiscriminatorValue("magasinier")
@Table(name = "magasinier")
public class Magasinier extends User implements Serializable {

    private static final long serialVersionUID = 1L;


    public Magasinier() {

    }


}
