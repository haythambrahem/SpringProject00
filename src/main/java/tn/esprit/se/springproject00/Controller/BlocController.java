package tn.esprit.se.springproject00.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.se.springproject00.Entity.Bloc;
import tn.esprit.se.springproject00.Service.BlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("bloc")
public class BlocController {
    BlocService blocService;
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> retrieveAllBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBloc();
        return listBlocs;
    }

}
