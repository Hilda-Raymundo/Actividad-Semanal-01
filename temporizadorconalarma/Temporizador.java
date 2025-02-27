/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizadorconalarma;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hraym
 */
public class Temporizador {
    
    private int tiempoActual;
    
    public Temporizador(){
        tiempoActual = 0;
    }
    
    public void iniciarTemporizador(Alarma alarma){
        for(int i = 0 ; i <= alarma.getTiempoObjetivo() ; i++){
            try {
                //se espera 1 segundo para volver al for
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Temporizador.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(i);
        }
        //cuando el temporizador llega a la alarma, suena la alarma
        alarma.sonarAlarma();
    }
}