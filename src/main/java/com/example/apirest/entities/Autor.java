package com.example.apirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor extends Base {

    @Column(name = "nombre_autor", columnDefinition = "VARCHAR(50)", length = 50)
    private String nombreAutor;

    @Column(name = "apellido_autor", columnDefinition = "VARCHAR(50)",length = 50)
    private String apellidoAutor;

    @Column(name = "biografia", columnDefinition = "VARCHAR(1500)", length = 1500)
    private String biografia;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Libro> libros;
}

