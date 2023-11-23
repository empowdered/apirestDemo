package com.example.apirest.services.impl;

import com.example.apirest.entities.Persona;
import com.example.apirest.repositories.BaseRepository;
import com.example.apirest.repositories.PersonaRepository;
import com.example.apirest.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long>
    implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }


    @Override
    public List<Persona> searchPeople(String filtro) throws Exception {
       try{
           List<Persona> personas = this.personaRepository.searchPeople(filtro);
           return personas;
       }catch(Exception ex1){
           throw new Exception(ex1.getMessage());
      }
    }

}
