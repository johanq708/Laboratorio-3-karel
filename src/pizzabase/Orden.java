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
    private int v;
    private int t;
    private int c;
    private int beb;
    private int valorpizza;
    private int valorbebida;
    private String s;

    public Orden() {
        this.pizza = pizza;
        this.bebida = bebida;
    }

    public int getValorbebida() {
        return valorbebida;
    }

    public void setValorbebida(int valorbebida) {
        this.valorbebida = valorbebida;
    }

    public int getValorpizza() {
        return valorpizza;
    }

    public void setValorpizza(int valorpizza) {
        this.valorpizza = valorpizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
    public void tipopizza(){
        pizza.dartamaño();
        System.out.println("como desea su pizza: armela usted mismo=1, pizza predeterminda=2");
        c=teclado.nextInt();
        if(c==1){
            pizza.valoringrediente();
            System.out.println("¿desea algun otro ingrediente? Escriba si o no");
            while(s=="si"){
                pizza.masingrediente();
            }
        }else
        if(c==2){
            pizza.pizzap();
        }
    }
    
    public void valorpizza(){
        valorpizza=pizza.getValort()*pizza.getValor();
    }
    public void valorb(){
        System.out.println("Escoja el tamaño su bebida: 1=pequeño, 2=grande");
        v=teclado.nextInt();
        if(v==1){
            setValorbebida(5000);
        }else
        if(v==2){
            setValorbebida(7000);
        }else{
            System.out.println("tamaño invalido");
        }
        }
    public void decidirbeb(){
        System.out.println("¿desea ordenar bebida? 1=si, otro numero=no");
        beb=teclado.nextInt();
            if(beb==1){
                this.valorb();
                bebida.saborb();
            }
    }
}
