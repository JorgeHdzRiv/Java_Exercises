package Basicos;

public class For {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println("El numero actual es: "+i);
        }

        int valores[]={1,2,3,4,5};

        for (int j=0; j<valores.length; j++){
            System.out.println(valores[j]);
        }
    }
}
