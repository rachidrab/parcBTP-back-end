package com.pfa.parcBTP.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BonTransportPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(insertable=false, updatable=false)
    private int camion_id;

    @Column(insertable=false, updatable=false)
    private String user_id;


    public BonTransportPK() {
    }

    public int getCamion_id() {
        return camion_id;
    }

    public void setCamion_id(int camion_id) {
        this.camion_id = camion_id;
    }

    public String getUser_id() {
        return user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BonTransportPK that = (BonTransportPK) o;
        return camion_id == that.camion_id &&
                Objects.equals(user_id, that.user_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(camion_id, user_id);
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
