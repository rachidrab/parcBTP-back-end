package com.pfa.parcBTP.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ConducteurEnginPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(insertable=false, updatable=false)
    private int engin_id;

    @Column(insertable=false, updatable=false)
    private String user_id;


    public ConducteurEnginPK() {
    }

    public int getEngin_id() {
        return engin_id;
    }

    public void setEngin_id(int engin_id) {
        this.engin_id = engin_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
