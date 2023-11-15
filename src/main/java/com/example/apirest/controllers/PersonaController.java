package com.example.apirest.controllers;


import com.example.apirest.entities.Persona;
import com.example.apirest.services.PersonaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins="*")
@RequestMapping(path="api/v1/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    private String errorMssge = "{\"error\":\"Error, intente mas tarde\"}";

    @GetMapping("/getall")
    @CrossOrigin(origins="*")
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.personaService.findAll());
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @GetMapping("/getone/{id}")
    @CrossOrigin(origins="*")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.personaService.findById(id));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @PostMapping("/save")
    @CrossOrigin(origins="*")
    public ResponseEntity<?> save(@RequestBody Persona persona){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.personaService.save(persona));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody  Persona entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.personaService.update(id,entity));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(this.personaService.delete(id));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.errorMssge);
        }
    }
}
