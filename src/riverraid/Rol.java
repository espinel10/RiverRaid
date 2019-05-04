/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraid;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author LENOVO
 */
public abstract class Rol {
 public final int dx1=98;
 public final int dx2=260;
 public final int dy1=480;
 public final int dy2=0;
 public  int x;
 public  int y;   
 public int vida=100;
 public Rol(int _x,int _y){
 x=_x;
 y=_y;
 
 }
 public Point getUbicacion(){
 Point p;
 p=new Point(x,y);
 return p;
 }
 
 public Rol(){
 x=0;
 y=0;
 }
 public void setLocation(int _x,int _y){
  x=_x;
 y=_y;
 
 }
 
 
 
 
 public abstract void draw(Graphics g) ;  
    
    
}
