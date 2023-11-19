package tn.esprit.se.springproject00.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject00.Entity.Bloc;
import tn.esprit.se.springproject00.Service.BlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("bloc")
public class BlocController {
    BlocService blocService;
    @GetMapping("/retrieve-all-blocs")
    public Bloc retrieveAllBlocs() {
        Bloc bloc = blocService.retrieveAllBloc();
        return bloc;
    }


    @PutMapping("/affecter-chambres/{numChambre}/{nomBloc}")
    public Bloc affecterChambresABloc(@PathVariable("numChambre") Long numChambre,
                                      @PathVariable("nomBloc") String nomBloc) {
        return blocService.affecterChambresABloc(numChambre, nomBloc);
    }
}
