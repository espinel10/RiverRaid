/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraid;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author LENOVO
 */
public class MotorDeJuego {
   private static MotorDeJuego  instance=null;
    
    private static Timer timer;
     private MotorDeJuego() {
    timer = new Timer(1, new TimerEvent());
    }
    public static void iniciar(){
    timer.start();
    }
    public static void detener(){
    timer.stop();
    }
            
       public static MotorDeJuego getInstance(){
        if(instance == null)
            instance = new MotorDeJuego();
        return instance;
    }
    
     class TimerEvent implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           
            Escenario.getInstance().repaint();
        }

    }
    
}
