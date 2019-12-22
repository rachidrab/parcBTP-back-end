package com.pfa.parcBTP.model;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class PiloteChantier implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private PiloteChantierPK id;

    private Date dateDebut;
    private Date dateFin;


    //bi-directional many-to-one association to Collaborateur
    @ManyToOne
    @JoinColumn(name="user_id", insertable=false, updatable=false)
    private ChefChantier chefChantier;

    //bi-directional many-to-one association to Tache
    @ManyToOne
    @JoinColumn(name="chantier_id",insertable=false, updatable=false)
    private Chantier chantier;


    public PiloteChantier() {
    }

    public PiloteChantierPK getId() {
        return id;
    }

    public void setId(PiloteChantierPK id) {
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

    public ChefChantier getChefChantier() {
        return chefChantier;
    }

    public void setChefChantier(ChefChantier chefChantier) {
        this.chefChantier = chefChantier;
    }

    public Chantier getChantier() {
        return chantier;
    }

    public void setChantier(Chantier chantier) {
        this.chantier = chantier;
    }
}
