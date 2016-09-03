package br.ufba.dcc.matc84.bicicletario.controllers;

import br.ufba.dcc.matc84.bicicletario.models.Bicicleta;
import br.ufba.dcc.matc84.bicicletario.repository.Bicicletas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author jeferson
 */
@Controller
@RequestMapping("/bicicletas/cadastro")
public class CadastroBicicletaController {
    
    private static final String CADASTRO_VIEW = "/cadastro/CadastroBicicleta";
    
    @Autowired
    private Bicicletas bicicletas;
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView salvar(@Validated Bicicleta bicicleta, Errors errors, RedirectAttributes attributes) {
        ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
       
        if (errors.hasErrors()) {
            return mv;
        }
        
        bicicletas.save(bicicleta);
        mv.addObject("mensagem", "Cadastro de Bicicleta realizado com sucesso!");

        return mv;
    }

    @RequestMapping("/remove/{bicicleta_id}")
    public String remove(@PathVariable("bicicleta_id") Integer id_sala, RedirectAttributes attributes) {
        @SuppressWarnings("unused")
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
        bicicletas.delete(id_sala);
        return "redirect:/";
    }
    
    @RequestMapping("/")
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
        mv.addObject(new Bicicleta());
        return mv;
    }
    
}
