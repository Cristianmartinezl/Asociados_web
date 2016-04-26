/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Entidades.Registradora;
import java.util.Scanner;



/**
 *
 * @author Sagaara
 */
public class Registrador_app {
       
    
 public static void main(String[] args) {
        System.out.println("1. Crear");
        System.out.println("2. Actualizar");
        System.out.println("Ingrese opcion:");
        Scanner e = new Scanner(System.in);
       String opcion = e.next();
       
       if ("1".equals(opcion)){
           
           Registrador_app.crearRegistrador();
       }
          if ("2".equals(opcion)){
           
           Registrador_app.ActualizarRegistrador();
       }
       
       
}
    
public static void crearRegistrador(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Asociados_WebPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
            Registradora aso = new Registradora ();
            System.out.println("Ingrese Nombre");
            Scanner id = new Scanner(System.in);
            aso.setId(id.nextInt());
             em.getTransaction().commit();
           
    }
     public static void ActualizarRegistrador(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Asociados_WebPU");
        EntityManager em = emf.createEntityManager();
        Registradora reg = new Registradora();
        em.getTransaction().begin();
        System.out.println("Ingrese Nombre");
        Scanner id = new Scanner(System.in);
        reg.setId(id.nextInt());
        
   em.merge(reg);
   em.getTransaction().commit();

    
    
     em.close();
     emf.close(); 
   }
               
    }
    
    
    
    
    
    
    
    
          
    

