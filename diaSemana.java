
import java.util.Scanner;

public class diaSemana {

/**
 * Descripción: Indica el nombre del día de la semana según el numero ingresado por el usuario 
 * @param double numero del dia de la semana 
 */
    public static void diaSemana(int numeroDia) {
        if (numeroDia == 1) {
                System.out.println("El día es Domingo");
            } else if (numeroDia == 2) {
                System.out.println("El día es Lunes");
            } else if (numeroDia == 3) {
                System.out.println("El día es martes");
            } else if (numeroDia == 4) {
                System.out.println("El día es Miercoles");
            } else if (numeroDia == 5) {
                System.out.println("El día es Jueves");
            } else if (numeroDia == 6) {
                System.out.println("El día es Viernes");
            } else if (numeroDia == 7) {
                System.out.println("El día es Sabado");
            }
        }
    
    

        public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero del dia de la semana");
        int numeroDia = entrada.nextInt();

        diaSemana(numeroDia);
        }

}
