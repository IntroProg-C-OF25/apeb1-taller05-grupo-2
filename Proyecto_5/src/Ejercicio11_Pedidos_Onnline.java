/**
 * Pedidos online: Desarrollar una solución que imprima el costo de un pedido de 
 * un artículo del cual se tiene la descripción, la cantidad que se requiere y el 
 * precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Ejercicio11_Pedidos_Onnline {
    public static void main(String[] args) {       
        Scanner input = new Scanner(System.in);   
        
        String descripcion;
        int cantidad;
        double precioUnitario, descuento, subtotal, total;
        
        System.out.print("Ingrese la descripcion del articulo: ");
        descripcion = input.nextLine();
        
        System.out.print("Ingrese la cantidad requerida: ");
        cantidad = input.nextInt();
        
        System.out.print("Ingrese el precio unitario: ");
        precioUnitario = input.nextDouble();

        subtotal = cantidad * precioUnitario;
        descuento = 0;

        if (cantidad > 50) {
            descuento = subtotal * 0.15; 
        }

        total = subtotal - descuento;

        System.out.println("Descripcion del articulo: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
/*
 * run:
 * Ingrese la descripcion del articulo: laptos
 *Ingrese la cantidad requerida: 50
 *Ingrese el precio unitario: 689
 *Descripcion del articulo: laptos
 *Cantidad: 50
 *Precio unitario: $689.0
 *Subtotal: $34450.0
 *Descuento: $0.0
 *Total a pagar: $34450.0
*/