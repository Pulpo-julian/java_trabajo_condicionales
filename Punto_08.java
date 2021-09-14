
import java.util.Scanner;


public class Punto_08 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de horas trabajadas: ");
        int horas = sc.nextInt();
        
        if (horas <= 40) {
            
            int basico = horas * 3000;
            System.out.println("tu quincena es de: " + basico);
            
        } else if (horas > 40){
            
            int basico = 40 * 3000;
            int extras = horas - 40;
            System.out.println("tu cantidad de horas extras son: " + extras);
            int valorExt = extras * 4000;
            System.out.println("y valen: " + valorExt);
            int total = basico + valorExt;
            System.out.println("tu quincena es de: " + total);
            
        }
    }
}
