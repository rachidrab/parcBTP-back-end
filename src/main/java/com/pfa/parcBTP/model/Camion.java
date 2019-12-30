package com.pfa.parcBTP.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "camion")
public class Camion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String marque;

    private String modele;

    private String boiteVitesse;

    private String kilometrage;

    private String carburant;

    private String chargePoids;

    private String puissance;




    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="camion", fetch=FetchType.EAGER)
    private Set<BonTransport> bonTransports;


    public Camion() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBoiteVitesse() {
        return boiteVitesse;
    }

    public void setBoiteVitesse(String boiteVitesse) {
        this.boiteVitesse = boiteVitesse;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(String kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public String getChargePoids() {
        return chargePoids;
    }

    public void setChargePoids(String chargePoids) {
        this.chargePoids = chargePoids;
    }

    public String getPuissance() {
        return puissance;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }
}
