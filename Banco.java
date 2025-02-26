/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncuentasbancarias;

/**
 *
 * @author hraym
 */
public class Banco {
    
    private CuentaBancaria[] listaCuentas = new CuentaBancaria[5000];
    private int indice;
    
    public Banco(){
        this.indice = 0;
    }
    
    public void registrar(CuentaBancaria noCuenta){
        listaCuentas[indice] = noCuenta;
        System.out.println(listaCuentas[indice]);
        indice++;
    }
    
}
