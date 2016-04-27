/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.a05;

import java.util.ArrayList;

/**
 *
 * @author danx_
 */
public class GenericClass<T> {
    //Atributos
    ArrayList<T> list = new ArrayList<T>(100);
    
    public GenericClass() {
        
    }
    
    public void almacenarUltimoDisponible(T t) {
        this.list.add(t);
        System.out.println("Se ha agregado el dato");
    }
    
    public void almacenarEnPosicion(T t, int n) {
        try {
            this.list.add(n, t);
            System.out.println("Se ha agregado el dato");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Fuera del limite de posiciones");
        }
    }
    
    public ArrayList<T> devuelveAlmacenados() {
        return this.list;
    }
    
    public T devuelvePrimero() {
        return list.get(0);
    }
    
    public T devuelveUltimoExistente() {
        return this.list.get(this.list.size() - 1);
    }
}
