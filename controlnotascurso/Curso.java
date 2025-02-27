/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlnotascurso;

/**
 *
 * @author hraym
 */
public class Curso {
    
    private Estudiante[] listadoEstudiantes = new Estudiante[10];
    private float[] listadoNotas = new float[10];
    private int indice;
    private float promedio;
    private float cantidadNotas;
    
    public Curso(){
        indice = 0;
        promedio = 0.0f;
        cantidadNotas = 0;
    }
    
    public void promedioCurso(){
        for(int i = 0 ; i<listadoNotas.length ; i++){
            if(listadoNotas[i] > 0){
                cantidadNotas = cantidadNotas + listadoNotas[i];
                promedio = cantidadNotas /(i+1);
            }else{
                break;
            }
        }
        System.out.println("\n El promedio del curso es: " + (promedio));
    }
    
    public void estudiantesAprobados(){
        for(int i = 0; i< listadoEstudiantes.length ; i++){
            if(listadoEstudiantes[i] != null){
                System.out.println(listadoEstudiantes[i]);
                if(listadoNotas[i]>=61){
                    System.out.println("-- ESTUDIANTE APROBADO");
                }else{
                    System.out.println("-- ESTUDIANTE DESAPROBADO");
                }
            }
        }
    }
    
    public void asignar(Estudiante estudiante){
        listadoEstudiantes[indice] = estudiante;
        System.out.println(listadoEstudiantes[indice]);
        listadoNotas[indice] = estudiante.getNotaFinal();
        indice++;
    }
    
}
