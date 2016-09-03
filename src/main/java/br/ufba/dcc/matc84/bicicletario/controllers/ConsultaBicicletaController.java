package br.ufba.dcc.matc84.bicicletario.controllers;

import br.ufba.dcc.matc84.bicicletario.models.Bicicleta;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jeferson
 */
@Controller
@RequestMapping("/bicicletas")
public class ConsultaBicicletaController {
    
    private static final String CONSULTA_VIEW = "/cadastro/ConsultaBicicleta";
    
    @RequestMapping("{bicicleta_id}")
    public ModelAndView edicao(@PathVariable("bicicleta_id") Bicicleta bicicleta) {
        ModelAndView mv = new ModelAndView(CONSULTA_VIEW);
        return mv;
    }

}
