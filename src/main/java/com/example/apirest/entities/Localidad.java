package com.example.apirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Localidad extends Base{

    @Column(name = "denominacion")
    private String denominacion;

    @ManyToOne(optional=false)
    @JoinColumn(name="fk_localidad")
    private Localidad localidad;
}
