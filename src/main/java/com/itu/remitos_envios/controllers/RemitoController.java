package com.itu.remitos_envios.controllers;

import com.itu.remitos_envios.dtos.RemitoDto;
import com.itu.remitos_envios.entities.Remito;
import com.itu.remitos_envios.mappers.RemitoMapper;
import com.itu.remitos_envios.services.RemitoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class RemitoController {

    @Autowired
    RemitoService service;

    @GetMapping(value = "/remitos/{id}", produces = "application/json")
    @ResponseBody
    public RemitoDto getRemito(@PathVariable String id) {
        Remito remito = this.service.getRemitoPorId(id);
        RemitoDto remitoDto = RemitoMapper.remitoToRemitoDto(remito);
        return remitoDto;
    }

    @PostMapping("/remitos")
    @ResponseBody
    public RemitoDto crearRemito(@RequestBody RemitoDto remitoDto) {
        Remito newRemito = this.service.createRemito(remitoDto);
        RemitoDto newRemitoDto = RemitoMapper.remitoToRemitoDto(newRemito);
        return newRemitoDto;
    }

    @GetMapping(value = "/remitos", produces = "application/json")
    @ResponseBody
    public List<RemitoDto> getRemitos() {
        List<Remito> remitos = this.service.getRemitos();
        List<RemitoDto> remitosDto = RemitoMapper.remitosToRemitosDto(remitos);
        return remitosDto;
    }

//    @PatchMapping("/remitos")
//    public String updateRemito(RemitoDto remitoDto) {
//        return "Esto es un PATCH";
//    }
}