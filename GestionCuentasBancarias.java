/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncuentasbancarias;

import java.util.Scanner;

/**
 *
 * @author hraym
 */
public class GestionCuentasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int eleccion = 0;
        int noCuenta = 0;
        float monto = 0.0f;
        
        do{
            System.out.println(" \n Elija la opcion que desee ejecutar");
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Consultar");
            eleccion = scan.nextInt();

            System.out.println("Ingrese el numero de cuenta: ");
            noCuenta = scan.nextInt();
            CuentaBancaria cuentaBancaria = new CuentaBancaria(noCuenta);
        
            switch(eleccion){
                case 1:
                    System.out.println("Ingrese el saldo inicial: ");
                    monto = scan.nextInt();
                    cuentaBancaria.setnoCuenta(noCuenta);
                    cuentaBancaria.setDeposito(monto);
                    cuentaBancaria.crearCuenta();
                    break;
                case 2:
                    System.out.println("Ingrese el monto a depositar: ");
                    monto = scan.nextInt();
                    cuentaBancaria.setnoCuenta(noCuenta);
                    cuentaBancaria.setDeposito(monto);
                    cuentaBancaria.depositar();
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar: ");
                    monto = scan.nextInt();
                    cuentaBancaria.setnoCuenta(noCuenta);
                    cuentaBancaria.setDeposito(monto);
                    cuentaBancaria.retirar();
                    break;
                case 4:
                    cuentaBancaria.setnoCuenta(noCuenta);
                    cuentaBancaria.consultar();
                    break;
                default:
                    break;
            }
        }while(eleccion>0 && eleccion<5);
                
        
        
    }
    
}
