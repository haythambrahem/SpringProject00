package tn.esprit.se.springproject00.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject00.Entity.Etudiant;
import tn.esprit.se.springproject00.Interfaces.IEtudientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudientController {
    IEtudientService etudientService;

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiant() {
        List<Etudiant> listEtudiants = etudientService.retrieveAllEtudiants();
        return listEtudiants;
    }
    @PostMapping("/add-etudiant")
    public List<Etudiant> addEtudiant(@RequestBody Etudiant etudiant) {
        etudientService.addEtudiant(etudiant);
        return etudientService.retrieveAllEtudiants();
    }

    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudientService.updateEtudiant(etudiant);
    }

    @GetMapping("/retrieve-etudiant/{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable long idEtudiant) {
        return etudientService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/remove-etudiant/{idEtudiant}")
    public void removeEtudiant(@PathVariable long idEtudiant) {
        etudientService.removeEtudiant(idEtudiant);
    }

}