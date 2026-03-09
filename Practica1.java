import java.util.Scanner;
public class Practica1{
    public static void main(String []args0){
    Scanner entrada = new Scanner(System.in);
    do { 
        System.out.println("Ingrese una calificacion de 0 a 5: ");
        double calificacion = entrada.nextDouble();
        System.out.println("Su calificacion es correcta");

        
    } while (entrada.nextDouble() <= 5);
    



    }
}






    
