package tn.esprit.se.springproject00.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject00.Entity.Bloc;
import tn.esprit.se.springproject00.Entity.Universite;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
   List<Bloc> findByUniversite(Universite universite);
}
