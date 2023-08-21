package com.tiendachayfer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author HUAWEI PC
 */
@Controller
public class GiftcardsController {
    @GetMapping("/giftcards/listado")
    public String getGiftcardsPage() {
        return "giftcards/listado";
    }
    
}
