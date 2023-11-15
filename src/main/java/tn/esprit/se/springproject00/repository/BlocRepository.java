package tn.esprit.se.springproject00.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.se.springproject00.Entity.Bloc;
import tn.esprit.se.springproject00.Entity.Universite;

import java.util.List;
@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
   Bloc findByUniversite(Universite universite);
   Bloc findByNomBloc (String nomBloc );

}
