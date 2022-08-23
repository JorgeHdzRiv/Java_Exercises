package Ejericicios_Tema3;

/*
Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.
 */
public class sumaValores {
    public static void main(String[] args) {
        suma(5,6,8.4);
    }

    public static void suma(double a,double b, double c) {
        double resultado = a+b+c;
        System.out.println("El resultado de la suma es: "+resultado);
        
    }
}
