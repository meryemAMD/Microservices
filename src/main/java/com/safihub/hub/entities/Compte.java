package com.safihub.hub.entities;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_cmpt" ,discriminatorType = DiscriminatorType.STRING,length = 20)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "type_cmpt")
@JsonSubTypes(
        {
                @JsonSubTypes.Type(name = "pp",value = PorteurP.class),
                @JsonSubTypes.Type(name = "s",value = Sponsor.class),
                @JsonSubTypes.Type(name = "c",value = Compte.class)
        }
)

public class Compte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id  ;
    private  String nom;
    private  String Prenom;
    private  String email;
    private  String  password;
    @OneToMany(mappedBy = "compte",fetch = FetchType.LAZY)
    private Collection<Projet> listIS;

    public Compte() {
    }

    public Compte(int id, String nom, String prenom, String email, String password) {
        this.id = id;
        this.nom = nom;
        Prenom = prenom;
        this.email = email;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this .password = password;
    }

    public Collection<Projet> getListIS() {
        return listIS;
    }

    public void setListIS(Collection<Projet> listIS) {
        this.listIS = listIS;
    }
}
