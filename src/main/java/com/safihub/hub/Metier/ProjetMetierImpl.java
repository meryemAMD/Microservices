package com.safihub.hub.Metier;
import com.safihub.hub.Dao.ProjetRepository;
import com.safihub.hub.entities.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetMetierImpl implements ProjetMetier {
    @Autowired
    private  ProjetRepository projetRepository;

    @Override
    public Projet SaveProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public Page<Projet> GetProjet(int page) {
        return projetRepository.findAll(new PageRequest(page,8));
    }
    @Override
    public Projet GetProjetbyID(int id) {
        return projetRepository.getOne(id);
    }

    @Override
    public Projet UpdateProjet(Projet p) {
        return projetRepository.save(p) ;
    }
}

