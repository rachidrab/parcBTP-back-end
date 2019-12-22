package com.pfa.parcBTP.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "camion")
public class Camion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "camion_id")
    private int camion_id;

    private String marque;

    private String carburant;

    private double ChargePoids;

    //bi-directional many-to-one association to Collaborateurtache
    @OneToMany(mappedBy="camion", fetch=FetchType.EAGER)
    private Set<BonTransport> bonTransports;


    public Camion() {
    }



    public void setBonTransports(Set<BonTransport> bonTransports) {
        this.bonTransports = bonTransports;
    }

    public Camion(String marque, String carburant, double chargePoids) {
        this.marque = marque;
        this.carburant = carburant;
        ChargePoids = chargePoids;
    }

    public int getCamion_id() {
        return camion_id;
    }

    public void setCamion_id(int camion_id) {
        this.camion_id = camion_id;
    }



    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public double getChargePoids() {
        return ChargePoids;
    }

    public void setChargePoids(double chargePoids) {
        ChargePoids = chargePoids;
    }
}
