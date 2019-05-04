/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraid;

import java.awt.Graphics;

/**
 *
 * @author LENOVO
 */
public class Combustible extends Rol{

public Combustible(){
int numero;
do{
 numero = (int) (Math.random() * 260) + 98;   
}while(numero>dx2||numero<dx1);    

setLocation(numero,0);
    }
    
    
    public void draw(Graphics g) {
     g.drawImage(pictures.getInstance().getImages(1).getImage(),x,y, null);
    }   
    
    
    
}
