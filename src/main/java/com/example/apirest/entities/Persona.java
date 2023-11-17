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

    //@Serial
    private static final long serialVersionUID = 1L;

   /*
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_persona")
    private long idPersona;
    */
    @Column(name="nombre_persona",columnDefinition = "VARCHAR(50)")
    private String nombrePersona;

    @Column(name="apellido_persona",columnDefinition = "VARCHAR(50)")
    private String apellidoPersona;

    @Column(name="rut_persona",columnDefinition = "VARCHAR(50)")
    private String rutPersona;

    //public Persona(){

    //}

    //public long getIdPersona() {
     //   return idPersona;
    //}

    //public void setIdPersona(long idPersona) {
      //  this.idPersona = idPersona;
    //}

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(String rutPersona) {
        this.rutPersona = rutPersona;
    }
}
