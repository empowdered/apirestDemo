package com.example.apirest.services;

import com.example.apirest.entities.Persona;
import com.example.apirest.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements BaseService<Persona>{


    private PersonaRepository personaRepository;//se puede usar @Autowired

    public PersonaService(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }
    @Override
    @Transactional
    public List<Persona> findAll() throws Exception {
       try{
            List<Persona> entities = this.personaRepository.findAll();
            return entities;
       }catch(Exception ex){
            throw new Exception(ex.getMessage());
       }
    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        try{
            Optional<Persona> entityOptional = this.personaRepository.findById(id);
            return entityOptional.get();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try{
            entity = this.personaRepository.save(entity);
            return entity;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {
        try{
            Optional<Persona> entityOptional = this.personaRepository.findById(id);
            Persona persona = entityOptional.get();
            persona = this.personaRepository.save(persona);
            return persona;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        boolean flag = false;
        try{
            if(this.personaRepository.existsById(id)){
                this.personaRepository.deleteById(id);
                flag = true;
            }else{
                throw new Exception();
            }
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return flag;
    }
}
