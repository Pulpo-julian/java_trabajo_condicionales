
import java.util.Scanner;


public class Punto_2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int numA = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        int numB = sc.nextInt();
        
        if ( numA % numB == 0 ) {
            System.out.println(numB + " si es divisor de " + numA);
        } else {
            System.out.println(numB + " no es divisor de " + numA);
        }
        
        
    }
}
