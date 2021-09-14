
import java.util.Scanner;


public class Punto_6 {
    
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de kilometros recorridos: ");
        int dist = sc.nextInt();

        int monFijo = 300000;

        if ( dist < 300) {
            System.out.println("el total a pagar es " + monFijo);
        } else {
            System.out.println("usted supero los 300 km");
            int distAdic = dist - 300;
            int montAdic = distAdic * 15000;
            System.out.println("debera pagar un exedente de: " + montAdic);
            int total = monFijo + montAdic;

            System.out.println("el total a pagar es " + total);
           
        }
       
    } 
}
