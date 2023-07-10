package org.hibernate_jpa_asociaciones.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pelicula")
    private long codPelicula ;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "Anyo" , nullable = false)
    private String year;

    private String nacionalidad;

    private Float duracion;

    @Column(name = "fecha_estreno")
    private Date fechaEstreno;

    private Double taquilla;

    private String productora;

    private String distribuidora;


    //---------------------------Cardinalidad----------------------
    //Peliculas-Director
    @OneToOne
    @JoinColumn(name = "Director")
    private Director director;

    //Peliculas-Genero
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Genero")
    private Genero genero;



    //----------------------Constructores-------------------------

    public Pelicula(){}

    public Pelicula(String titulo, String year) {
        this();
        this.titulo = titulo;
        this.year = year;
    }



    public Pelicula(String titulo, String year, String nacionalidad, Float duracion, Date fechaEstreno, Integer genero, Double taquilla, String productora, String distribuidora) {
        this();
        this.titulo = titulo;
        this.year = year;
        this.nacionalidad = nacionalidad;
        this.duracion = duracion;
        this.fechaEstreno = fechaEstreno;
        this.taquilla = taquilla;
        this.productora = productora;
        this.distribuidora = distribuidora;


    }

    //---------------------------Set y Get ---------------------------------


    public long getCodPelicula() {
        return codPelicula;
    }

    public void setCodPelicula(long codPelicula) {
        this.codPelicula = codPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Double getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(Double taquilla) {
        this.taquilla = taquilla;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    //Metodos --------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(codPelicula, pelicula.codPelicula);}

    @Override
    public int hashCode() {
        return Objects.hash(codPelicula);
    }


    @Override
    public String toString() {
        return "Pelicula{" +
                "codPelicula=" + codPelicula +
                ", titulo='" + titulo + '\'' +
                ", year='" + year + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", duracion=" + duracion +
                ", fechaEstreno=" + fechaEstreno +
                ", taquilla=" + taquilla +
                ", productora='" + productora + '\'' +
                ", distribuidora='" + distribuidora + '\'' +
                //", premio=" + premio +
                ", director=" + director +
                ", genero=" + genero +
                '}';
    }


}
