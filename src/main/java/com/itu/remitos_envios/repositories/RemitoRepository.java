package com.itu.remitos_envios.repositories;

import com.itu.remitos_envios.entities.Remito;
import org.springframework.data.repository.CrudRepository;

public interface RemitoRepository extends CrudRepository<Remito, String> {
    Remito findByNumero(String numero);
}
