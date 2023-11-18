package com.example.apirest.services;

import com.example.apirest.entities.Autor;
import com.example.apirest.entities.Persona;
import com.example.apirest.repositories.AutorRepository;
import com.example.apirest.repositories.BaseRepository;
import com.example.apirest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService extends BaseServiceImpl<Autor, Long> {
    @Autowired
    private AutorRepository autorRepository;

    public AutorService(BaseRepository<Autor, Long> autorRepository){
        super(autorRepository);
    }

}
