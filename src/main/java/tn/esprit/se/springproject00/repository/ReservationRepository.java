package tn.esprit.se.springproject00.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject00.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
