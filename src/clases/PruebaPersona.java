/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author SUA
 */
public class PruebaPersona {
    public static void main(String[] args) {
        //Crear objetos
        
        Persona  persona1 = new Persona(); //variable de tipo persona  // Creacion de un objeto persona
      
       
        persona1.nombre = "Juan"; //Acceder a los atributos
        persona1.apellido = "Martinez";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona21 = " + persona1);
        
        persona2.desplegarInformacion();
        persona2.nombre="Karla";
        persona2.apellido="LARA";
        persona2.desplegarInformacion();

    }
}
