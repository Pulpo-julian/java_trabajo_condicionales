
import java.util.Scanner;


public class Punto_7 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor de su compra: ");
        int valorCom = sc.nextInt();
        
        if (valorCom > 100_000) {
            int descuento = (valorCom * 20) / 100;
            valorCom = valorCom - descuento;
            System.out.println("el precio a pagar con descuento es: " + valorCom);
        } else {
            System.out.println("el precio a pagar es: " + valorCom);
        }
    }
}
