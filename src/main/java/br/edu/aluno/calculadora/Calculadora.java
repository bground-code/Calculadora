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
        ModelAndView modelAndView = new ModelAndView("resultado");
        
        return modelAndView;
    }
    
    
}
