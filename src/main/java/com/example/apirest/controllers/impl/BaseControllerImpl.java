package com.example.apirest.controllers.impl;

import com.example.apirest.controllers.interfaces.BaseController;
import com.example.apirest.entities.Base;
import com.example.apirest.entities.Persona;
import com.example.apirest.services.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControllerImpl
        <E extends Base, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected S servicio;

    private String errorMssge = "{\"error\":\"Error, intente mas tarde\"}";


    @GetMapping(value="/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.servicio.findAll());
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @GetMapping(value="/getone/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.servicio.findById(id));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @PostMapping(value="/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody E entity){

        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.servicio.save(entity));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @PutMapping(value="/update",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody  E entity){

        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.servicio.update(id,entity));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @DeleteMapping(value="/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(this.servicio.delete(id));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }
}
