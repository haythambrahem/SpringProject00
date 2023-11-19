package tn.esprit.se.springproject00.Interfaces;

import tn.esprit.se.springproject00.Entity.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation(Reservation r);

    Reservation updateReservation(Reservation r);

    Reservation retrieveReservation(Long idReservation);

    void removeReservation(Long idReservation);

    List<Reservation> getReservationParAnneeUniversitaire(Date anneeUniversitaire);
}
