package tn.esprit.se.springproject00.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private Long idReservation; // Clé primaire
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;
}
