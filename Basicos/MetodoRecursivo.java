package Basicos;

public class MetodoRecursivo {
    public static void main(String[] args) {
        metodorecursivo(1);
    }

    static void metodorecursivo(int valor) {
        if (valor<10){
            System.out.println("valor: " + valor);
            metodorecursivo(valor+1);
        }
        else{
            System.out.println("Fin metodo recursivo");
        }
    }
}
