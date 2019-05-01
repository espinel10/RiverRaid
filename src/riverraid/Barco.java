/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraid;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author LENOVO
 */
public class Barco {
 public final int dx1=98;
 public final int dx2=260;
 public final int dy1=480;
 public final int dy2=0;
 public  int x;
 public  int y;
 public int direccion;
 public Timer timer;   
 
 public Barco(){
direccion=1;     
x=100;
y=400;     
timer =new Timer(1,new ActionListener(){
public void actionPerformed(ActionEvent e){
movimientos();
}
}); 

timer.start();
 }
    
public void movimientos(){
if(direccion==1){
    if(x<dx2){
    x++;
    }else{
    direccion=-1;
    }
    
}
if(direccion==-1){
    if(x>dx1){
    x--;
    }else{
    direccion=1;
    }
}

} 
 
public void draw(Graphics g) {
 g.drawImage(pictures.getInstance().getImages(0).getImage(),x,y, null);
}
 
 
    
    
}
