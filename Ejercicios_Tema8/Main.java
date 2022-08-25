package Ejercicios_Tema8;

/* 
    *Instrucciones
 
Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, 
por último muéstralas por consola
 */
public class Main {
    public static void main(String[] args) {
        Persona jorge=new Persona();
        jorge.setEdad(26);
        jorge.setNombre("Jorge");
        jorge.setTelefono("1234567890");

        String nombre = jorge.getNombre();
        int edad = jorge.getEdad();
        String telefono = jorge.getTelefono();

        System.out.println("El nombre de la persona es: "+nombre);
        System.out.println("La edad de "+nombre+" es: "+edad);
        System.out.println("El telefono de "+nombre+" es: "+telefono);
        
    }
}

class Persona{
    //Variables privadas
    private int edad;
    private String nombre;
    private String telefono;

    //Getters and Seeters de las variables
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){return this.edad;}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){return this.nombre;}

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){return this.telefono;}

}
