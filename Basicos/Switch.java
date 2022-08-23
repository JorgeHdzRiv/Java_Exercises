public class Switch {
    public static void main(String[] args) {
        var estacion = "invierno";

        switch(estacion){
            case "verano":
                System.out.println("Verano");
                break;
            case "invierno":
                System.out.println("Invierno");
                break;
            default:
                System.out.println(estacion);
                break;
        }
    }
}
