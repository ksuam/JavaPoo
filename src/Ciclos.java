public class Ciclos {
    
    public static void main(String args[]){
        //CICLO WHILE
        var contador = 0;

        while (contador < 3){
            System.out.println("Contador: "+contador);
            contador++;
        }

        //CICLO DO - WHILE

        do{
            System.out.println("Contador do: "+contador);
            contador++;

        }while(contador <3);

        //CICLO FOR

        for(int contado = 0; contado <3; contado ++ ){
            System.out.println("Contador for: "+contado);
        }


        
    }
}
