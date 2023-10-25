package tn.esprit.se.springproject00.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject00.Entity.Etudiant;
import tn.esprit.se.springproject00.Interfaces.IEtudientService;
import tn.esprit.se.springproject00.repository.EtudientRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class EtudientService implements IEtudientService {

   EtudientRepository etudientRepository;
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
}
