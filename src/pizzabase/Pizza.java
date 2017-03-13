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
    private int piña=2000;
    private int jamon=1500;
    private int queso=1000;
    private int salami=3000;
    private int maiz=2000;
    private int carne=3000;
    private int pollo=3000;
    private int carnes=7000;
    private int hawaiyana=5000;
    private int mexicana=6000;
    private int pequeño=3;
    private int mediano=6;
    private int grande=9;
    private int v;
    private int t;
    private int valor;
    private int valort;

    public int getValort() {
        return valort;
    }

    public void setValort(int valort) {
        this.valort = valort;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPequeño() {
        return pequeño;
    }

    public int getMediano() {
        return mediano;
    }

    public int getGrande() {
        return grande;
    }

    public int getPiña() {
        return piña;
    }

    public int getJamon() {
        return jamon;
    }

    public int getQueso() {
        return queso;
    }

    public int getSalami() {
        return salami;
    }

    public int getMaiz() {
        return maiz;
    }

    public int getCarne() {
        return carne;
    }

    public int getPollo() {
        return pollo;
    }

    public int getCarnes() {
        return carnes;
    }

    public int getHawaiyana() {
        return hawaiyana;
    }

    public int getMexicana() {
        return mexicana;
    }
    
    public void dartamaño(){
        System.out.println("Que tamaño de pizza desea, pequeño=1, mediana=2 o grande=3");
        t=teclado.nextInt();
        if(t==1){
            setValort(getPequeño());
        }else
        if(t==2){
            setValort(getMediano());
        }else
        if(t==3){
            setValort(getGrande());
        }else{
            System.out.println("tamaño invalido");
        }
    }
    
    public void valoringrediente(){
        System.out.println("¿Que ingrediente desea?: 1=piña,2=jamon,3=queso,4=salami,5=maiz,6=carne,7=pollo");
        v=teclado.nextInt();
        if(t==1){
            setValor(getPiña());
        }else
        if(t==2){
            setValor(getJamon());
        }  
        if(t==3){
            setValor(getQueso());
        }
        if(t==4){
            setValor(getSalami());
        }
        if(t==5){
            setValor(getMaiz());
        }
        if(t==6){
            setValor(getCarne());
        }
        if(t==7){
            setValor(getPollo());
        }
    }
    
    public void masingrediente(){
        System.out.println("¿Que otro ingrediente desea?: 1=piña,2=jamon,3=queso,4=salami,5=maiz,6=carne,7=pollo");
        System.out.println("no repita el ingrediente que escogió anteriormente");
        v=teclado.nextInt();
        if(t==1){
            setValor(getValor()+getPiña());
        }else
        if(t==2){
            setValor(getValor()+getJamon());
        }  
        if(t==3){
            setValor(getValor()+getQueso());
        }
        if(t==4){
            setValor(getValor()+getSalami());
        }
        if(t==5){
            setValor(getValor()+getMaiz());
        }
        if(t==6){
            setValor(getValor()+getCarne());
        }
        if(t==7){
            setValor(getValor()+getPollo());
        }
    }
    
    public void pizzap(){
        System.out.println("¿Que pizza desea?: 1=carnes, 2=hawaiyana, 3=mexicana");
        v=teclado.nextInt();
        if(t==1){
            setValor(getCarnes());
        }
        if(t==2){
            setValor(getHawaiyana());
        }
        if(t==3){
            setValor(getMexicana());
        }
    }
}
