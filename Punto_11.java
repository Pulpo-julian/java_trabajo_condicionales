
import java.util.Scanner;


public class Punto_11 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su sexo:");
        System.out.println("1 es masculino, 2 es femenino");
        int sexo = sc.nextInt();
        System.out.println("ingrese su edad");
        int edad = sc.nextInt();
        
        if (sexo == 1) {
            
            int pulso = (210 - edad) / 10;
            System.out.println("las pulsaciones son: " + pulso);
            
        } else if (sexo == 2) {
            
            int pulso = (220 -  edad) / 10;
            System.out.println("las pulsaciones son: " + pulso);
            
        }
    }
}
