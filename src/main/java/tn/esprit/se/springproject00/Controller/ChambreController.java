package tn.esprit.se.springproject00.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject00.Entity.Bloc;
import tn.esprit.se.springproject00.Entity.Chambre;
import tn.esprit.se.springproject00.Entity.TypeChambre;
import tn.esprit.se.springproject00.Interfaces.IchambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("chambre")

public class ChambreController {
    IchambreService chambreService;
    @GetMapping("/chambres-par-nom-bloc/{nomBloc}")
    public List<Chambre> getChambresParNomBloc(@PathVariable String nomBloc) {
        return chambreService.getChambresParNomBloc(nomBloc);
    }
    @GetMapping("/nb-chambres-par-type-et-bloc")
    public long nbChambreParTypeEtBloc(@RequestParam TypeChambre typeChambre, @RequestParam Bloc idBloc) {
        return chambreService.nbChambreParTypeEtBloc(typeChambre, idBloc);
    }


}
