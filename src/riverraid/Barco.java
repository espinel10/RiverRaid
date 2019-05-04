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
public class Barco extends Rol{ 
public int direccion;
public Timer timer;   

public Barco(){
int numero;
do{
 numero = (int) (Math.random() * 260) + 98;   
}while(numero>dx2||numero<dx1);    
if(numero%2==0){
direccion=1;
}else{
direccion=-1;
}     
setLocation(numero,0);
timer =new Timer(1,new ActionListener(){
public void actionPerformed(ActionEvent e){
movimientos();
}
}); 

timer.start();
 }
    
public void detener(){
timer.stop();
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
if(y==dy1){
timer.stop();
}

}
 
 
    
    
}
