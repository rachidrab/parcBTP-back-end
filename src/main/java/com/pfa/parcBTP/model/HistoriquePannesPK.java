package com.pfa.parcBTP.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HistoriquePannesPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(insertable=false, updatable=false)
    private int objet_id;

    @Column(insertable=false, updatable=false)
    private String Statut_id;

    public HistoriquePannesPK() {
    }

    public int getObjet_id() {
        return objet_id;
    }

    public void setObjet_id(int objet_id) {
        this.objet_id = objet_id;
    }

    public String getStatut_id() {
        return Statut_id;
    }

    public void setStatut_id(String statut_id) {
        Statut_id = statut_id;
    }
}
