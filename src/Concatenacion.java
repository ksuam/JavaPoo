
public class Concatenacion {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;

        System.out.println("union = " + union);

        var num = 3;
        var num2 = 4;
        System.out.println(num + num2); //se suman los numeros
        System.out.println(usuario + num + num2); // ya no se suman los numeros, concatena el valor de las variables
        System.out.println(usuario + " = " + (num + num2)); // con los parentesis prioriza la suma
        System.out.println("Nueva linea: \n Segunda Linea: " + usuario);
        System.out.println("Tabulador \t" + usuario);
        System.out.println("Retroceso:\b" + usuario); //quita caracteres
        System.out.println("Comillas simples: \'" + usuario + "\'");
        System.out.println("Comillas Dobles: \"" + usuario + "\"");

    }
}
