package Basicos;

public class While {
    public static void main(String[] args) {
        int contador = 10;

        while (contador > 0){
            System.out.println("Contador : "+contador);
            contador -= 1;
            // Otra forma
            // contador--;
        }

        System.out.println("Salimos del ciclo while");
    }
}
