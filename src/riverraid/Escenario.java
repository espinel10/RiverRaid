/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraid;

import java.awt.*;
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
   private int dx1=100;
   private int dx2=300;
   private int dy1=480;
   private int dy2=0;
   public void paint(Graphics g) {
   this.setBackground(Color.blue);
   URL url = this.getClass().getResource("images/player.png");
   ImageIcon imagen=new ImageIcon(url);
  
    super.paint(g);
   g.drawImage(imagen.getImage(),dx1,dy1, null);
   
    
    }
    
    
    
}