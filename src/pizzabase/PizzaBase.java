/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabase;
import java.util.Scanner;
/**
 *
 * @author Johan Daniel Quiñonez Ruiz
 */
public class PizzaBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Orden orden1=new Orden();
        orden1.tipopizza();
        System.out.println("El valor de su pizza es: "+orden1.getValorpizza());
        orden1.decidirbeb();
        System.out.println("El valor de su orden es: "+(orden1.getValorpizza()+orden1.getValorbebida()));
}
}
