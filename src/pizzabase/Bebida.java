/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabase;
import java.util.Scanner;
/**
 * @since 10 de marzo de 2017
 * @author Johan Quiñonez
 * @version 1.0
 */
public class Bebida {
    Scanner teclado= new Scanner(System.in);
    private Sabor sab;
    private Altura[]alt;
    private int vbebida;
    /**
    * constructor 
    * @param sab sabor de la bebida
    * @param alt altura de la bebida
    * @param vbebida valor de la bebida
    */
    public Bebida(){
        this.sab=sab;
        Altura[] alt=new Altura[2];
        this.alt[0]=new Altura(3000,"pequeña");
        this.alt[1]=new Altura(5000,"grande");
        this.vbebida=vbebida;
    }
    /**
    *@return el sabor
    */
    public Sabor getSab() {
        return sab;
    }
    /**
    *@return el valor de la bebida
    */
    public int getVbebida() {
        return vbebida;
    }

    public void setVbebida(int vbebida) {
        this.vbebida = vbebida;
    }
    
    public void saborb(){
        System.out.println("¿Que sabor de bebida quiere: cola o limonada?");
        String s=teclado.next();
        sab.setNombre(s);
    }
    /**
    *@param s guarda que altura de bebida quiere el cliente 
    *@return el valor de la bebida segun la altura escogida
    */
    public int valorbebida(){
        System.out.println("De que tamaño quiere su bebida: 1=pequeña, 2=grande");
        int s=teclado.nextInt();
        return vbebida=alt[s-1].getPrecio();
    }
}

