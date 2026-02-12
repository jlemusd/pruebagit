import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args) {
        
        Scanner entrada = new Scanner(System.in);
        int a = entrada .nextInt();
        int b = entrada .nextInt();
        double division = a / b;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + division);
        System.out.println("Módulo: " + (a % b));
    }
}