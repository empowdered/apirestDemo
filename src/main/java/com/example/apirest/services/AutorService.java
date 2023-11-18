package com.example.apirest.services;

import com.example.apirest.entities.Autor;
import com.example.apirest.entities.Persona;
import com.example.apirest.repositories.AutorRepository;
import com.example.apirest.repositories.BaseRepository;
import com.example.apirest.services.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface AutorService extends BaseService<Autor, Long> {


}
