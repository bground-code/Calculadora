package br.edu.aluno.calculadora;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class multiplicar {
    // Metodo para receber requisições do metodo post 
    @PostMapping(value="multiplicar")
    public ModelAndView postMethodName(@RequestParam String n1, @RequestParam String n2) {
        //TODO: process POST request 
        Double n12 = Double.valueOf(n1);
        Double n22 = Double.valueOf(n2);
        
        Double resultado = n12 * n22;

        ModelAndView modelAndView = new ModelAndView("resultado");
        modelAndView.addObject("resultado", resultado);

        return modelAndView;
    }


  
    
    
}
