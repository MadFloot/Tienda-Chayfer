package com.tiendachayfer.controller;

import com.tiendachayfer.service.ReporteService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reportes")
public class ReporteController {

    @Autowired
    ReporteService reporteService;

    @GetMapping("/principal")
    public String principal(Model model) {
        return "/reportes/principal";
    }

    @GetMapping("/usuarios")
    public ResponseEntity<Resource>
            usuarios(@RequestParam String tipo)
            throws IOException {
        //Se da el reporte con un igual de como se llame el .jasper
        var reporte = "usuarios";
        return reporteService.generaReporte(reporte, null, tipo);
    }
            @GetMapping("/ventas")
    public ResponseEntity<Resource>
            ventas(@RequestParam String tipo)
            throws IOException {
        //Se da el reporte con un igual de como se llame el .jasper
        var reporte = "ventas";
        return reporteService.generaReporte(reporte, null, tipo);
    }
            
            @GetMapping("/facturas")
    public ResponseEntity<Resource>
            facturas(@RequestParam String tipo)
            throws IOException {
        //Se da el reporte con un igual de como se llame el .jasper
        var reporte = "facturas";
        return reporteService.generaReporte(reporte, null, tipo);
    }
              
            @GetMapping("/cantidadproductos")
    public ResponseEntity<Resource>
            cantidadproductos(@RequestParam String tipo)
            throws IOException {
        //Se da el reporte con un igual de como se llame el .jasper
        var reporte = "cantidadproductos";
        return reporteService.generaReporte(reporte, null, tipo);
    }

}
