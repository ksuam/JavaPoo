public class SentenciasDeControl {
    public static void main(String args[]){
        //SENTENCIA IF - ELSE

        var condicion = true;

        if(condicion){
            System.out.println("Condicion verdadera");

        }else{
            System.out.println("Condicion falsa");
        }
    
        var numero = 3;
        var numeroTexto = "Numero desconocido";

        if (numero == 1){
            numeroTexto = "Numero 1";
        }else if(numero == 2){
            numeroTexto = "Numero 2";
        }else if(numero == 3){
            numeroTexto = "Numero 3";
        }else if(numero == 4){
            numeroTexto = "Numero 4";
        }else{
            numeroTexto = "Numero no encontrado"; 
        }

        System.out.println(numeroTexto);
    
    }
}
