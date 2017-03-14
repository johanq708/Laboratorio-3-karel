/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabase;

/**
 *
 * @author Johan Daniel Quiñonez Ruiz
 */
public class Predeterminada {
    private int precio;
    private String nombre;

    public Predeterminada(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
