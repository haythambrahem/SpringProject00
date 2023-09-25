package tn.esprit.se.springproject00.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre; // Clé primaire
    private Long numeroChambre;
    private TypeChambre typeChambre;

    @ManyToOne
    Bloc blocs;
    @OneToMany
    private Set<Reservation> reservations;
}
