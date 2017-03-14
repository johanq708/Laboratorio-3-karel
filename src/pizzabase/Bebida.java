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
public class Bebida {
    Scanner teclado= new Scanner(System.in);
    private Sabor sab;
    private Altura[]alt;
    private int vbebida;
    
    public Bebida(){
        this.sab=sab;
        Altura[] alt=new Altura[2];
        this.alt[0]=new Altura(3000,"pequeña");
        this.alt[1]=new Altura(5000,"grande");
        this.vbebida=vbebida;
    }

    public Sabor getSab() {
        return sab;
    }

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
    public int valorbebida(){
        System.out.println("De que tamaño quiere su bebida: 1=pequeña, 2=grande");
        int s=teclado.nextInt();
        return vbebida=alt[s-1].getPrecio();
    }
}

