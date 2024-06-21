public class Operadores{
    
    public static void main (String args[]){

        //OPERADORES ARITMETICOS

        int a = 3, b=2;

        var resultado = a + b;
        System.out.println("La suma es: "+resultado);

        resultado = a - b;
        System.out.println("La resta es: "+resultado);

        resultado = a*b;
        System.out.println("La multiplicacione es: "+resultado);

        resultado = a/b;
        System.out.println("La division es: "+resultado);

        resultado = a%b;
        System.out.println("El residuo de la division es: "+resultado);


        if(a%2 ==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

        //OPERADORES DE ASIFNACION

        // = asignacion
        //== comparar si dos valores son iguales
        // += composicion + - * / %


        int d =3, f=2;
        int c = d+5-f; // asignacion de derecha se le asigna a izquierda c = 6
        System.out.println("C = "+c);

        d+=1;
        System.out.println("D ="+d);

        d+=2; // a = a + 2
        System.out.println("D ="+d);

        //OPERADORES UNARIOS

        var e =3;
        var g = -e;

        var h  = true;
        var x = !h; //diferente de 

        System.out.println("Valor de H "+h);
        System.out.println("Valor de x: "+x);

        //PRE-INCREMENTO (Simbolo antes de la variable)

        var j =3;
        var t = ++j; 
        System.out.println("Varaible j:"+j);
        System.out.println("variable t: "+t);


        //POST-INCREMENTO  (Simbolo depsues de la variable)

        var m =5;
        var k = m++;
        System.out.println("Variable i: "+m);
        System.out.println("Variable g: "+k);


        // == 
        var cadena2 = "Hola";
        var cadena3 = "Hola";
        var he = cadena2.equals(cadena3); // se compara el contenido de ambas cadenas
        System.out.println(he);




        //OPERADORES RELACIONALES (> < <= >=)


        var y = a>b;
        System.out.println(y);


        





    }
}
