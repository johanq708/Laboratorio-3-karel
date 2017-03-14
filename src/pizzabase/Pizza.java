/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabase;
import java.util.Scanner;
/**
 * @since 12 de marzo de 2017
 * @author Johan Quiñonez
 * @version 1.0
 */
public class Pizza {
    Scanner teclado= new Scanner(System.in);
    private Ingrediente[] ing;
    private Tamaño tamaño;
    private int vpizza;
    private Predeterminada[] pre;
    /**
    * constructor 
    * @param tamaño es el tamaño de la pizza
    * @param ing son los ingredientes de la pizza
    * @param pre son las pizzas ya predeterminadas que se pueden escoger
    * @param vpizza es el valor de la pizza
    */

    public Pizza() {
        this.tamaño = tamaño;
        this.ing[0]= new Ingrediente(500,"queso"); 
        this.ing[1]= new Ingrediente(700,"jamon"); 
        this.ing[2]= new Ingrediente(1500,"carne"); 
        this.ing[3]= new Ingrediente(1500,"pollo"); 
        this.ing[4]= new Ingrediente(1600,"salami"); 
        this.ing[5]= new Ingrediente(800,"piña"); 
        this.ing[6]= new Ingrediente(800,"maiz");
        this.pre[0]= new Predeterminada(3000,"carnes");
        this.pre[1]= new Predeterminada(2500,"hawaiyana");
        this.pre[2]= new Predeterminada(3000,"mexicana");
        this.vpizza=vpizza;
    }
    /**
    *@return el tamaño 
    */
    public Tamaño getTamaño() {
        return tamaño;
    }
    /**
    *@return el valor de la pizza 
    */
    public int getVpizza() {
        return vpizza;
    }
    /**
    *@param t   
    */
    public void dartamaño(){
        System.out.println("Que tamaño de pizza desea, pequeño=3, mediana=6 o grande=9");
        int t=teclado.nextInt();
        tamaño.setTam(t);
        }
    }
    /**
    *@return el valor del ingrediente escogido
    */
    public int valoringrediente(){
        System.out.println("¿Que ingrediente desea?: 1=queso,2=jamon,3=carne,4=pollo,5=salami,6=piña,7=maiz");
        int v=teclado.nextInt();
        return vpizza=ing[v-1].getPrecio();
    }
    /**
    *@return la suma del valor de los ingredientes escogidos
    */
    public int masingrediente(){
        System.out.println("¿Que otro ingrediente desea?: 1=queso,2=jamon,3=carne,4=pollo,5=salami,6=piña,7=maiz");
        System.out.println("no repita el ingrediente que escogió anteriormente");
        int v=teclado.nextInt();
        return vpizza+=ing[v-1].getPrecio();
    }
    /**
    *@return el valor de la pizza predeterminada 
    */
    public int pizzap(){
        System.out.println("¿Que pizza desea?: 1=carnes, 2=hawaiyana, 3=mexicana");
        int v=teclado.nextInt();
        return vpizza=pre[v-1].getPrecio();
    }
/**
    *@return el valor de la pizza escogida o la suma de los ingredientes elegidos multiplicado por el tamaño 
    */
    public int pizzapt(){
        return vpizza=vpizza*tamaño.getTam();
    }
}
