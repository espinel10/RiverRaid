/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class NaveEspacial extends Rol{
 
    
 public ArrayList<Balas> balas; 
 public int puntaje=0;
 public void disparo(){
 balas.add(new Balas(x,y));
 }
 
 
  public NaveEspacial(){
balas=new ArrayList <Balas>();
   x=200;
   y=dy1; 
   }
  
  
  
  
    public void draw(Graphics g) {
     g.drawImage(pictures.getInstance().getImages(5).getImage(),x,y, null);
    //System.out.println(puntaje);
    }
  
  
}
