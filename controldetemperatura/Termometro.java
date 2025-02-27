/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controldetemperatura;

/**
 *
 * @author hraym
 */
public class Termometro {
    
    private float gradosCelsius;
    private float fahrenheit;
    private float kelvin;
    
    public Termometro(){
    
    }
    
    public void setgradosCelsius(float gradosCelsius){
        this.gradosCelsius = gradosCelsius;
    }

    public float getGradosFahrenheit(){
        return this.fahrenheit;
    }
    
    public float getGradosKelvin(){
        return this.kelvin;
    }
    
    public void convertirAFahrenheit(){
        this.fahrenheit = (this.gradosCelsius * 9/5) + 32;
    }
    
    public void convertirAKelvin(){
        this.kelvin = this.gradosCelsius + 273;
    }
    
}
