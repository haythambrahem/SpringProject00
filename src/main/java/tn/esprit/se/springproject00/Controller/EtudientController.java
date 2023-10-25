package tn.esprit.se.springproject00.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}