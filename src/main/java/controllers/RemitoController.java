package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemitoController {

    @GetMapping("/remitos")
    public String getRemito() {
        return "Esto es un GEt";
    }
//
//    @PostMapping("/remitos")
//    public String crearRemito() {
//        return  "Esto es un POST";
//    }
//
//    @PatchMapping("/remitos")
//    public String crearRemito() {
//        return "Esto es un PATCH";
//    }
}