
/**
 *Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
 * @author El grupo
 */
import java.util.Scanner;
public class Ejercicio1_Edad_Votar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad =input.nextInt();
        
        if (edad>=18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }
    }
}
/**
 * run:
 * Ingrese su edad: 4
 * No puedes votar
 */