package tn.esprit.se.springproject00.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject00.Entity.Bloc;
import tn.esprit.se.springproject00.Entity.Chambre;
import tn.esprit.se.springproject00.Entity.Reservation;
import tn.esprit.se.springproject00.Entity.TypeChambre;

import java.util.Date;
import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

   // List<Chambre> findByBlocAndTypeChambre(Bloc blocs, TypeChambre typeChambre);

   // List<Chambre> findByEstValide(boolean estValide);

   // List<Chambre> findByBlocAndCapaciteGreaterThan(Bloc blocs, int capaciteMinimale);

    //public long countByBlocIdAndType( TypeChambre type, long idBloc );
    // public List<Reservation> findByAnneeUniversitaire(Date dateDebut , Date dateFin );

    Chambre findAllByNumeroChambre (Long numChambres);

    public List<Chambre> findByBlocNomBloc( String nomBloc );

    public long countByTypeChambreAndBloc(TypeChambre typeChambre, Bloc bloc);

}
