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
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class Escenario  extends JPanel{
 private static NaveEspacial nave;
 private static Barco barco;
 private static Escenario instance =null;
 private Escenario(){
 super();
nave=new NaveEspacial();
barco=new Barco(); 
 }
 
 
 
 
 
 
   public void paint(Graphics g) {
   this.setBackground(Color.blue);
    super.paint(g);
    
    for (int i=0;i<400;i++){
            for(int j=0;j<500;j++){
            if(i<70||i>280){
            g.drawImage(pictures.getInstance().getImages(2).getImage(), i,j, null);
            }
            }
    }
    
    barco.draw(g);
    nave.draw(g);
    }
    
  
public static  Escenario getInstance(){
if(instance ==null)instance=new Escenario();
return instance;
}   
   
public static NaveEspacial getNave(){
return nave;
}  
   
   
   
    
}
