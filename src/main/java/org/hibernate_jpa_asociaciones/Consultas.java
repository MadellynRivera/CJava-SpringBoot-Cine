package org.hibernate_jpa_asociaciones;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate_jpa_asociaciones.entity.Pelicula;
import org.hibernate_jpa_asociaciones.util.JpaUtil;

import java.util.List;

public class Consultas {
    public static void main(String[] args) {
        System.out.println("Modificando el valor del campo taquilla en Estados Unidos ");
        EntityManager em = JpaUtil.getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Double> cq = cb.createQuery(Double.class);
        Root<Pelicula> peliculaRoot = cq.from(Pelicula.class);
        cq.select(cb.prod(peliculaRoot.get("taquilla"),0.8)) .where(cb.equal(peliculaRoot.get("nacionalidad"), "Estados Unidos"));

        List<Double> taquillaUSA = em.createQuery(cq).getResultList();
        System.out.println("$" + taquillaUSA);


    }
}
