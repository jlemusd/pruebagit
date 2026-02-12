
import java.util.Scanner;


public class IMC {

    /**
     * Descripción: Calcula el IMC de una persona dividiendo el peso entre la altura al cuadrado.
     * @param double peso en kilogramos
     * @param double altura en metros
     */

    public static void calcularIMC(double peso, double altura) {
        double IMC = peso / (altura * altura);
        System.out.println("Su indice de masa corporal es: " + IMC);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg:");
        double peso = entrada.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = entrada.nextDouble();

        calcularIMC(peso, altura);

    }
}
