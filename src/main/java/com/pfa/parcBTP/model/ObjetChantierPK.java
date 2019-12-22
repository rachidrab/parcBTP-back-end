package com.pfa.parcBTP.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ObjetChantierPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(insertable=false, updatable=false)
    private int chantier_id;

    @Column(insertable=false, updatable=false)
    private String objetMobile_id;

    public ObjetChantierPK() {
    }

    public int getChantier_id() {
        return chantier_id;
    }

    public void setChantier_id(int chantier_id) {
        this.chantier_id = chantier_id;
    }

    public String getObjetMobile_id() {
        return objetMobile_id;
    }

    public void setObjetMobile_id(String objetMobile_id) {
        this.objetMobile_id = objetMobile_id;
    }
}
