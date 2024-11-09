/*
Calculo de impuestos: Desarrollar una solución que permita leer los datos de un automóvil 
(marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). 
Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 
15%, y si es de USA, 8%
 */
/**
Autor: Pedro Vargas
 */
import java.util.Scanner;
public class Ejercicio12_Calculo_Impuesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costo, impuesto = 0, monto_impuesto, precio_venta;
        String marca, origen;
        System.out.println("Ingrese la marca del aurtomovil: ");
        marca = tcl.nextLine();
        System.out.println("Ingrese el origen de su coche: ");
        origen = tcl.nextLine();
        System.out.println("Ingrese el costo del automovil: ");
        costo = tcl.nextDouble();
        switch (origen.toLowerCase()) {
            case "alemania":
                impuesto = 0.20;  // 20% de impuesto
                break;
            case "japon":
                impuesto = 0.30;  // 30% de impuesto
                break;
            case "italia":
                impuesto = 0.15;  // 15% de impuesto
                break;
            case "usa":
                impuesto = 0.08;  // 8% de impuesto
                break;
        }
        monto_impuesto = costo * impuesto;
        precio_venta = costo + monto_impuesto;
        System.out.println("Impuesto por pagar = " + monto_impuesto);
        System.out.println("Precio de ventas con impuesto + " + precio_venta);
        }
    }

