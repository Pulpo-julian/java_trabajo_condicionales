
import java.util.Scanner;


public class Punto_9 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor de las 3 piezas de la maquina: ");
        int valor1 = sc.nextInt();
        
        if (valor1 > 500_000){
            
            int inversion = (valor1 * 55) / 100;
            System.out.println("la cantidad de inversion es de: "+inversion);
            int prestamo = (valor1 * 30) / 100;
            System.out.println("el valor del prestamo es de: "+prestamo);
            int creditoFab = valor1 - inversion - prestamo;
            System.out.println("el credito del fabricante es de: "+creditoFab);
            int total = valor1 + inversion + creditoFab;
            
            System.out.println("el total que pagara la empresa es de: " + total);
            
        } if (valor1 <= 500_000) {
            
            int inversion = (valor1 * 70) / 100;
            System.out.println("la cantidad de inversion es de: "+inversion);
            int creditoFab = valor1 - inversion;
            int total = valor1 + creditoFab;
            System.out.println("el credito del fabricante es de: "+creditoFab);
            System.out.println("el total que pagara la empresa es de: " + total);
            
        }
    }
}
