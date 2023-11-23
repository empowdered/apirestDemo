package com.example.apirest.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona extends Base{

    @Column(name="nombre_persona",length=50)
    private String nombrePersona;

    @Column(name="apellido_persona", length=50)
    private String apellidoPersona;

    @Column(name="rut_persona",length=1500)
    private String rut_persona;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name="persona_libro",joinColumns = @JoinColumn(name="persona_id"),
            inverseJoinColumns = @JoinColumn(name="libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();
}
