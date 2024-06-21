import java.util.Scanner;

public class AreayPerimetro {
    public static void main(String aegs[]){
        int alto, ancho;

        Scanner entrada  = new Scanner(System.in);

        System.out.println("Proporciona el alto: ");
        alto = entrada.nextInt();

        System.out.println("Proporciona el ancho: ");
        ancho = entrada.nextInt();

        var area = alto*ancho;
        var perimetro = (alto+ancho) * 2;

        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);

    }

}
