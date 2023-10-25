package tn.esprit.se.springproject00.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject00.Entity.Bloc;
import tn.esprit.se.springproject00.Entity.Chambre;
import tn.esprit.se.springproject00.Entity.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

   // List<Chambre> findByBlocAndTypeChambre(Bloc blocs, TypeChambre typeChambre);

   // List<Chambre> findByEstValide(boolean estValide);

   // List<Chambre> findByBlocAndCapaciteGreaterThan(Bloc blocs, int capaciteMinimale);

}
