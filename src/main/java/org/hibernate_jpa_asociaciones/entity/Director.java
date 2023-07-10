package org.hibernate_jpa_asociaciones.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Directores")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_director")
    private long codDirector;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fecha_nacimiento")
    private LocalDate fNacimiento;

    @Column(name = "lugar_nacimiento")
    private String lNacimiento;

    @Column(name = "Nacionalidad")
    private String nacionalidad;

    @Column(name = "fecha_muerte")
    private LocalDate fMuerte;

    @Column(name = "lugar_muerte")
    private String lMuerte;

    //Constructores------------------------
    public Director(){}

    public Director(String nombre) {
        this();
        this.nombre = nombre;
    }



    //Set y Get---------------------------

    public long getCodDirector() {
        return codDirector;
    }

    public void setCodDirector(long codDirector) {
        this.codDirector = codDirector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getlNacimiento() {
        return lNacimiento;
    }

    public void setlNacimiento(String lNacimiento) {
        this.lNacimiento = lNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getfMuerte() {
        return fMuerte;
    }

    public void setfMuerte(LocalDate fMuerte) {
        this.fMuerte = fMuerte;
    }

    public String getlMuerte() {
        return lMuerte;
    }

    public void setlMuerte(String lMuerte) {
        this.lMuerte = lMuerte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return Objects.equals(codDirector, director.codDirector) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codDirector);
    }

    @Override
    public String toString() {
        return "Director{" +
                "codDirector=" + codDirector +
                ", nombre='" + nombre + '\'' +
                ", fNacimiento=" + fNacimiento +
                ", lNacimiento='" + lNacimiento + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fMuerte=" + fMuerte +
                ", lMuerte='" + lMuerte + '\'' +
                '}';
    }
}
