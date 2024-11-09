/*
Descuento en Compras: Calcular el precio final de un producto con un descuento 
del 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.

//** Autor: Pedro Vargas
 */
import java.util.Scanner;
public class Ejercicio4_Descuento_Compra {
    public static void main(String[] args) {
        double precio_producto, descuento;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precio_producto = tcl.nextDouble();
        descuento = (precio_producto-(precio_producto*0.10));
        if (precio_producto >= 100){
            System.out.println("El precio final con el descuento es = " + descuento);
            
        }else {
            System.out.println("El precio final del producto es = " + precio_producto);
        }
    }
    
}

/*
run:
Ingrese el precio del producto: 
200
El precio final con el descuento es = 180.0
BUILD SUCCESSFUL (total time: 9 seconds)
*/