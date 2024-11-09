/*
Día de la Semana: Mostrar el nombre del día de la semana en función 
del número ingresado (1 para lunes, 2 para martes, etc.). 
 */
//* Autor: Pedro Vargas
import java.util.Scanner;
public class Ejercicio2_DiaSemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num_dia;
        System.out.println("Ingrese un numero del dia de la semana: ");
        num_dia = tcl.nextInt();
        switch (num_dia) {
            case 1: System.out.println("Lunes");
            break;
            case 2: System.out.println("Martes");
            break;
            case 3: System.out.println("Miercoles");
            break;
            case 4: System.out.println("Jueves");
            break;
            case 5: System.out.println("Viernes");
            break;
            case 6: System.out.println("Sabado");
            break;
            case 7: System.out.println("Domingo");
            break;
        }
    }
}
/*
run:
Ingrese un numero del dia de la semana: 
5
Viernes
BUILD SUCCESSFUL (total time: 12 seconds)

*/
