/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizadorconalarma;

/**
 *
 * @author hraym
 */
public class Alarma {
    
    private int tiempoObjetivo;
    
    public Alarma(){
    }
    
    public int getTiempoObjetivo(){
        return tiempoObjetivo;
    }
    
    public void setTiempoObjetivo(int tiempoObjetivo){
        this.tiempoObjetivo = tiempoObjetivo;
    }
    
    public String toString(){
        return "" + this.tiempoObjetivo;
    }
    
    public void sonarAlarma(){
        System.out.println("Alarma Activada!!!! ");
    }
    
}
