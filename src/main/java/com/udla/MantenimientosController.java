package com.udla;

import java.util.HashMap;
import java.util.Map;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/api")
public class MantenimientosController {

    @Inject
    MantenimientoRepository _repository;

    public MantenimientosController(MantenimientoRepository repository){
        this._repository=repository;
    }



    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response guardarContacto(MantenimientoDto contactoDto) {
        Map<String,String> valores = new HashMap<>();
        String[] campos = contactoDto.form.split("~");
        for (String valor : campos) {
            String[] datos = valor.split("\\^");
            String key = datos[1];
            String value = datos[2];
            valores.put(key, value);
        }
      Mantenimiento mantenimientoBuscado = _repository.findByIdMantenimiento(contactoDto.id);
      if (mantenimientoBuscado == null) {
        Mantenimiento mantenimiento = new Mantenimiento(contactoDto.id, contactoDto.sortDate, contactoDto.modificationDate, contactoDto.creationDate, valores);
        _repository.persist(mantenimiento);
      } else {
        mantenimientoBuscado.sortDate = contactoDto.sortDate;
        mantenimientoBuscado.creationDate = contactoDto.creationDate;
        mantenimientoBuscado.modificationDate = contactoDto.modificationDate;
        mantenimientoBuscado.valores = valores;
        _repository.update(mantenimientoBuscado);
    }
        return Response.ok().build();
    }
}
