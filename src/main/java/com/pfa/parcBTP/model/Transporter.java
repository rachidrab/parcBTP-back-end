package com.pfa.parcBTP.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
@DiscriminatorValue("transporter")
@Table(name = "transporter")
public class Transporter extends User implements Serializable {

    private static final long serialVersionUID = 1L;


    @ManyToMany
    @JoinTable(
            name = "bon_transport",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "camion_id"))
    Set<Camion> camions;

    private String permis;



    public Transporter() {
    }

    public Transporter(User users, Set<Camion> camions, String permis) {
        super(users);
        this.camions = camions;
        this.permis = permis;
    }

    public Transporter(Set<Camion> camions) {
        this.camions = camions;
    }

    public Set<Camion> getCamions() {
        return camions;
    }

    public void setCamions(Set<Camion> camions) {
        this.camions = camions;
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
