package com.tiendachayfer.controller;

import com.tiendachayfer.domain.Item;
import com.tiendachayfer.domain.Producto;
import com.tiendachayfer.service.ItemService;
import com.tiendachayfer.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("/bebe/listado")

public class BebeController {

    @GetMapping("/listado-bebe")
    public String showListadoBebe() {
        return "listado.bebe";
    }
}
