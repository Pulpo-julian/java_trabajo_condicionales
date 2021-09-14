
import java.util.Scanner;


public class Punto_05 {
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el precio del articulo: ");
        double precio = sc.nextDouble();
        
        System.out.println("ingrese la cantidad de articulos: ");
        int cantidad = sc.nextInt();
        
        
        double subT = precio * cantidad;
        
        double iva = (subT * 16) / 100;
        
        double bruto = subT + iva;
        
        
        
        if (bruto >= 130000) {
            double descuento = (bruto * 5) / 100;
            System.out.println("su precio es menor a 130.000");
            System.out.println("se le hara un descuento de: " + descuento);
            System.out.println("el el iva a pagar es: " + iva); 
            
            bruto = bruto - descuento;
            System.out.println("el precio bruto a pagar es: " + bruto);

        } else {
            System.out.println("el precio bruto a pagar es: " + bruto); 

            System.out.println("el el iva a pagar es: " + iva); 
        }              
        
    }
}
