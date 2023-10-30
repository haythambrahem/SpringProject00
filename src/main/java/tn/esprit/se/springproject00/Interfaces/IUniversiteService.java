package tn.esprit.se.springproject00.Interfaces;

import tn.esprit.se.springproject00.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite addUniversite(Universite u);

    Universite updateUniversite(Universite e);

    Universite retrieveUniversite(Long idUniversite);

    void removeUniversite(Long idUniversite);
}
