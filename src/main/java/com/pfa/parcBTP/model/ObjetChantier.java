package com.pfa.parcBTP.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class ObjetChantier implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ObjetChantierPK id;

    private Date dateDebut;

    private Date dateFin;



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


    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public ObjetChantierPK getId() {
        return id;
    }

    public void setId(ObjetChantierPK id) {
        this.id = id;
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
