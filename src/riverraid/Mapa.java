

package riverraid;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Mapa  extends JFrame{
    
 public Mapa(){
 super("River Raid");
 this.setBounds(900, 300, 400, 500);
 this.setVisible(true);
 this.setResizable(false);
 this.setLayout(null);
 eventos();
 movimiento();
 
 }   
public void movimiento(){
Rectangle nave= new Rectangle(100,100,20,30);
ImageIcon icon=new ImageIcon(nave);

} 
 
 
public void  eventos(){
    addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
    System.exit(0);
    }
    
    
    });

}

    private void add(Rectangle nave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
