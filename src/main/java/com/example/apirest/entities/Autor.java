package com.example.apirest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor extends Base{

    @Column(name="nombre_autor",columnDefinition = "VARCHAR(50)")
    private String nombreAutor;
    @Column(name="apellido_autor",columnDefinition = "VARCHAR(50)")
    private String apellidoAutor;
    @Column(name="biografia",columnDefinition = "VARCHAR(50)")
    private String biografia;

}
