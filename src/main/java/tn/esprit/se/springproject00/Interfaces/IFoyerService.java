package tn.esprit.se.springproject00.Interfaces;

import tn.esprit.se.springproject00.Entity.Etudiant;
import tn.esprit.se.springproject00.Entity.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer(Foyer f);

    Foyer updateFoyer(Foyer e);

    Foyer retrieveFoyer(Long idFoyer);

    void removeFoyer(Long idFoyer);
}
