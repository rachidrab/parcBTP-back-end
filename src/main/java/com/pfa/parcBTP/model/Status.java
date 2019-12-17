package com.pfa.parcBTP.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Status {

    @Id
    private int status_id;

    private String etat;




    @OneToMany(mappedBy = "status")
    private List<ObjetMobile> objets_mobiles;





    public Status() { }


    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public List<ObjetMobile> getObjets_mobiles() {
        return objets_mobiles;
    }

    public void setObjets_mobiles(List<ObjetMobile> objets_mobiles) {
        this.objets_mobiles = objets_mobiles;
    }
}
