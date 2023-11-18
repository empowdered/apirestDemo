package com.example.apirest.services.impl;

import com.example.apirest.entities.Autor;
import com.example.apirest.repositories.AutorRepository;
import com.example.apirest.repositories.BaseRepository;
import com.example.apirest.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository){
        super(baseRepository);
    }

}
