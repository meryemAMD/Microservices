package com.safihub.hub.entities;

import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("pp")
public class PorteurP extends  Compte {
    private String nomOrg;
    private  String adrOrg;

    public PorteurP() {
        super();
    }


    public PorteurP(int id, String nom, String prenom, String email, String password, String nomOrg, String adrOrg) {
        super(id, nom, prenom, email, password);
        this.nomOrg = nomOrg;
        this.adrOrg = adrOrg;
    }

    public String getNomOrg() {
        return nomOrg;
    }

    public void setNomOrg(String nomOrg) {
        this.nomOrg = nomOrg;
    }

    public String getAdrOrg() {
        return adrOrg;
    }

    public void setAdrOrg(String adrOrg) {
        this.adrOrg = adrOrg;
    }
}
