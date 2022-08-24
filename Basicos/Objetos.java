package Basicos;

public class Objetos {
    public static void main(String[] args) {
        //Instanciando de la clase coche un nuevo objeto
        Coche objetoCoche = new Coche();
        //Metodos de la clase Coche invocando en la instancia creada anteriormente
        System.out.println(objetoCoche.velocidad_actual);
        objetoCoche.acelerar();
        System.out.println(objetoCoche.velocidad_actual);

        System.out.println("Numero de puertas: "+objetoCoche.numero_puertas);
        System.out.println("Velocidad maxima: "+objetoCoche.velocidad_maxima);

        //Sobrecarga del constructor
        Coche coche2 = new Coche(7,110);
        System.out.println("Numero de puertas: "+coche2.numero_puertas);
        System.out.println("Velocidad maxima: "+coche2.velocidad_maxima);
    }
}

class Coche{
    int numero_puertas;
    int velocidad_maxima = 180;
    float velocidad_actual;

    //Constructor sin parametros
    public Coche(){
        System.out.println("Constructor de la clase Coche");
        numero_puertas = 5;
        velocidad_maxima = 120;
        
    }

    //Constructor con parametros
    /*
     public Coche(int puertas,int velocidad){
        System.out.println("Constructor con parametros");
        numero_puertas = puertas;
        velocidad_maxima = velocidad;
        
    }
     */
    

    //Constructor con parametros con variables igual nombradas
    public Coche(int numero_puertas,int velocidad_maxima){
        System.out.println("Constructor con parametros con variables del mismo nombre");
        this.numero_puertas = numero_puertas;
        this.velocidad_maxima = velocidad_maxima;
        
    }

    public void acelerar() {
        System.out.println("Acelerando");
        velocidad_actual += 15;
    }

    public void desacelerar(float velocidad_actual) {
        System.out.println("Desacelerando");
        velocidad_actual -= 20;
    }
}
