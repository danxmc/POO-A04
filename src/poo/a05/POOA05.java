/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.a05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danx_
 */
public class POOA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Donde T son Integers
        GenericClass<Integer> c1 = new GenericClass<Integer>();
        c1.almacenarUltimoDisponible(100);
        c1.almacenarUltimoDisponible(36);
        c1.almacenarUltimoDisponible(1023);
        System.out.println(c1.devuelveAlmacenados());
        System.out.println("");
        
        //Donde T son Strings
        GenericClass<String> c2 = new GenericClass<String>();
        c2.almacenarUltimoDisponible("Hello");
        c2.almacenarUltimoDisponible("dudududu");
        c2.almacenarUltimoDisponible("OC");
        System.out.println(c2.devuelveAlmacenados());
        System.out.println("");
        
        //Donde T son Floats
        GenericClass<Float> c3 = new GenericClass<Float>();
        c3.almacenarUltimoDisponible(2.1234f);
        c3.almacenarUltimoDisponible(1.0000f);
        c3.almacenarUltimoDisponible(3.1416f);
        System.out.println(c3.devuelveAlmacenados());
        System.out.println("");
        
        //Donde T son Personas
        GenericClass<Persona> c4 = new GenericClass<Persona>();
        Persona p1 = new Persona("Neto", "m", 69);
        Persona p2 = new Persona("Luisa", "f", 18);
        c4.almacenarUltimoDisponible(p1);
        c4.almacenarUltimoDisponible(p2);
        List<Persona> t = new ArrayList();
        t = c4.devuelveAlmacenados();
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i).getNombre() + ", " + t.get(i).getSexo() + ", " + t.get(i).getEdad());
        }
        System.out.println("");
    }
    
}
