/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabase;

/**
 * @since 10 de marzo de 2017
 * @author Johan Quiñonez
 * @version 1.0
 */
public class Sabor {
    private String nombre;
    /**
    * constructor 
    * @param nombre nombre del sabor
    */
    public Sabor(String nombre) {
        this.nombre = nombre;
    }
    /**
    *@return el nombre
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
