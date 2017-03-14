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
public class Altura {
    private int precio;
    private String altura;
    /**
    * constructor 
    * @param precio precio de la altura de la bebida
    * @param nombre nombre de la altura de la bebida
    */
    public Altura(int precio, String altura) {
        this.precio = precio;
        this.altura = altura;
    }
    /**
    *@return el precio
    */
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /**
    *@return la altura
    */
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
}
