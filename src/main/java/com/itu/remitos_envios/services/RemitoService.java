package com.itu.remitos_envios.services;

import com.itu.remitos_envios.dtos.RemitoDto;
import com.itu.remitos_envios.entities.Remito;
import com.itu.remitos_envios.repositories.RemitoRepository;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RemitoService {
    @Autowired
    RemitoRepository remitoRepository;

    public Remito getRemitoPorNumero(String numero) {
        return this.remitoRepository.findByNumero(numero);
    }

    public Remito getRemitoPorId(String id) {
        Optional<Remito> remitoOpt = this.remitoRepository.findById(id);
        return remitoOpt.get();
    }

    public Remito createRemito(RemitoDto remitoDto) {
        Remito remito = new Remito();
        remito.setNumero(remitoDto.getNumero());
        remito.setDestinatario(remitoDto.getDestinatario());
        remito.setRemitente(remitoDto.getRemitente());
        remito.setFechaDeDespacho(remitoDto.getFechaDeDespacho());
        remito.setFechaDeEntrega(remitoDto.getFechaDeEntrega());
        return this.remitoRepository.save(remito);
    }

    public List<Remito> getRemitos() {
       Iterable<Remito> remitosIterable = this.remitoRepository.findAll();
       List<Remito> result = new ArrayList<Remito>();
       remitosIterable.forEach(result::add);
        return result;
    }

//    public Remito updateRemito(RemitoDto remitoDto) {
//        return this.remitoRepository.save(remitoDto);
//    }

}
