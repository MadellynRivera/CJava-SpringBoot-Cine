package org.hibernate_jpa_asociaciones;

import jakarta.persistence.EntityManager;

import org.hibernate_jpa_asociaciones.util.JpaUtil;


public class Main {
    public static void main(String[] args) {
        //Objects----------------------------------------
       EntityManager manager = JpaUtil.getEntityManager();
     try {
         System.out.println("5. Modificación de --------------- ");



      }catch (Exception e){
          e.printStackTrace();

      }finally {
         manager.close();
     }

    }

}