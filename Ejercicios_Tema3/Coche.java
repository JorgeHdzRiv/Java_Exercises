package Ejercicios_Tema3;

/*
Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
 */

public class Coche {
    public static void main(String[] args) {
        ClaseCoche miCoche = new ClaseCoche();
        miCoche.AumentarPuertas();
        System.out.println("El numero de puertas actuales en el coche son: "+miCoche.puertas);
    }
    
}

class ClaseCoche{
    public int puertas = 0;

    public void AumentarPuertas() {
        this.puertas++;
        
    }
}
