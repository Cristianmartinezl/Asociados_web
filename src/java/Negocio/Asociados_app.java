/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Entidades.Asociado;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author Sagaara
 */
public class Asociados_app {
     public static void main(String[] args) {
        System.out.println("1. Crear");
        System.out.println("2. Buscar");
        System.out.println("Ingrese opcion:");
        Scanner e = new Scanner(System.in);
       String opcion = e.next();
       
       if ("1".equals(opcion)){
           
           Asociados_app.crearAsociado();
       }
          if ("2".equals(opcion)){
           
           Asociados_app.buscarAsociado();
       }
       
       
}
public static void crearAsociado(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Asociados_WebPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
            Asociado aso = new Asociado ();
            System.out.println("Ingrese Nombre");
            Scanner nombre = new Scanner(System.in);
            aso.setNombre(nombre.next());
             em.getTransaction().commit();
           
    }
    public static  void buscarAsociado()
    {
   EntityManagerFactory emf = Persistence.createEntityManagerFactory("Asociados_WebPU");
   EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    Asociado aso = new Asociado();
    List<Asociado> list =em.createNamedQuery("Asociado.findAll",Asociado.class).getResultList();
    for(Asociado p : list)
    {
           System.out.println(p.getNombre());
    }
     em.close();
     emf.close(); 
       }
}


