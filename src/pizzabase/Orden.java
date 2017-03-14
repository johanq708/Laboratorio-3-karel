/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabase;
import java.util.Scanner;
/**
 * @since 10 de marzo de 2017
 * @author Johan Daniel Quiñonez Ruiz
 * @version 1.0
 */
public class Orden {
    Scanner teclado= new Scanner(System.in);
    private Pizza pizza;
    private Bebida bebida;
    private int valororden;
/**
    *construtuctor
    *@param pizza define la pizza de la orden
    *@param bebida define la bebida de la orden
    *@param valororden define el valor total de la orden 
    */
    public Orden() {
        this.pizza = pizza;
        this.bebida = bebida;
        this.valororden = valororden;
    }
/**
    *@return valororden devuelve el valor de la orden 
    */
    public int getValororden() {
        return valororden;
    }
/**
    *metodo que genera el tipo de pizza que desee el cliente 
    * @param c guarda el tipo de pizza que quiere el usuario
    * @param s guarda si el ingrediente quiere mas ingredientes
    */
    public void tipopizza(){
        this.pizza.dartamaño();
        System.out.println("como desea su pizza: armela usted mismo=1, pizza predeterminda=2");
        int c=teclado.nextInt();
        if(c==1){
            pizza.valoringrediente();
            System.out.println("¿desea algun otro ingrediente? 1=si o otro numero=no");
            int s=teclado.nextInt();
            while(s==1){
                pizza.masingrediente();
            }
        }else
        if(c==2){
            pizza.pizzap();
        }
    }
    /**
    *@return el valor de la pizza escogida por el cliente, junto a su tamaño
    */
    public int valorpizza(){
        return pizza.pizzapt();
    }
    /**
    *@param beb guarda si el cliente quiere o no bebida 
    */
    public void decidirbeb(){
        System.out.println("¿desea ordenar bebida? 1=si, otro numero=no");
        int beb=teclado.nextInt();
            if(beb==1){
                bebida.saborb();
                bebida.valorbebida();
            }else{
                bebida.setVbebida(0);
            }
    }
    /**
    *@return el valor de la bebida
    */
    public int valorbebida(){
        return bebida.getVbebida();
    }
    /**
    *@return el valor total de la orden 
    */
    public int valortotal(){
        return valororden=this.valorbebida()+this.valorpizza();
    }
}
