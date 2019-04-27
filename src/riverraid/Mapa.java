

package riverraid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Mapa  extends JFrame{
public static final int maxx =400;    
public static final int maxy=500;    
private static Mapa instance =null;    
 
private Mapa(){
 super("River Raid");
 this.setVisible(true);
 this.setResizable(false);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
addWindowListener(new WindowsEvents());

Escenario mimundo=new Escenario();
add(mimundo);
 
 
 }   

 public static Mapa getInstance(){
 if(instance==null){
 instance=new Mapa();
 
 }
 return instance;
 }
 
 
 
    class WindowsEvents extends WindowAdapter{
        @Override
        public void windowOpened(WindowEvent e) {
            Insets inset = getInsets();

            setSize(maxx+inset.left+inset.right, maxy+inset.top+inset.bottom);
           setLocationRelativeTo(null);
        }
    }



}

    
    

