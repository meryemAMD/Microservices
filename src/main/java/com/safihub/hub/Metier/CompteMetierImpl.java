package com.safihub.hub.Metier;

import com.safihub.hub.Dao.CompteRepository;
import com.safihub.hub.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteMetierImpl implements CompteMetier {

    @Autowired
    private CompteRepository compteRepository ;
    @Override
    public Compte saveCompte(Compte c) {
        return compteRepository.save(c);
    }

    @Override
    public Compte getCompte(int id) {
        return compteRepository.getOne(id);
    }

    @Override
    public Compte updateCompte(Compte c) {
        return compteRepository.save(c);
    }
}
