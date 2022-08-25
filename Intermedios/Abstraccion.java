package Intermedios;

public class Abstraccion {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setColor("Blanco");
        System.out.println(coche.getColor());
        
        Moto moto=new Moto();
        moto.setColor("Negra");
        System.out.println(moto.getColor());
    }
}

abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String color;

    public Vehiculo(){
        System.out.println("Contructor Vehiculo");
    }

    //Las funciones o metodos abstractos no tienen cuerpo
    abstract public void setColor(String color);
    
    abstract public String getColor();

    
}

//Se necesitan implementar los metodos abstractos en las clases hijas
class Coche extends Vehiculo{

    public void setColor(String color) {
        
        this.color=color;
        
    }

    public String getColor() {
        return "Color de carro: "+this.color;
    }

}

class Moto extends Vehiculo{

    public void setColor(String color) {
        this.color=color;  
    }

    public String getColor() {
        return "Color de moto: "+this.color;
    }
}

