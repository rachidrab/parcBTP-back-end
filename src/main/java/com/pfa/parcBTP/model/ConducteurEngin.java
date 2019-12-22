package com.pfa.parcBTP.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ConducteurEngin implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ConducteurEnginPK id;

    private Date dateDebut;
    private Date dateFin;

    //bi-directional many-to-one association to Collaborateur
    @ManyToOne
    @JoinColumn(name="user_id", insertable=false, updatable=false)
    private Conducteur conducteur;

    //bi-directional many-to-one association to Tache
    @ManyToOne
    @JoinColumn(name="engin_id",insertable=false, updatable=false)
    private Engin engin;


    public ConducteurEngin() {
    }

    public ConducteurEnginPK getId() {
        return id;
    }

    public void setId(ConducteurEnginPK id) {
        this.id = id;
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

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public Engin getEngin() {
        return engin;
    }

    public void setEngin(Engin engin) {
        this.engin = engin;
    }
}
