/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroproductosinventario;

import java.util.Scanner;
/**
 *
 * @author hraym
 */
public class RegistroProductosInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int eleccion = 0;
        int codigo;
        String nombre;
        float precio;
        Scanner scan = new Scanner(System.in);
        Producto producto = new Producto(0);
        
        System.out.println("Ingrese el codigo: ");
        codigo = scan.nextInt();
        producto.setCodigo(codigo);
        
        if(producto.getCodigo()>0){
            System.out.println("Ingrese el nombre del producto: ");
            nombre = scan.next();
            producto.setNombre(nombre);
            System.out.println("Ingrese el precio del producto: ");
            precio = scan.nextFloat();
            producto.setPrecio(precio);
            
            System.out.println("Desea ");
            System.out.println("1. consultar precio");
            System.out.println("2. modificar precio");
            eleccion = scan.nextInt();
            if(eleccion == 1){
                System.out.println(producto.getPrecio());
            }else if(eleccion ==2){
                System.out.println("Ingrese el nuevo precio");
                precio = scan.nextFloat();
                producto.setPrecio(precio);
                System.out.println("\n El precio actual es: " + producto.getPrecio());
            }
        }        
    }
    
}
