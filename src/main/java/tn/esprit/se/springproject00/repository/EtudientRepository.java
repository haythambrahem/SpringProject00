package tn.esprit.se.springproject00.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springproject00.Entity.Etudiant;

public interface EtudientRepository extends JpaRepository<Etudiant,Long> {


    Etudiant findByNomEtAndPrenomEt(String nomEt, String prenomEt);
}
