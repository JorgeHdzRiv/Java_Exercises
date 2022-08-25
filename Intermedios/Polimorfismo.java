package Intermedios;

public class Polimorfismo {
    public static void main(String[] args) {
        Hija hija=new Hija();
        hija.diHola();

        //Suma de numeros con enteros
        System.out.println(hija.suma(3, 5));
        //Suma de numeros double
        hija.suma(6.7, 8.9);

        /*
        System.out.println("Clase que tiene la funcion heredada");
        Hijo hijo=new Hijo();
        hijo.diHola(); 
        */
        
    }
}

class Padre{
    public void diHola(){
        System.out.println("Hola");
    }

    //Funciones polimorficas depende del valor del argumento se invocara la adecuada
    public int suma(int a,int b){
        System.out.println("Suma numeros enteros");
        return a+b;
    }

    public float suma(float a,float b){
        System.out.println("Suma numeros flotantes");
        return a+b*2;
    }

    public void suma(double a,double b){
        System.out.println("Suma numeros double");
        System.out.println("El resultado es: "+(a+b));
    }
}

class Hija extends Padre{
    //Aplicando el polimorfismo sobreescribiendo la funcion
    public void diHola(){
        System.out.println("Soy la clase hija");
    }
}

class Hijo extends Padre{
    
}
