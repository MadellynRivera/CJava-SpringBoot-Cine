package org.hibernate_jpa_asociaciones.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Ganar_premios")
public class GanarPremio {

  @EmbeddedId
  private GanaPremioId ganaPremioId;
    private String anyo;

    //Set y Get ------------------

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    //Subclase: primary key compuesta --------------------------------
   @Embeddable
    public static class GanaPremioId implements Serializable
    {

        @ManyToOne
        @JoinColumn(name = "cod_premio")
        private Premio premio;

        @ManyToOne
        @JoinColumn(name = "cod_pelicula")
        private Pelicula pelicula;
    }

    //Metodos-----------------------------------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GanarPremio that = (GanarPremio) o;
        return Objects.equals(ganaPremioId, that.ganaPremioId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ganaPremioId);
    }
}
