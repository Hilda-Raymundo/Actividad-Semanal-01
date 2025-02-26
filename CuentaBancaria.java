/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncuentasbancarias;

/**
 *
 * @author hraym
 */
public class CuentaBancaria {
    
    private int noCuenta;
    private float deposito;
    private float saldo;
    private int[] cuentasBanco = new int[5000];
    private int indice = 0;
    
    public CuentaBancaria(int noCuenta){
        this.noCuenta = noCuenta;
    }
    
    public void setnoCuenta(int noCuenta){
        if(noCuenta>0){
            this.noCuenta =  noCuenta;
        }else{
            this.noCuenta = 0;
        }
    }
    public void setDeposito(float deposito){
        if(deposito>0){
            this.saldo = deposito + this.saldo;
        }else{
            this.saldo = 0.0f;
        }
    }
    
    public void crearCuenta(){
        if(this.saldo > 0 && this.noCuenta>0){
            System.out.println("Cuenta: " + this.noCuenta + " salddo inicial: " + saldo);
            cuentasBanco[indice] = this.noCuenta;
            System.out.println("cuentas: " + cuentasBanco[indice]);
            indice++;
        }else{
            System.err.println("ERROR - NO SE CREO LA CUENTA - LOS DATOS INGRESADOS SON INCORRECTOS");
        }
    }
    
    public void depositar(){
        if(this.saldo > 0){
            for(int i=0; i<=indice;i++){
                if(this.noCuenta== cuentasBanco[i]){
                    System.out.println("Cuenta: " + this.noCuenta + " salddo total: " + saldo);
                }
            }
        }else{
            System.err.println("ERROR - NO SE DEPOSITO - LOS DATOS INGRESADOS SON INCORRECTOS");
        }
    }
    
    public void retirar(){
        if(this.saldo > 0){
            System.out.println("Cuenta: " + this.noCuenta + " salddo inicial: " + saldo);
        }else{
            System.err.println("ERROR - NO SE PUEDE RETIRAR - LOS DATOS INGRESADOS SON INCORRECTOS");
        }
    }
    
    public void consultar(){
        if(this.noCuenta>0){
            System.out.println("Cuenta: " + this.noCuenta + " salddo inicial: " + saldo);
        }else{
            System.err.println("ERROR - LOS DATOS INGRESADOS SON INCORRECTOS");
        }
    }
    
}
