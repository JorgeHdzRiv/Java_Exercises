package Basicos;

public class Arreglos{
    public static void main(String[] args){
    
        String arreglo[] = new String[5];
    
        for (int posicion = 0; posicion < arreglo.length; posicion++){
            //Asignamos el valor a la posicion del arreglo
            arreglo[posicion] ="Indice"+' '+posicion;
        }
    
        int posicion =0;

        while (posicion < arreglo.length){
            //Mientras posicion sea menor al tamano
            //del arreglo seguira repitiendo
            //las instrucciones 
            System.out.println(arreglo[posicion]);
            posicion=posicion+1;
        }
        
    }

}
