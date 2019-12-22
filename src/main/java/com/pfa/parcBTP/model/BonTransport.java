package com.pfa.parcBTP.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class BonTransport implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private BonTransportPK id;

    private Date dateTransport;

    //bi-directional many-to-one association to Collaborateur
    @ManyToOne
    @JoinColumn(name="user_id", insertable=false, updatable=false)
    private Transporter transporteur;

    //bi-directional many-to-one association to Tache
    @ManyToOne
    @JoinColumn(name="camion_id",insertable=false, updatable=false)
    private Camion camion;


    public BonTransport() {
    }

    public BonTransportPK getId() {
        return id;
    }

    public void setId(BonTransportPK id) {
        this.id = id;
    }

    public Date getDateTransport() {
        return dateTransport;
    }

    public void setDateTransport(Date dateTransport) {
        this.dateTransport = dateTransport;
    }

    public Transporter getTransporteur() {
        return transporteur;
    }

    public void setTransporteur(Transporter transporteur) {
        this.transporteur = transporteur;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }
}
