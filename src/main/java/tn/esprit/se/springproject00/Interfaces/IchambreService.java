package tn.esprit.se.springproject00.Interfaces;

import tn.esprit.se.springproject00.Entity.Chambre;
import tn.esprit.se.springproject00.Entity.Foyer;

import java.util.List;

public interface IchambreService {
    List<Chambre> retrieveAllChambre();

    Chambre addChambre(Chambre ch);

    Chambre updateChambre(Chambre ch);

    Chambre retrieveChambre(Long idChambre);

    void removeChambre(Long idChambre);
}
