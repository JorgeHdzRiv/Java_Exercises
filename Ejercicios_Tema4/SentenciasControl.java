package Ejercicios_Tema4;

/*
 En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea 
inferior a 3, el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While,
pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será 
que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para 
las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje 
por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
public class SentenciasControl {
    public static void main(String[] args) {
        //Pruebas funcion positivo o negativo
        pos_neg(4.5);
        pos_neg(-8.5);
        pos_neg(0);
        System.out.println("\n");
        //Pruebas funcion ciclo While
        CWhile(4);
        CWhile(1);
        CWhile(3);
        System.out.println("\n");
        //Pruebas funcion ciclo DoWhile
        CDoWhile(1);
        CDoWhile(4);
        CDoWhile(3);
        System.out.println("\n");
        //Prueba ciclo For
        CFor();
        System.out.println("\n");
        //Pruebas Switch
        Switch("invierno");
        Switch("verano");
        Switch("primaverano");
    }

    public static void pos_neg(double numeroif) {
        if (numeroif > 0){
            System.out.println("El numero: "+ numeroif + " es positivo");
        }
        else if(numeroif<0){
            System.out.println("El numero: "+ numeroif + " es negativo");
        }
        else{
            System.out.println("El numero: "+ numeroif + " es cero");
        }
    }

    public static void CWhile(int numeroWhile) {
        while (numeroWhile<3){
            System.out.println("El numero actual es: "+numeroWhile);
            numeroWhile++;
        }

        System.out.println("El numero: "+numeroWhile+" ,no cumple con la condicion");
    }

    private static void CDoWhile(int numeroDo) {
        do {
            System.out.println("El numero actual es: "+numeroDo);
            numeroDo++;
        } while (numeroDo <3);
    }

    private static void CFor() {
        for (int numeroFor = 0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
    }

    private static void Switch(String estacion) {
        switch (estacion){
            case "invierno":
                System.out.println("Invierno");
                break;
            case "verano":
                System.out.println("Verano");
                break;
            case "primavera":
                System.out.println("Primavera");
                break;
            case "otoño":
                System.out.println("Otoño");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
        
    }
}
