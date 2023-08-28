package com.itu.remitos_envios.controllers;

import com.itu.remitos_envios.dtos.RemitoDto;
import com.itu.remitos_envios.entities.Remito;
import com.itu.remitos_envios.mappers.RemitoMapper;
import com.itu.remitos_envios.services.RemitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class RemitoController {

    @Autowired
    RemitoService service;

    @GetMapping(value = "/remitos", produces = "application/json")
    @ResponseBody
    public RemitoDto getRemito() {
        RemitoDto remitoDto = new RemitoDto();
        remitoDto.setDestinatario("asd");
        remitoDto.setNumero("12");
        remitoDto.setRemitente("asdf");
        remitoDto.setFechaDeDespacho(new Date());
        remitoDto.setFechaDeEntrega(new Date());
        return remitoDto;
    }

    @PostMapping("/remitos")
    @ResponseBody
    public RemitoDto crearRemito(RemitoDto remitoDto) {
        Remito newRemito = this.service.createRemito(remitoDto);
        RemitoDto newRemitoDto = RemitoMapper.remitoToRemitoDto(newRemito);
        return newRemitoDto;
    }

//    @PatchMapping("/remitos")
//    public String updateRemito(RemitoDto remitoDto) {
//        return "Esto es un PATCH";
//    }
}