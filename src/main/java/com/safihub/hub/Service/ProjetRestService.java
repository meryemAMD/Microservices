package com.safihub.hub.Service;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.safihub.hub.Metier.ProjetMetier;
import com.safihub.hub.entities.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
public class ProjetRestService {
    @Autowired
    private ProjetMetier projetMetier;
    @RequestMapping(value = "/Projets",method =RequestMethod.POST )
    public Projet SaveProjet(@RequestBody Projet p) {
        //     ObjectMapper mapper = new ObjectMapper(); mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        return projetMetier.SaveProjet(p);
    }

    @RequestMapping(value = "/Projets/{page}",method = RequestMethod.GET)
    public Page<Projet> GetProjet(@PathVariable int page) {
        return projetMetier.GetProjet(page);
    }

    @RequestMapping(value = "/Projets",method = RequestMethod.GET)
    public Page<Projet> GetProjet() {
        return projetMetier.GetProjet(0);
    }

    @RequestMapping(value = "/Projets",method =RequestMethod.PUT )
    public Projet UpdateProjet(@RequestBody Projet p) {
        return projetMetier.UpdateProjet(p);
    }

    @RequestMapping(value = "/Projet/{id}",method = RequestMethod.GET)
    public Projet GetProjetbyID(@PathVariable int id ) {
        return projetMetier.GetProjetbyID(id);
    }


}


