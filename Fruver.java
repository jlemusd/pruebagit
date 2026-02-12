import java.util.Scanner;

public class Fruver {
    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);
        int precio_manzana = 1000;
        int precio_banano = 800;

        System.out.println("Ingrese la cantidad de manzanas: ");
        int cantidad_manzanas = entrada.nextInt();

        System.out.println("Ingrese la cantidad de bananos: ");
        int cantidad_banano = entrada.nextInt();

        int subtotal_manzanas = precio_manzana * cantidad_manzanas;
        int subtotal_banano = precio_banano * cantidad_banano;
        int total_sin_descuento = subtotal_manzanas + subtotal_banano;
        double descuento = total_sin_descuento * 0.10;
        double total_con_descuento = total_sin_descuento - descuento;
        System.out.println("El subtotal de las manzanas es: " + subtotal_manzanas);
        System.out.println("El subtotal de los bananos es: " + subtotal_banano);
        System.out.println("El total sin descuento es: " + total_sin_descuento);
        System.out.println("El descuento es: " + descuento);
        System.out.println("El total con descuento es: " + total_con_descuento);
    }
}


        