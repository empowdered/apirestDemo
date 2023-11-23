package com.example.apirest.services.impl;

import com.example.apirest.entities.Localidad;
import com.example.apirest.entities.Persona;
import com.example.apirest.repositories.BaseRepository;
import com.example.apirest.repositories.LocalidadRepository;
import com.example.apirest.repositories.PersonaRepository;
import com.example.apirest.services.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Persona> searchPeople(String filtro) throws Exception {
        return null;
    }
}
