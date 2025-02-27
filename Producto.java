/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroproductosinventario;

/**
 *
 * @author hraym
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private float precio;
    private int[] listadoProductos = new int[5000];
    private int indice;
    private boolean existe = false;

    public Producto(int codigo) {
        indice = 0;
    }
    
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        
        //codigo registrado en el vector para la verificacion de la creacion de codigos unicos
        listadoProductos[1] = 4545;
        //for para revisar todos los datos del vector y verificar si ya existe un codigo como el ingresado
        for(int i = 0; i<listadoProductos.length; i++){
            if(codigo == listadoProductos[i] && codigo>0){
                System.out.println("El codigo ya existe");
                this.codigo = 0;
                existe = true;
                continue;
            }
        }
        if(codigo>0 && existe==false){
            this.codigo = codigo;
            listadoProductos[indice] = this.codigo;
            indice++;
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if(precio>0){
            this.precio = precio;
        }else{
            System.out.println("El precio ingresado no es valido");
        }
        
    }
    
    
    
}
