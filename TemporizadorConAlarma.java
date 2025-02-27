/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temporizadorconalarma;

/**
 *
 * @author hraym
 */
public class TemporizadorConAlarma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Alarma alarma = new Alarma();
      //se asigna el tiempo en segundos
      alarma.setTiempoObjetivo(5);
      Temporizador tempo = new Temporizador();
      tempo.iniciarTemporizador(alarma);
    }
    
}
