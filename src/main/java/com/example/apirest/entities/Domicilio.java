package com.example.apirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio extends Base{

    @Column(name = "nombre_calle")
    private String nombreCalle;
    @Column(name = "numero_calle")
    private String numeroCalle;

    @ManyToOne(optional = false)
    @JoinColumn(name="fk_localidad")
    private Localidad localidad;

}
