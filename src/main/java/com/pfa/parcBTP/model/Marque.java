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
public class Marque {

    @Id
    private int marque_id;

    private String marque;

    private String modele;




    @OneToMany(mappedBy = "marque")
    private List<ObjetMobile> objets_mobiles;



    public Marque() {
    }

    public int getMarque_id() {
        return marque_id;
    }

    public void setMarque_id(int marque_id) {
        this.marque_id = marque_id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public List<ObjetMobile> getObjets_mobiles() {
        return objets_mobiles;
    }

    public void setObjets_mobiles(List<ObjetMobile> objets_mobiles) {
        this.objets_mobiles = objets_mobiles;
    }
}
