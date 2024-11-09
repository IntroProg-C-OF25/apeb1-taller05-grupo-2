/*
Categoría de Edad: Clasificar a una persona en una categoría de edad 
(niño, adolescente, adulto) en función de su edad.
//**Autor: Pedro Vargas
 */
import java.util.Scanner;
public class Ejercicio6_Categoria_Edad {
    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad >= 0 && edad <= 12) {
            System.out.println("Esta en la categoria de niño");
        } else if (edad >= 13 && edad <= 18) {
            System.out.println("Esta en la categoria de adolescente");
        } else if (edad >= 19 && edad <= 150) {
            System.out.println("Esta en la categoria de adulto.");
        } else {
            System.out.println("Edad no válida.");
        }
    }
}
/*
run:
Ingrese su edad: 
20
Esta en la categoria de adulto.
BUILD SUCCESSFUL (total time: 9 seconds)
*/