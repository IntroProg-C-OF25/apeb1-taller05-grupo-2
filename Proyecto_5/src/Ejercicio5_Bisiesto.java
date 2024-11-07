
/**
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 * @author User
 */
import java.util.Scanner;
public class Ejercicio5_Bisiesto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int año;
        
        System.out.print("Ingrese un año: ");
        año = input.nextInt();
        
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
/**
 * run:
 * Ingrese un a�o: 1994
 * El a�o no es bisiesto
 * run:
 * Ingrese un a�o: 2024
 * El a�o es bisiesto
 */
