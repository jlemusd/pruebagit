import java.util.Scanner;
public class Repetitivas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        System.out.println("Ingrese un número entero: ");
        while (num < 0) {
            System.out.println("Número inválido. Ingrese un número entero positivo: ");
            
        }
        System.out.println("Número ingresado: " + num);

        for (int i = 1; i <=num; i++) {
            System.out.println(i);
        }

        do { 
            System.out.println("Ingrese un número entero o -1 para salir: ");
            int numero = entrada.nextInt();
            System.out.println(numero*numero);

        } while (entrada.nextInt() != -1);

        }
    }
