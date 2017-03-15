package Laberinto;
import becker.robots.*;
/**
 * @since 12 de marzo de 2017
 * @author Johan Daniel Quiñonez Ruiz
 * @version 1.0
 */
public class Resolver {
    private City ciudad;
    private Robot robot;

    public Resolver() {
        this.ciudad = new City();
        this.robot = new Robot(ciudad,10,1,Direction.NORTH);
    }
    
    public void derecha(){
        for(int i=0;i<3;i++){
            this.robot.turnLeft();
        }
    }
    
    public void evaluarderecha(){
        this.derecha();
        if(this.robot.frontIsClear()==false){
            this.robot.turnLeft();
        }else{
            this.robot.move();
        }
    }
    
    public void evaluarizquierda(){
        this.robot.turnLeft();
        if(this.robot.frontIsClear()==false){
            this.derecha();
        }else{
            this.robot.move();
        }
    }
    
    public void mover(){
        if(this.robot.frontIsClear()==true){
            this.robot.move();
        }
    }
    
    public void resuelve(){
        while(this.robot.canPickThing()==false){
            this.evaluarderecha();
            this.evaluarizquierda();
            this.mover();
        }
    }
    
}
