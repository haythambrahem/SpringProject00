package tn.esprit.se.springproject00.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject00.Entity.Universite;
import tn.esprit.se.springproject00.Interfaces.IUniversiteService;
import tn.esprit.se.springproject00.repository.UniversiteRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
