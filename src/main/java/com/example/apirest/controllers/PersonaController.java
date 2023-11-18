package com.example.apirest.controllers;


import com.example.apirest.controllers.impl.BaseControllerImpl;
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
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl> {

}
