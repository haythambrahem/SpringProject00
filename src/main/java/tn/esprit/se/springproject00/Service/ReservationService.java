package tn.esprit.se.springproject00.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject00.Entity.Reservation;
import tn.esprit.se.springproject00.Interfaces.IReservationService;
import tn.esprit.se.springproject00.repository.ReservationRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(String.valueOf(idReservation)).get();
    }

    @Override
    public void removeReservation(Long idReservation) {
        reservationRepository.deleteById(String.valueOf(idReservation));
    }
}
