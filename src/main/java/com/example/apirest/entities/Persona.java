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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_persona")
    private long idPersona;

    @Column(name="nombre_persona")
    private String nombrePersona;

    @Column(name="apellido_persona")
    private String apellidoPersona;

    @Column(name="rut_persona")
    private String rutPersona;

    //@Column(name="fecha_creacion", nullable = true)
    //private Date fechaCreacion;

}
