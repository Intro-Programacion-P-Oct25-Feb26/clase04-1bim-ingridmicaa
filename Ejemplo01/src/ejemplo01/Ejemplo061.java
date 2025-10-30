/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "Ingrid Micaela";
        String apellidoEstudiante = "Pardo Gualan";
        int edad = 17;
        String direccion = "Los Geranios";
        String universidad = "UTPL";
        String ciclo= "Primer ciclo";
        String asignatura = "Introducción a la programación";
        String paralelo= "A";
                
        
        
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        System.out.printf("Nombre:\n\t%s\n Apellido:\n\t%s\n Edad:\t%s\n Dirección:"
                + "\n\n\t%s\n----\n Univesidad:\t%s\n Ciclo:\t%s\n Asignatura:"
                + "\t%s\n Paralelo:\n\t%s\n", nombreEstudiante, apellidoEstudiante, 
                edad, direccion, universidad, ciclo, asignatura, paralelo);
        
        
    }
}
