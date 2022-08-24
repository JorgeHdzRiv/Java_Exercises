package Basicos;

import javax.swing.JOptionPane;
//Clase Area Figuras
public class Areafiguras{
    //Metodo area Circulo
    public static double areaCirculo (double radio){
        return Math.pow(radio, 2)*Math.PI;
    }

    //Metodo area triangulo
    public static double areaTriangulo (double base,double altura){
        return base*altura/2;
    }

    //Metodo area cuadrado
    public static double areaCuadrado (double lado){
        return lado*lado;
    }
    public static void main(String[] args){
        String texto= " ";
        double resultado = 0;
        String eleccion=JOptionPane.showInputDialog("Introduce una figura: circulo, triangulo o cuadrado");
        switch (eleccion){
            case "circulo": 
            texto=JOptionPane.showInputDialog("Introduce el radio");
            double radio=Double.parseDouble(texto);
            resultado =areaCirculo(radio);
            break;

            case "triangulo":
            texto=JOptionPane.showInputDialog("Introduce la base ");
            double base=Double.parseDouble(texto);
            texto=JOptionPane.showInputDialog("Introduce la altura ");
            double altura=Double.parseDouble(texto);
            resultado =areaTriangulo(base, altura);
            break;

            case "cuadrado":
            texto=JOptionPane.showInputDialog("Introduce el lado ");
            double lado=Double.parseDouble(texto);
            resultado=areaCuadrado(lado);
            break;
            
            default:
                System.out.println("No has introducido la figura correcta");
            
        }
        System.out.println("El area del "+eleccion+ " es:"+resultado);
    }
}