package tn.esprit.se.springproject00.Interfaces;

import tn.esprit.se.springproject00.Entity.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBloc();

    Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
}
