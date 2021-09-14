
import java.util.Scanner;


public class Punto_14 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el precio de la casa: ");
        int valorCasa = sc.nextInt();
        System.out.println("digite el valor de sus ingresos: ");
        int ingresos = sc.nextInt();
        
        if (ingresos < 800000){
            
            int coInicial = (valorCasa * 15) / 100;
            System.out.println("la couta inicial es de: " + coInicial);
            int restante = valorCasa - coInicial;
            int meses = 10 * 12;
            int pagoMen = restante / meses;
            System.out.println("la mensualidad de la casa es de: " + pagoMen);
            
        } else if (ingresos >= 800000) {
            
            int coInicial = (valorCasa * 30) / 100;
            System.out.println("la couta inicial es de: " + coInicial);
            int restante = valorCasa - coInicial;
            int meses = 7 * 12;
            int pagoMen = restante / meses;
            System.out.println("la mensualidad de la casa es de: " + pagoMen);
            
        }
    }
}
