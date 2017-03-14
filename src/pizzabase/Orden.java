/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabase;
import java.util.Scanner;
/**
 *
 * @author Johan Quiñonez
 */
public class Orden {
    Scanner teclado= new Scanner(System.in);
    private Pizza pizza;
    private Bebida bebida;
    private int valororden;

    public Orden() {
        this.pizza = pizza;
        this.bebida = bebida;
        this.valororden = valororden;
    }

    public int getValororden() {
        return valororden;
    }

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
    
    public int valorpizza(){
        return pizza.pizzapt();
    }
    
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
    public int valorbebida(){
        return bebida.getVbebida();
    }
    public int valortotal(){
        return valororden=this.valorbebida()+this.valorpizza();
    }
}
