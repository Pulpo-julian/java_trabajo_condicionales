
import java.util.Scanner;

public class Punto_10 {
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de llantas que va a comprar: ");
        int cant = sc.nextInt();
        
        if (cant < 5) {
            int precio = 80_000;
            System.out.println("el precio de cada llanta es de: " + precio);
            int total = cant * precio;
            System.out.println("el total de las llantas es de: " + total);
        } else if ( cant >=5 ) {
            int precio = 70_000;
            System.out.println("el precio de cada llanta es de: " + precio);
            int total = cant * precio;
            System.out.println("el total de las llantas es de: " + total);
        }        
    }
    
}
