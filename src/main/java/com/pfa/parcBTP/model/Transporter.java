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


    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="transporteur", fetch=FetchType.EAGER)
    private Set<BonTransport> bonTransports;


    private String permis;


    public Transporter() {
    }



    public void setBonTransports(Set<BonTransport> bonTransports) {
        this.bonTransports = bonTransports;
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
