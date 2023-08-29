package com.itu.remitos_envios.mappers;

import com.itu.remitos_envios.dtos.RemitoDto;
import com.itu.remitos_envios.entities.Remito;
import java.util.List;
import java.util.ArrayList;

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

    public final static List<RemitoDto> remitosToRemitosDto(List<Remito> remitos ) {
        List<RemitoDto> result = new ArrayList<RemitoDto>();
       remitos.forEach((remito)->{result.add(remitoToRemitoDto(remito));} );
        return result;
    }
}
