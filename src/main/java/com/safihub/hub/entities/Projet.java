package com.safihub.hub.entities;

import javax.persistence.*;
import java.awt.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Projet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String domaine;
    private String description;
    private  Date dateDeb;
    private  Date dateFin;
    private String statut;
    private  Byte[] image ;

    @ManyToOne
    @JoinColumn(name = "id_cmpt")
    private  Compte compte;

    public Projet() {
    }

    public Projet(int id, String titre, String domaine, String description, String statut,Date dateDeb,Date dateFin,Byte[] image) {
        this.id = id;
        this.titre = titre;
        this.domaine = domaine;
        this.description = description;
        this.statut = statut;
        this.dateDeb=dateDeb;
        this.dateFin=dateFin;
        this.image=image;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Date getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
