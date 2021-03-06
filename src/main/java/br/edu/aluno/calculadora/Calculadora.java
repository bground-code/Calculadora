package br.edu.aluno.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Calculadora {
    // Metodo para receber requisições do metodo post 
    @PostMapping(value="calcular")
    public ModelAndView postMethodName(@RequestParam String operacao1, @RequestParam String operacao2) {
        //TODO: process POST request 
        Double operando1Double = Double.valueOf(operacao1);
        Double operando2Double = Double.valueOf(operacao2);
        
        Double resultado = operando2Double + operando1Double;

        ModelAndView modelAndView = new ModelAndView("resultado");
        modelAndView.addObject("resultado", resultado);

        return modelAndView;
    }

    

  
    
    
}
