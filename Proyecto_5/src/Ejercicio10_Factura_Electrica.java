/*
Facturación eléctrica: Desarrollar una solución que permita calcular 
y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar 
el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% por pertenecer a la tercera edad.
/**
Autor: Pedro Vargas
 */
import java.util.Scanner;

public class Ejercicio10_Factura_Electrica {

    public static void main(String[] args) {
        double costo_kvhora, kilovatio_consum, edad, valor, valor_mayoredad;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el costo del kilovatio por hora: ");
        costo_kvhora = tcl.nextDouble();
        System.out.println("Ingrese la cantidad de kilovatios consumidos al mes: ");
        kilovatio_consum = tcl.nextDouble();
        valor = kilovatio_consum * costo_kvhora;
        valor_mayoredad = valor - (valor * 0.10);
        System.out.println("Inngrese su edad: ");
        edad = tcl.nextDouble();
        if (edad >= 65) {
            System.out.println("El valor de la planilla de luz, por ser mayor de edad es = " + valor_mayoredad);
        } else {
            System.out.println("El valor de la planilla de luz es = " + valor);
        }
    }
}
/*
run:
Ingrese el costo del kilovatio por hora: 
2.5
Ingrese la cantidad de kilovatios consumidos al mes: 
1500
Inngrese su edad: 
66
El valor de la planilla de luz, por ser mayor de edad es = 3375.0
BUILD SUCCESSFUL (total time: 23 seconds)
*/