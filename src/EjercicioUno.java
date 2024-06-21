import java.util.Scanner;

public class EjercicioUno {
    
    public static void main(String args[]){
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciona el titulo:");
        String titulo = consola.nextLine();
        
        System.out.println("Proporciona el autor:");
        String autor = consola.nextLine();
        
        var cadena = titulo + " fue escrito por " + autor;
        
        System.out.println(cadena);
        
    }
    
}
