package com.Tienda.controller;

import com.Tienda.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class IndexController {
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ahora se usa arquitectura MVC");
        String mensaje = "Estamos en la semana 4";
        model.addAttribute("texto", mensaje);
        
        Cliente cliente = new Cliente ("Jonatan","Brenes","jbrenesbl@gmail.com","8820-5555");
        model.addAttribute("cliente",cliente);
        
        Cliente cliente2 = new Cliente ("Juan","Lopez","jbrenesbl@gmail.com","8820-5555");
        Cliente cliente3 = new Cliente ("Pedro","Sanchez","jbrenesbl@gmail.com","8820-5555");
        var clientes = Arrays.asList(cliente, cliente2, cliente3);
        model.addAttribute("clientes",clientes);
        
        return "index";
    }
}
