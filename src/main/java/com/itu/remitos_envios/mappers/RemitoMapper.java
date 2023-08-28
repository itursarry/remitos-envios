package com.itu.remitos_envios.mappers;

import com.itu.remitos_envios.dtos.RemitoDto;
import com.itu.remitos_envios.entities.Remito;

public class RemitoMapper {

    public final static RemitoDto remitoToRemitoDto(Remito remito) {
        RemitoDto remitoDto = new RemitoDto();
        remitoDto.setNumero(remito.getNumero());
        remitoDto.setRemitente(remito.getRemitente());
        remitoDto.setDestinatario(remito.getDestinatario());
        remitoDto.setFechaDeDespacho(remito.getFechaDeDespacho());
        remitoDto.setFechaDeEntrega(remito.getFechaDeEntrega());
        return remitoDto;
    }
}
