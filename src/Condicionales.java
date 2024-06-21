public class Condicionales {
    public static void main(String args[]) {

        var a = 15;

        var valorMinimo = 0;
        var valorMaximo = 15;
        var resultado = a >= 0 && a <= 10;

        if (resultado)
            System.out.println("El resultado es:" + resultado);
        else
            System.out.println("xde");

        var vacaciones = true;
        var diaDescanso = false;
        if (vacaciones || diaDescanso) { // alguna de las dos debe ser verdadero
            System.out.println("Padre puede asistir");

        } else {
            System.out.println("A la efe");
        }

        // OPERADOR TERNARIO

        var result = (3 > 2) ? "verdadero" : "Falso";
        System.out.println("Resultado ternario: "+result);

        var numero = 8;
        result = (numero % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println("El numero es: "+result);
        

    }
}
