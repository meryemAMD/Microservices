package com.safihub.hub.Metier;
import com.safihub.hub.entities.Compte;

public interface CompteMetier {
    public Compte saveCompte(Compte c);
    public  Compte getCompte(int id);
    public  Compte updateCompte(Compte C);
}
