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
   public static int segundos; 
    private static Timer timer;
     private MotorDeJuego() {
    segundos=0;
    timer = new Timer(10, new TimerEvent());
    }
    public static void iniciar(){
    timer.start();
    }
    public static void detener(){
    timer.stop();
    }
  
    public void juego(){
    Escenario.juego();
    Escenario.partida();
    if(Escenario.getNave().vida==0){
    timer.stop();
    }
    
    }
            
       public static MotorDeJuego getInstance(){
        if(instance == null)
            instance = new MotorDeJuego();
        return instance;
    }
    
     class TimerEvent implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           
            segundos++;
            juego();
            Escenario.getInstance().repaint();
        }

    }
    
}
