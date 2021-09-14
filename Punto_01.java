
import java.util.Scanner;


public class Punto_01 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el año: ");
        double anio = sc.nextDouble();
        
        
        if ( anio % 400 == 0 ){
            System.out.println("el año es biciesto");
        } else if ( anio % 100 == 0) {
            System.out.println("el año no es biciesto");
        } else if ( anio % 4 == 0) {
            System.out.println("el año es biciesto");
        } else {
            System.out.println("no es biciesto");
        }
    }
}
