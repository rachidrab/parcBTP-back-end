package com.pfa.parcBTP.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PiloteChantierPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(insertable=false, updatable=false)
    private int chantier_id;

    @Column(insertable=false, updatable=false)
    private String user_id;

    public PiloteChantierPK() {
    }

    public int getChantier_id() {
        return chantier_id;
    }

    public void setChantier_id(int chantier_id) {
        this.chantier_id = chantier_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PiloteChantierPK that = (PiloteChantierPK) o;
        return chantier_id == that.chantier_id &&
                Objects.equals(user_id, that.user_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chantier_id, user_id);
    }
}
