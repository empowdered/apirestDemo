package com.example.apirest.services;

import com.example.apirest.entities.Base;
import com.example.apirest.entities.Persona;
import com.example.apirest.repositories.BaseRepository;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl <E extends Base, ID extends Serializable>
                implements BaseService<E, ID>{

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository){
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = this.baseRepository.findAll();
            return entities;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> entityOptional = this.baseRepository.findById(id);
            return entityOptional.get();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = this.baseRepository.save(entity);
            return entity;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(E entity) throws Exception {
        ID id = (ID) entity.getId();
        try{
            Optional<E> entityOptional = this.baseRepository.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate = this.baseRepository.save(entity);
            return entityUpdate;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        boolean flag = false;
        try{
            if(this.baseRepository.existsById(id)){
                this.baseRepository.deleteById(id);
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
