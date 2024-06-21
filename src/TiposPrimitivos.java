import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String args[]){

        /*
         tipos primitivos enteros: byte, short, int, long
         */

         byte numeroByte =10;
         System.out.println(numeroByte);

         short numeroShort = 10;
         System.out.println("Numero Short: "+ numeroShort);
         System.out.println("Valor minimo Short: "+ Short.MIN_VALUE);
         System.out.println("Valor maximo Short: "+ Short.MAX_VALUE);

         short numeroInt = 10;
         System.out.println("Numero Short: "+ numeroInt);
         System.out.println("Valor minimo Short: "+ Integer.MIN_VALUE);
         System.out.println("Valor maximo Short: "+ Integer.MAX_VALUE);

         short numeroLong = 10;
         System.out.println("Numero Short: "+ numeroLong);
         System.out.println("Valor minimo Short: "+ Long.MIN_VALUE);
         System.out.println("Valor maximo Short: "+ Long.MAX_VALUE);

        /*
         Tipos prmitivos de tipo flotante: float, double
         */

        float numeroFloat = (float)10.0;
        System.out.println(numeroFloat);    
        
        double numeroDouble = 10;
        System.out.println("Numero double: "+ numeroDouble);
        System.out.println("Valor maximo double: "+ Double.MAX_VALUE);
        System.out.println("Valor maximo double: "+ Double.MIN_VALUE);


        /* Inferencia de tipos */

        var numeroEntero = 10;
        System.out.println("NumeroEntero = "+numeroEntero);

        //Tipos primitivos tipo char

        char miCaracter = 'a';
        System.out.println("caracter = "+miCaracter);

        //0021 = !
        char varChar = '\u0021';  // se usa backslashu para indicar que se va a usar unicode
        System.out.println("Variable unicode: "+varChar);
        
        // char en codigo decimal
        char varCharDecimal = 33;
        System.out.println("varchardecimal: "+varCharDecimal);


        //Tipo boolean

        boolean miVariableBoolean = false;
        System.out.println("Variable booolean"+ miVariableBoolean);

        if(miVariableBoolean){
            System.out.println("la bandera es verdadera");

        }else{
            System.out.println("la bandera es fal");
        }


        //CONVERSIONES DE TIPOS DE DATO PRIMITIVOS

        //convertir de tipo String a tipo entero
        var edad = Integer.parseInt("20");
        System.out.println("Edad: "+ (edad+1));

        //convertir de tipo String a tipo double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("Pi: "+ valorPi);

        //pedir un valor
        Scanner consola = new Scanner(System.in);
        System.out.println("Digite su edad:");
        edad = Integer.parseInt(consola.nextLine());


        // Convertir de tipo int a String

        var edadText = String.valueOf(10);

        var caracter = "hola".charAt(0); // Devolver el valor en la posicion cero de la cadena
        System.out.println(caracter);

        System.out.println("Digite un cadena:");
        caracter = consola.nextLine().charAt(0); // Retornar el caracter en la posicion 0 de la cadena recuperada
        System.out.println("El caracter es: "+ caracter);

        









    }
}
