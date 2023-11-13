package tn.esprit.se.springproject00.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject00.Entity.Foyer;
import tn.esprit.se.springproject00.Interfaces.IFoyerService;
import tn.esprit.se.springproject00.repository.FoyerRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public void archiverFoyer(long idFoyer) {

    }

    @Override
    public Foyer addFoyerWithBloc(Foyer foyer) {
        return null;
    }

}
