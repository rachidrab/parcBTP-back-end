package com.pfa.parcBTP.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class HistoriquePannes {

    @EmbeddedId
    private HistoriquePannesPK id;

    private Date dateStatut;

    //bi-directional many-to-one association to Collaborateur
    @ManyToOne
    @JoinColumn(name="objet_id", insertable=false, updatable=false)
    private ObjetMobile objetMobile;

    //bi-directional many-to-one association to Tache
    @ManyToOne
    @JoinColumn(name="statut_id",insertable=false, updatable=false)
    private Status status;


    public HistoriquePannes() {
    }

    public HistoriquePannesPK getId() {
        return id;
    }

    public void setId(HistoriquePannesPK id) {
        this.id = id;
    }

    public Date getDateStatut() {
        return dateStatut;
    }

    public void setDateStatut(Date dateStatut) {
        this.dateStatut = dateStatut;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ObjetMobile getObjetMobile() {
        return objetMobile;
    }

    public void setObjetMobile(ObjetMobile objetMobile) {
        this.objetMobile = objetMobile;
    }
}
