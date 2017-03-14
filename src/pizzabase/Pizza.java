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
public class Pizza {
    Scanner teclado= new Scanner(System.in);
    private Ingrediente[] ing;
    private Tamaño tamaño;
    private int vpizza;
    private Predeterminada[] pre;

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

    public Tamaño getTamaño() {
        return tamaño;
    }

    public int getVpizza() {
        return vpizza;
    }
    
    public void dartamaño(){
        System.out.println("Que tamaño de pizza desea, pequeño=1, mediana=2 o grande=3");
        int t=teclado.nextInt();
        if(t==1){
            tamaño.setTam(3);
        }else
        if(t==2){
            tamaño.setTam(6);
        }else
        if(t==3){
            tamaño.setTam(9);
        }else{
            System.out.println("tamaño invalido");
        }
    }
    
    public int valoringrediente(){
        System.out.println("¿Que ingrediente desea?: 1=queso,2=jamon,3=carne,4=pollo,5=salami,6=piña,7=maiz");
        int v=teclado.nextInt();
        return vpizza=ing[v-1].getPrecio();
    }
    
    public int masingrediente(){
        System.out.println("¿Que otro ingrediente desea?: 1=queso,2=jamon,3=carne,4=pollo,5=salami,6=piña,7=maiz");
        System.out.println("no repita el ingrediente que escogió anteriormente");
        int v=teclado.nextInt();
        return vpizza+=ing[v-1].getPrecio();
    }
    
    public int pizzap(){
        System.out.println("¿Que pizza desea?: 1=carnes, 2=hawaiyana, 3=mexicana");
        int v=teclado.nextInt();
        return vpizza=pre[v-1].getPrecio();
    }
    public int pizzapt(){
        return vpizza=vpizza*tamaño.getTam();
    }
}
