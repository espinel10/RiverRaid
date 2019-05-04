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
public class Balas extends Rol{

 public Timer timer;       

public Balas(int _x,int _y){
super(_x,_y);
timer=new Timer(1,new ActionListener(){
public void actionPerformed(ActionEvent e){
y--;
}
});
timer.start();
}

public void detener(){
timer.stop();
} 
 
public void draw(Graphics g) {
 g.drawImage(pictures.getInstance().getImages(6).getImage(),x,y, null);
 } 
 


}
