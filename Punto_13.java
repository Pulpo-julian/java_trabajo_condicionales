
import java.util.Scanner;


public class Punto_13 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el promedio del año anterior: ");
        double promedio = sc.nextDouble();
        System.out.println("ingrese el valor de su matricula: ");
        int valorMat = sc.nextInt();
        
        
        if(promedio >= 4) {
            double desc = (valorMat * 30) / 100;
            System.out.println("se le hara un descuento de: " + desc);
            double total = valorMat - desc;
            System.out.println("el total a pagar es: " + total);
            System.out.println("No se le cobrara IVA");
        } else if (promedio < 4) {
            double iva = (valorMat * 10) / 100;
            double total = valorMat + iva;
            System.out.println("el total a pagar es: " + total);
        }
        
    }
}
