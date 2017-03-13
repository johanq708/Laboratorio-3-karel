/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabase;
import java.util.Scanner;
/**
 *
 * @author johit
 */
public class Bebida {
    Scanner teclado= new Scanner(System.in);
    private String sabor1="limonada";
    private String sabor2="cola";
    private int v;
    private int s;

    public Bebida() {
        this.sabor1 = sabor1;
    }

    public String getSabor1() {
        return sabor1;
    }

    public String getSabor2(){
        return sabor2;
    }
    
    public void saborb(){
        System.out.println("¿Que sabor de bebida quiere: 1=cola o 2=limonada?");
        s=teclado.nextInt();
        if(s==1){
            getSabor1();
        }else
        if(s==2){
            getSabor2();
        }else{
            System.out.println("sabor invalido");
        }
    }
    }

