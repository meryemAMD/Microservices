package com.safihub.hub.Metier;
import com.safihub.hub.entities.Projet;
import org.hibernate.validator.constraints.URL;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProjetMetier {
    public Projet SaveProjet(Projet p);
    public Page<Projet> GetProjet(int page);
    public Projet GetProjetbyID(int id);
    public  Projet UpdateProjet(Projet p);

}