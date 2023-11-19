package com.example.apirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro extends Base{

    @Column(name = "titulo_libro")
    private String tituloLibro;
    @Column(name = "fecha_libro")
    private String fechaLibro;
    @Column(name = "genero_libro")
    private String generoLibro;
    @Column(name = "paginas_libro")
    private String paginasLibro;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
