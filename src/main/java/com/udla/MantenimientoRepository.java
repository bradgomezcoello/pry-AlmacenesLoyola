package com.udla;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MantenimientoRepository implements PanacheMongoRepository<Mantenimiento>{

    public Mantenimiento findByIdMantenimiento(String idMantenimiento){
        Mantenimiento contacto = find("idMantenimiento", idMantenimiento).firstResult();
        return contacto;
    }

}