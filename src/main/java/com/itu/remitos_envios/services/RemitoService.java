package com.itu.remitos_envios.services;

import com.itu.remitos_envios.dtos.RemitoDto;
import com.itu.remitos_envios.entities.Remito;
import com.itu.remitos_envios.repositories.RemitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RemitoService {
    @Autowired
    RemitoRepository remitoRepository;

    public Remito getRemitoPorNumero(String numero) {
        return this.remitoRepository.findByNumero(numero);
    }

    public Remito createRemito(RemitoDto remitoDto) {
        Remito remito = new Remito();
        remito.setDestinatario(remitoDto.getDestinatario());
        remito.setRemitente(remitoDto.getRemitente());
        remito.setFechaDeDespacho(new Date());
        remito.setFechaDeDespacho(new Date());
        return this.remitoRepository.save(remito);
    }

//    public Remito updateRemito(RemitoDto remitoDto) {
//        return this.remitoRepository.save(remitoDto);
//    }

}
