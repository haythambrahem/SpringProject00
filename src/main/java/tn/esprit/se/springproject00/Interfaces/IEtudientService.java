package tn.esprit.se.springproject00.Interfaces;

import tn.esprit.se.springproject00.Entity.Etudiant;

import java.util.List;

public interface IEtudientService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);
}

