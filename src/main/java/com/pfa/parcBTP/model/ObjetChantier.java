package com.pfa.parcBTP.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ObjetChantier implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ObjetChantierPK id;

    private Date date;


    //bi-directional many-to-one association to Collaborateur
    @ManyToOne
    @JoinColumn(name="objetMobile_id", insertable=false, updatable=false)
    private ObjetMobile objetMobile;

    //bi-directional many-to-one association to Tache
    @ManyToOne
    @JoinColumn(name="chantier_id",insertable=false, updatable=false)
    private Chantier chantier;

    public ObjetChantier() {
    }

    public ObjetChantierPK getId() {
        return id;
    }

    public void setId(ObjetChantierPK id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ObjetMobile getObjetMobile() {
        return objetMobile;
    }

    public void setObjetMobile(ObjetMobile objetMobile) {
        this.objetMobile = objetMobile;
    }

    public Chantier getChantier() {
        return chantier;
    }

    public void setChantier(Chantier chantier) {
        this.chantier = chantier;
    }
}
