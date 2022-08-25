package Intermedios;

public class Herencia {
    public static void main(String[] args) {
        //Instancia de la clase coche
        Coche coche = new Coche();
        //Tendra las variables de la casa padre
        coche.matricula="GTSCS123";
        coche.velocidadMaxima=15;

        Moto moto = new Moto();
        moto.matricula="AAA";
        System.out.println(moto.compruebaMatricula(moto.matricula));
        
    }
}

//Clase padre
class Vehiculo{
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula) {
        if (matricula == "AAA"){
            return true;
        }

        return false;
    }
}

//Clase hija que hereda del padre
class Coche extends Vehiculo{

}

//Clase que no se puede heredar posteriormente
final class Moto extends Coche{}