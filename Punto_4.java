
import java.util.Scanner;


public class Punto_4 {
    public static void main(String[]args) {
               
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la primera nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("ingrese la segundo nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("ingrese la tercera nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("ingrese la cuarta nota: ");
        double nota4 = sc.nextDouble();
        System.out.println("ingrese la quinta nota: ");
        double nota5 = sc.nextDouble();
        
        int ganadores = 0;
        
        if (nota1 >= 3) {
            System.out.println("aprobaste");
            ganadores ++;
        } else {
            System.out.println("perdiste");
        }
        
        if (nota2 >= 3) {
            System.out.println("aprobaste");
            ganadores ++;
        } else {
            System.out.println("perdiste");
        }
        
        if (nota3 >= 3) {
            System.out.println("aprobaste");
            ganadores ++;
        } else {
            System.out.println("perdiste");
        }
        
        if (nota4 >= 3) {
            System.out.println("aprobaste");
            ganadores ++;
        } else {
            System.out.println("perdiste");
        }
        
        if (nota5 >= 3) {
            System.out.println("aprobaste");
            ganadores ++;
        } else {
            System.out.println("perdiste");
        }
        
        int perdedores = 5 - ganadores;
        
        System.out.println("los ganadores son " + ganadores);
        System.out.println("los perdedores son " + perdedores);
        
        
        
    }
}
