package com.pfa.parcBTP.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@DiscriminatorValue("transporter")
@Table(name = "transporter")
public class Transporter extends User implements Serializable {

    private static final long serialVersionUID = 1L;


    private String permis;

    public Transporter() {
    }

    public Transporter(String permis) {
        this.permis = permis;
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }
}
