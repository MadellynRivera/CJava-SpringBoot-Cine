package org.hibernate_jpa_asociaciones.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Generos")

public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genero")
    private long idGenero;

    @Column(name = "Nombre")
    private String nombre;

    //Constructores -------------------------------------

    public Genero(){}
    public Genero(String nombre) {
        this();
        this.nombre = nombre;
    }

    //Set y Get ------------------------------------------

    public long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(long idGenero) {
        this.idGenero = idGenero;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "idGenero=" + idGenero +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
