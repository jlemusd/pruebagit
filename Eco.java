import java.util.Scanner;

public class Eco {
    public static void main (String [] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una mensaje: ");
        String mensaje = entrada.nextLine();
        System.out.println("El mensaje ingresado es: " + mensaje);
    }
}