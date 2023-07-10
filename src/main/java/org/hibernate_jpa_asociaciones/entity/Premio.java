package org.hibernate_jpa_asociaciones.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Premios")
public class Premio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_premio")
    private long codPremio;
    @Column(nullable = false)
    private String premio;


    //Constructores --------------------------------

    public Premio(){}
    public Premio( String premio) {
        this();
        this.premio = premio;
    }

   //Set y Get -------------------------------------
    public long getCodPremio() {
        return codPremio;
    }

    public void setCodPremio(long codPremio) {
        this.codPremio = codPremio;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Premio premio = (Premio) o;
        return Objects.equals(codPremio, premio.codPremio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPremio);
    }

    @Override
    public String toString() {
        return "Premio{" +
                "codPremio=" + codPremio +
                ", premio='" + premio + '\'' +
                '}';
    }
}
