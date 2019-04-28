/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraid;

import java.awt.Color;
import java.awt.Graphics;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author LENOVO
 */
public class NaveEspacial {
 public final int dx1=100;
 public final int dx2=280;
 public final int dy1=480;
 public final int dy2=0;
 public  int x;
 public  int y;
    
  public NaveEspacial(){
   x=200;
   y=dy1; 
   }
  public void draw(Graphics g) {
     g.drawImage(pictures.getInstance().getImages(5).getImage(),x,y, null);
    }
  
  
}
