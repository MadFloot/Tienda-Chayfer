package com.tiendachayfer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JuegosController {
    
    @GetMapping("/juegos/listado")
    public String getJuegosPage() {
        return "juegos/listado";
    }
}