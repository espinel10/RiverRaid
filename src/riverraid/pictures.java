/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraid;

import java.net.URL;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class pictures {
    /* 0 bote
       1 gasolina 
       2 monte
       3 monte con esquina
       4 helicoptero
       5 jugador 
       6 disparo
    */
  
   public static final int cant=7; 
   private static ImageIcon images[];
   private static pictures instance =null;
    
   private pictures(){
    images=new ImageIcon[cant];   
   String names[]= new String[]{"boat.png", "fuel.png", "grass.png", "grass_a.png","hely.png","player.png","shoot.png"};
    for(int i =0;i<cant;i++){
    URL url=this.getClass().getResource("images/"+names[i]);
    images[i]=new ImageIcon(url);
    }                                 
   }
   
public static  pictures getInstance(){
if(instance==null){
instance=new pictures();
}
return instance;
}    
public ImageIcon getImages(int num){
return images[num];    
}  


    
}
