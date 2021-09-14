
import java.util.Scanner;


public class Punto_12 {
       public static void main(String[]args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("ingrese el monto de fianza: ");
           int monto = sc.nextInt();
           
           if(monto <= 50_000){
               
               int cuota = (monto * 3) / 100;
               int meses = monto / cuota;
               System.out.println("el valor de la cuota es: " + cuota);
               System.out.println("la cantidad de meses es: " + meses);
               
           } else if (monto > 50_000 ) {
               
               int cuota = (monto * 2 ) / 100;
               int meses = monto / cuota;
               System.out.println("el valor de la cuota es: " + cuota);
               System.out.println("la cantidad de meses es: " + meses);
               
           }
           
       }
 
}
