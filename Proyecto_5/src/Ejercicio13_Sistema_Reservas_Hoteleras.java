/**
 *Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace un descuento del 10% si 
 * el cliente se hospeda más de 5 días, 
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
 * Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación 
 * y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Ejercicio13_Sistema_Reservas_Hoteleras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int dias;
        double precioDiario, descuento, subtotal, total;
        
        System.out.print("Ingrese el numero de dias de estadia: ");
        dias = input.nextInt();
        
        System.out.print("Ingrese el precio diario de la habitacion: ");
        precioDiario = input.nextDouble();

        subtotal = dias * precioDiario;
        descuento = 0;

        if (dias > 15) {
            descuento = subtotal * 0.20; 
        } else if (dias > 10) {
            descuento = subtotal * 0.15; 
        } else if (dias > 5) {
            descuento = subtotal * 0.10; 
        }
        total = subtotal - descuento;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
/*
 * run:
 * Ingrese el numero de dias de estadia: 16
 * Ingrese el precio diario de la habitacion: 11
 * Subtotal: $176.0
 * Descuento: $35.2
 * Total a pagar: $140.8
 */
