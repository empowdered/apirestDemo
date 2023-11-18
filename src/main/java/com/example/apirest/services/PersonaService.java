package com.example.apirest.services;

import com.example.apirest.entities.Persona;
import com.example.apirest.repositories.BaseRepository;
import com.example.apirest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService extends BaseServiceImpl<Persona, Long> {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }

}
