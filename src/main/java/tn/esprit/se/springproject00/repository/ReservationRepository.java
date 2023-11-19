package tn.esprit.se.springproject00.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject00.Entity.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    List<Reservation> findByAnneeUniversitaire(Date dateDebut);
}
