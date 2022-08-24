package Intermedios;

public class Encapsulacion {
    public static void main(String[] args) {
        //Primer instancia de ejemplo
        Vehiculo vehiculo= new Vehiculo();
        vehiculo.tipo= "Sedan";
        System.out.println(vehiculo.tipo);
        //Acceder al color del vehiculo de la encapsulacion
        vehiculo.setColor("Rojo");
        System.out.println(vehiculo.getColor());
        //Ejemplo del metodo estado
        vehiculo.setApagado(true);
        vehiculo.estado(vehiculo.isApagado());
        
        System.out.println("\nNuevo objeto\n");
        //Segunda instancia
        Vehiculo moto= new Vehiculo();
        moto.tipo = "Scotter";
        System.out.println(moto.tipo);

        moto.setColor("Negra");
        System.out.println(moto.getColor());

        moto.setApagado(false);
        moto.estado(moto.isApagado());
    }
}

class Vehiculo{
    // Error provocado por la propiedad del private
    //private String tipo;

    public String tipo;

    //Encapsulacion consiste en poder acceder a los propiedades privadas
    // Por medio de sets and gets
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    //El get tiene que devolver el tipo de la variable en cuestion
    public String getColor(){
        //El this hace referencia a la propiedad de la clase
        return this.color;
    }

    //Encapsulacion con variables boolean
    private boolean apagado;

    public void setApagado(boolean apagado){
        this.apagado = apagado;
    }

    public boolean isApagado(){
        return this.apagado;
    }

    public void estado(boolean apagado){
        if (apagado == true){
            System.out.println("Vehiculo apagado");
        }
        else{System.out.println("Vehiculo encendido");}
    }

}
