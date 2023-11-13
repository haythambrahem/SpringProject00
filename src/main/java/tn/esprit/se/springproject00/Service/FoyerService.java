package tn.esprit.se.springproject00.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject00.Entity.Bloc;
import tn.esprit.se.springproject00.Entity.Foyer;
import tn.esprit.se.springproject00.Interfaces.IFoyerService;
import tn.esprit.se.springproject00.repository.BlocRepository;
import tn.esprit.se.springproject00.repository.FoyerRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;
    BlocRepository blocRepository;
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
        Bloc bloc = blocRepository.findByNomBloc(foyer.getNomBloc()); // Adjust this based on your actual logic

        if (bloc != null) {
            // Set the bloc for the foyer
            foyer.setBloc(bloc);

            // Save the foyer with the associated bloc
            foyerRepository.save(foyer);

            return foyer;
        } else {
            // Handle the case where the bloc is not found
            throw new BlocNotFoundException("Bloc with name " + foyer.getNomBloc() + " not found");
        }
    }

}
