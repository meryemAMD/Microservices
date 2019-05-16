package com.safihub.hub.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("s")
public class Sponsor  extends  Compte{
    private String nomEnt;
    private  String adrEnt;

    public Sponsor() {
    }

    public Sponsor(int id, String nom, String prenom, String email, String password, String nomEnt, String adrEnt) {
        super(id, nom, prenom, email, password);
        this.nomEnt = nomEnt;
        this.adrEnt = adrEnt;
    }

    public String getNomEnt() {
        return nomEnt;
    }

    public void setNomEnt(String nomEnt) {
        this.nomEnt = nomEnt;
    }

    public String getAdrEnt() {
        return adrEnt;
    }

    public void setAdrEnt(String adrEnt) {
        this.adrEnt = adrEnt;
    }
}
