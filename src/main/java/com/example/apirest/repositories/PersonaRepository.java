package com.example.apirest.repositories;

import com.example.apirest.entities.Persona;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long>{
    @Query("SELECT p FROM Persona p WHERE p.nombrePersona LIKE %:filtro% OR p.apellidoPersona LIKE %:filtro%")
    List<Persona> searchPeople(@Param("filtro") String filtro);
}
