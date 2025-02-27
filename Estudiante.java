/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlnotascurso;

/**
 *
 * @author hraym
 */
public class Estudiante {
    
    private String nombre;
    private String carnet;
    private float notaFinal;
 
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCarnet(String carnet){
        this.carnet = carnet;
    }
    
    public void setNotaFinal(float notaFinal){
        if(notaFinal>=0 && notaFinal<=100){
            this.notaFinal = notaFinal;
        }else{
            System.err.println("Revise la nota ingresada para " + this.nombre + " no es aceptada, quedara en 0");
        }
    }
    
    public float getNotaFinal(){
        return this.notaFinal;
    }
    
    public String toString(){
        return "nombre estudiante: " + this.nombre + " nota final: " + this.notaFinal;
    }
    
    public void asignar(Curso curso){
        curso.asignar(this);
        
    }
    
}
