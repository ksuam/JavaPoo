import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Proporcione el numero 1: ");
        int num1 = entrada.nextInt();

        System.out.println("Proporcione el numero 2:");
        int num2 = entrada.nextInt();

        int numeroMayor = ( num1 > num2) ?num1 : num2;

        System.out.println("El numero mayor es: "+ numeroMayor);

    }
}
