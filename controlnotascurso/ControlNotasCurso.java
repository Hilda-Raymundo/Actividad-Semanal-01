/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlnotascurso;

/**
 *
 * @author hraym
 */
public class ControlNotasCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante1 = new Estudiante();
        Curso curso = new Curso();
        estudiante1.setNombre("Hilda");
        estudiante1.setCarnet("4545-45");
        estudiante1.setNotaFinal(100);
                
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Aileen");
        estudiante2.setCarnet("20201-10");
        estudiante2.setNotaFinal(64);
        
        estudiante1.asignar(curso);
        estudiante2.asignar(curso);
        
        curso.promedioCurso();
        System.out.println("\n LISTADO DE ESTUDIANTES Y NOTAS FINALES");
        curso.estudiantesAprobados();
    }
    
}
