/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.a04;

import java.util.ArrayList;

/**
 *
 * @author danx_
 */
public class POOA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Donde T son Integers
        GenericClass c1 = new GenericClass();
        c1.almacenarUltimoDisponible(100);
        c1.almacenarUltimoDisponible(36);
        c1.almacenarUltimoDisponible(1023);
        System.out.println(c1.devuelveAlmacenados());
        System.out.println("");
        
        //Donde T son Strings
        GenericClass c2 = new GenericClass();
        c2.almacenarUltimoDisponible("Hello");
        c2.almacenarUltimoDisponible("dudududu");
        c2.almacenarUltimoDisponible("OC");
        System.out.println(c2.devuelveAlmacenados());
        System.out.println("");
        
        //Donde T son Floats
        GenericClass c3 = new GenericClass();
        c3.almacenarUltimoDisponible(2.1234);
        c3.almacenarUltimoDisponible(1.0000);
        c3.almacenarUltimoDisponible(3.1416);
        System.out.println(c3.devuelveAlmacenados());
        System.out.println("");
        
        //Donde T son Personas
        GenericClass c4 = new GenericClass();
        Persona p1 = new Persona("Neto", "m", 69);
        Persona p2 = new Persona("Luisa", "f", 18);
        c4.almacenarUltimoDisponible(p1);
        c4.almacenarUltimoDisponible(p2);
        Persona x = (Persona) c4.devuelveAlmacenados().get(0);
        System.out.println(x.getNombre());
        System.out.println(x.getSexo());
        System.out.println(x.getEdad());
        Persona x1 = (Persona) c4.devuelveAlmacenados().get(1);
        System.out.println(x1.getNombre());
        System.out.println(x1.getSexo());
        System.out.println(x1.getEdad());
        System.out.println("");
    }
    
}
