package tn.esprit.se.springproject00.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject00.Entity.Bloc;
import tn.esprit.se.springproject00.Entity.Chambre;
import tn.esprit.se.springproject00.Interfaces.IBlocService;
import tn.esprit.se.springproject00.repository.BlocRepository;
import tn.esprit.se.springproject00.repository.ChambreRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor

public class BlocService  implements IBlocService {
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    @Override
    public Bloc retrieveAllBloc() {
        return (Bloc) blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc affecterChambresABloc(Long numChambre, String nomBloc)
    {
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);
        // Make sure the bloc exists
        if (bloc != null) {
            Long numChambres = null;
            Chambre chambres = chambreRepository.findAllByNumeroChambre(numChambres);

            // Assuming you want to associate the chambres with the bloc
            bloc.setChambres(chambres);

            // Save the updated bloc with associated chambres
            blocRepository.save(bloc);

            return bloc;
        } else {
            // Handle the case where the bloc does not exist
            throw new BlocNotFoundException("Bloc with name " + nomBloc + " not found");
        }
    }
}
