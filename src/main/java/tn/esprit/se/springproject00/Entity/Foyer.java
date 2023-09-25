package tn.esprit.se.springproject00.Entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private Long idFoyer; // Clé primaire
    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToOne(mappedBy="foyers")
    private Universite universite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyers")
    private Set<Bloc> blocs;

}
