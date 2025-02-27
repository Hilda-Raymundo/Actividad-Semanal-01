/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controldetemperatura;

import java.util.Scanner;

/**
 *
 * @author hraym
 */
public class ControlDeTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float temperatura;
        int eleccion;
        Termometro convertirTemperatura = new Termometro();
        
        System.out.println("Ingrese la temperatura en grados: ");
        temperatura = scan.nextFloat();
        System.out.println("Convertirla a ");
        System.out.println("1. grados Fahrenheit");
        System.out.println("2. grados Kelvin");
        eleccion = scan.nextInt();
        
        if(eleccion == 1){
            convertirTemperatura.setgradosCelsius(temperatura);
            convertirTemperatura.convertirAFahrenheit();
            System.out.println("Grados fahrenheit-> " + convertirTemperatura.getGradosFahrenheit());
        }else if(eleccion == 2){
            convertirTemperatura.setgradosCelsius(temperatura);
            convertirTemperatura.convertirAKelvin();
            System.out.println("Grados kelvin-> " + convertirTemperatura.getGradosKelvin());
        }
        
    }
    
}
