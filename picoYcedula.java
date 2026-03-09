
import java.util.Scanner;


public class picoYcedula {
/**
 * Descripción: Indica si una persona puede salir o no el dia de hoy, segun su numero de cedula y el dia ingresado por el usuario
 * @param int cedula, int dia 
 */
    public static void picoYcedula(int cedula, int dia) {
        if (cedula % 2 == 0 && dia % 2 == 0) {
            System.out.println("Puede salir el dia de hoy, su pico y cedula es: 0,2,4,6,8,");
        } else if (cedula % 2 != 0 && dia % 2 != 0) {
            System.out.println("Puede salir el dia de hoy, su pico y cedula es: 1,3,5,7,9,");
        } else {
            System.out.println("No puede salir el dia de hoy, su pico y cedula es: 0,2,4,6,8,");
        }
    }
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su numero de cedula: ");
        int cedula = entrada.nextInt();
        System.out.println("Ingrese el dia: ");
        int dia = entrada.nextInt();

    picoYcedula(cedula, dia);
        
    }
}


            
