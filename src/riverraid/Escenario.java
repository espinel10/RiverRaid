/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraid;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class Escenario  extends JPanel{
public static int nivel;
 private static NaveEspacial nave;
 private static ArrayList<Rol> obstaculos;
 private static Escenario instance =null;
 private Escenario(){
 super();
nave=new NaveEspacial();
obstaculos=new ArrayList<Rol>();
 nivel=100;
 }
 
 
 
 
 
 
   public void paint(Graphics g) {
    Balas bala;
    this.setBackground(Color.blue);
    super.paint(g);
    
    for (int i=0;i<400;i++){
            for(int j=0;j<500;j++){
            if(i<70||i>280){
            g.drawImage(pictures.getInstance().getImages(2).getImage(), i,j, null);
            }
            }
    }
    
   
   nave.draw(g);
   for(int i=0;i<obstaculos.size();i++){
   if(obstaculos.get(i)!=null){
   obstaculos.get(i).draw(g);
   }
   }
   
   for(int k=0;k<nave.balas.size();k++){
   if(nave.balas.get(k)!=null){
   nave.balas.get(k).draw(g);
   }
   }
  
   
   
   
   }
    
  
public static  Escenario getInstance(){
if(instance ==null)instance=new Escenario();
return instance;
}   
   
public static NaveEspacial getNave(){
return nave;
}  
public static void partida(){
if(MotorDeJuego.segundos%nivel==0){
obstaculos.add(new Barco());
}
if(MotorDeJuego.segundos%(nivel*2)==0){
obstaculos.add(new Hely());
}    
  

}

public static void juego(){
for(int i=0;i<obstaculos.size();i++){
if(obstaculos.get(i)!=null){
obstaculos.get(i).y++;
if(obstaculos.get(i).x==nave.x&&obstaculos.get(i).y==nave.y){
nave.vida=nave.vida-20;
}

if(obstaculos.get(i).y==481){
obstaculos.remove(i);
System.out.println("objeto eliminado");
}
for(int j=0;j<nave.balas.size();j++){
 if(obstaculos.get(i).getUbicacion()==nave.balas.get(j).getUbicacion()){
obstaculos.get(i).vida=obstaculos.get(i).vida-20;
}
}
if(obstaculos.get(i).vida==0){
obstaculos.remove(i);
}
}
}

}     
   
    
}
