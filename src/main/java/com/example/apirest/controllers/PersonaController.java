package com.example.apirest.controllers;


import com.example.apirest.entities.Persona;
import com.example.apirest.services.impl.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/v1/personas")
public class PersonaController {

    @Autowired
    private PersonaServiceImpl personaServiceImpl;

    private Persona persona = new Persona();

    private String errorMssge = "{\"error\":\"Error, intente mas tarde\"}";

    @GetMapping(value="/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.personaServiceImpl.findAll());
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @GetMapping(value="/getone/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.personaServiceImpl.findById(id));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @PostMapping(value="/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody Persona persona){

        this.persona.setId(persona.getId());
        this.persona.setNombrePersona(persona.getNombrePersona());
        this.persona.setApellidoPersona(persona.getApellidoPersona());
        this.persona.setRutPersona(persona.getRutPersona());

        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.personaServiceImpl.save(this.persona));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @PostMapping(value="/update",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody  Persona entity){

        /*
        this.persona.setIdPersona(entity.getIdPersona());
        this.persona.setNombrePersona(entity.getNombrePersona());
        this.persona.setApellidoPersona(entity.getApellidoPersona());
        this.persona.setRutPersona(entity.getRutPersona());
        */

        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.personaServiceImpl.update(entity));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @DeleteMapping(value="/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(this.personaServiceImpl.delete(id));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }
}
