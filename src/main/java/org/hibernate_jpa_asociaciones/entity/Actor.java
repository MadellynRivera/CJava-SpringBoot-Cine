package org.hibernate_jpa_asociaciones.entity;

import jakarta.persistence.*;
import org.hibernate_jpa_asociaciones.util.ControlFecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Actores")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_actor")
    private long codActor;
    @Column(nullable = false)
    private String nombre;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento")
    private Date fNacimiento;

    @Column(name = "lugar_nacimiento")
    private String lNacimiento;


    private String nacionalidad;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_muerte")
    private Date fMuerte;

    @Column(name = "lugar_muerte")
    private String lMuerte;

    //Cardinalidad -------------------------------
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "participa",joinColumns = @JoinColumn(name ="codActor"),
    inverseJoinColumns = @JoinColumn(name = "codPelicula"))
    private List<Pelicula> peliculas;

    //Constructores----------------------------
    public Actor(){}
    public Actor(String nombre) {
       this();
        this.nombre = nombre;
    }

    public Actor(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    //Set y Get ---------------------------------
    public long getCodActor() {
        return codActor;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFnacimiento() {
        return fNacimiento;
    }

    public String getLNacimiento() {
        return lNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Date getFMuerte() {
        return fMuerte;
    }

    public String getLMuerte() {
        return lMuerte;
    }

    public void setCodActor(long codActor) {
        codActor = codActor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFnacimiento(Date fnacimiento) {

        this.fNacimiento = fnacimiento ;
    }

    public void setLNacimiento(String LNacimiento) {
        this.lNacimiento = LNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        nacionalidad = nacionalidad;
    }

    public void setFMuerte(Date FMuerte) {
        this.fMuerte = FMuerte;
    }

    public void setLMuerte(String LMuerte) {
        this.lMuerte = LMuerte;
    }


    @Override
    public String toString() {
        return "Actor{" +
                "CodActor=" + codActor +
                ", nombre='" + nombre + '\'' +
                ", Fnacimiento=" + fNacimiento +
                ", LNacimiento='" + lNacimiento + '\'' +
                ", Nacionalidad='" + nacionalidad + '\'' +
                ", FMuerte=" + fMuerte +
                ", LMuerte='" + lMuerte + '\'' +
                '}';
    }
}
