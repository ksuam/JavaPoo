import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {
    public static void main (String args[]){
        int miVariableEntera = 10;
        
        System.out.println(miVariableEntera);
        
        miVariableEntera = 5;
        //Se el asigna otro valor a la variable
        System.out.println(miVariableEntera);
        
        String variableMiCadena = "Saludos";
        System.out.println(variableMiCadena);
        
        variableMiCadena = "Adiós";
        System.out.println(variableMiCadena);
        
        //var va a hacer ingerencia de tipos de datos en JAVA
        
        var miVariableInferida = 23;
        System.out.println(miVariableInferida);
        
        var miVariableString = "Hola xde";
        System.out.println("miVariableString = " + miVariableString);
        
        
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
