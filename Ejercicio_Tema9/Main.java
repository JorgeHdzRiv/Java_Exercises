package Ejercicio_Tema9;

/*
Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, 
el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
y con una variable salario que solo tenga la clase Trabajador.
 */
public class Main {
    public static void main(String[] args) {
        //Objeto de la clase cliente
        Cliente cliente=new Cliente();
        cliente.nombre="Jorge";
        cliente.edad=25;
        cliente.telefono="123234535";
        cliente.credito=true;

        System.out.println("El nombre del cliente es: "+cliente.nombre);
        System.out.println("La edad del cliente es: "+cliente.edad);
        System.out.println("El telefono del cliente es: "+cliente.telefono);
        cliente.tieneCredito(cliente.credito);

        //Objeto clase Trabajador
        System.out.println("\nObjeto de la clase Trabajador\n");
        Trabajador trabajador=new Trabajador();
        trabajador.nombre="Juan";
        trabajador.edad=30;
        trabajador.telefono="32434643624";
        trabajador.salario=456.23;

        System.out.println("El nombre del trabajador es: "+trabajador.nombre);
        System.out.println("La edad del trabajador es: "+trabajador.edad);
        System.out.println("El telefono del trabajador es: "+trabajador.telefono);
        System.out.println("El salario del trabajador es: "+trabajador.salario);

        
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    boolean credito;

    public void tieneCredito(boolean credito) {
        if (credito==true){
            System.out.println("El cliente "+nombre+":tiene credito");
        }
        else{
            System.out.println("El cliente "+nombre+":no tiene credito");
        }
        
    }
}

class Trabajador extends Persona{
    double salario;
}
