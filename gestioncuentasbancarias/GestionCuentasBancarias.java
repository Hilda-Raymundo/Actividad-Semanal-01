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
        CuentaBancaria cuentaBancaria = new CuentaBancaria(0);
        Scanner scan = new Scanner(System.in);
        int eleccion = 0;
        int noCuenta = 0;
        float monto = 0.0f;
        float deposito = 0.0f;
        
            System.out.println("Escriba el numero de la opcion que desee ejecutar");
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Ya tengo cuenta");
            eleccion = scan.nextInt();
            System.out.println("Ingrese el numero de cuenta: ");
            noCuenta = scan.nextInt();
            
            if(eleccion == 1){
                System.out.println("Ingrese el saldo inicial: ");
                    monto = scan.nextInt();
                    cuentaBancaria.setnoCuenta(noCuenta);
                    cuentaBancaria.setSaldo(monto);
                    cuentaBancaria.crearCuenta();
            }else if(eleccion == 2){
                do{
                    System.out.println(" \n Elija la opcion que desee ejecutar");
                    System.out.println("1. Depositar");
                    System.out.println("2. Retirar");
                    System.out.println("3. Consultar");
                    eleccion = scan.nextInt();

                    switch(eleccion){
                    case 1:
                        System.out.println("Ingrese el monto a depositar: ");
                        deposito = scan.nextFloat();
                        cuentaBancaria.setnoCuenta(noCuenta);
                        cuentaBancaria.setDeposito(deposito);
                        cuentaBancaria.depositar();
                        break;
                    case 2:
                        System.out.println("Ingrese el monto a retirar: ");
                        monto = scan.nextInt();
                        cuentaBancaria.setnoCuenta(noCuenta);
                        cuentaBancaria.setDeposito(monto);
                        cuentaBancaria.retirar();
                        break;
                    case 3:
                        cuentaBancaria.setnoCuenta(noCuenta);
                        System.out.println( "Cuenta: "+ noCuenta + " saldo total: " + cuentaBancaria.getSaldo());
                        break;
                    default:
                        break;
                } 
                }while(eleccion>0 && eleccion<4);
            }                                   
    }
    
}
