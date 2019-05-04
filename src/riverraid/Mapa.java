

package riverraid;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Mapa  extends JFrame{
public static boolean finDelJuego=false;    
public static int TECLA_IZQ = 1;
public static int TECLA_DER = 2;
public static int TECLA_UP=3;
public static int TECLA_DOWN=4;        
public static int TECLA_ESP = 5;
public int teclas_activas;   
public static final int maxx =400;    
public static final int maxy=500;    
private static Mapa instance =null;     

private Mapa(){
 super("River Raid");
 this.setVisible(true);
 this.setResizable(false);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
addWindowListener(new WindowsEvents());
addKeyListener(new KeyEvents());
Escenario.getInstance();
add(Escenario.getInstance());
MotorDeJuego.getInstance();
MotorDeJuego.iniciar();
 
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
   
    
    
        class KeyEvents extends KeyAdapter{
        
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
                case KeyEvent.VK_SPACE:
                    teclas_activas = TECLA_ESP;
                    Escenario.getNave().disparo();
                     System.out.println("disparo");
                    break;
                case KeyEvent.VK_LEFT:
                    teclas_activas = TECLA_IZQ;
                    Escenario.getNave().x--;
                    System.out.println("izquierda");
                    break;
                case KeyEvent.VK_RIGHT:
                    teclas_activas = TECLA_DER;
                    Escenario.getNave().x++;
                    System.out.println("derecha");
                    break;
                    
                case KeyEvent.VK_UP:
                    teclas_activas=TECLA_UP;
                    Escenario.getNave().y--;
                    System.out.println("arriba");
                    break;
                
                case KeyEvent.VK_DOWN:
                    teclas_activas=TECLA_DOWN;
                    Escenario.getNave().y++;
                    System.out.println("abajito");
                    break;
                    
            }
        } 
        }
    
}

    
    

