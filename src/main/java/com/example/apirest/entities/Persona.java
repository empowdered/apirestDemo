package com.example.apirest.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona extends Base{

    @Column(name="nombre_persona",columnDefinition = "VARCHAR(50)")
    private String nombrePersona;
    @Column(name="apellido_persona",columnDefinition = "VARCHAR(50)")
    private String apellidoPersona;
    @Column(name="rut_persona",columnDefinition = "VARCHAR(50)")
    private String rutPersona;

}
