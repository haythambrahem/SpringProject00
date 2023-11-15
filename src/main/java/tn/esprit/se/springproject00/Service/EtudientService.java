package tn.esprit.se.springproject00.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject00.Entity.Etudiant;
import tn.esprit.se.springproject00.Entity.Reservation;
import tn.esprit.se.springproject00.Interfaces.IEtudientService;
import tn.esprit.se.springproject00.repository.EtudientRepository;
import tn.esprit.se.springproject00.repository.ReservationRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class EtudientService implements IEtudientService {

   EtudientRepository etudientRepository;
   ReservationRepository reservationRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudientRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudientRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudientRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudientRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
    etudientRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {
        Etudiant etudiant = etudientRepository.findByNomEtAndPrenomEt(nomEt, prenomEt);
        Reservation reservation = reservationRepository.findById(idReservation).orElse(null);

        if (etudiant != null && reservation != null) {
            // Assuming there's a method to associate the etudiant with the reservation
            reservation.setEtudiant(etudiant);

            // Save the updated reservation with associated etudiant
            reservationRepository.save(reservation);

            return etudiant;
        } else {
            // Handle the case where the etudiant or reservation is not found
            throw new EtudiantOrReservationNotFoundException("Etudiant or Reservation not found");
        }
    }
}
