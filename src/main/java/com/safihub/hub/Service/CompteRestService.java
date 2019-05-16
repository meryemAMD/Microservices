package com.safihub.hub.Service;
import com.safihub.hub.Metier.CompteMetier;

import com.safihub.hub.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompteRestService {

    @Autowired
    private CompteMetier compteMetier;
    @RequestMapping(value="/comptes",method = RequestMethod.POST)
    public Compte saveCompte(@RequestBody  Compte cp) {
        return compteMetier.saveCompte(cp);
    }
    @RequestMapping(value="/comptes/{id}",method = RequestMethod.GET)
    public Compte getCompte(@PathVariable int id) {
        return compteMetier.getCompte(id);
    }
    @RequestMapping(value="/comptes",method = RequestMethod.PUT)
    public Compte updateCompte(@RequestBody  Compte C) {
        return compteMetier.updateCompte(C);

    }



}
