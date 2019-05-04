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
public class Hely extends Rol{

    
    public void draw(Graphics g) {
   g.drawImage(pictures.getInstance().getImages(4).getImage(),x,y, null);
    }
    
    
    
    
    
    
}
