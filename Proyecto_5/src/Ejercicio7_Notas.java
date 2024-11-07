

/**
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango 
 * (A para 90-100, B para 80-89, etc.).
 * @author User
 */
import java.util.Scanner;
public class Ejercicio7_Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nota;
        
        System.out.print("Igrese la nota del estudiante: ");
        nota = input.nextInt();
        
        if (nota>=90 && nota<=100){ 
            System.out.println("A");
        }else if(nota>=80 && nota<=89){ 
            System.out.println("B");
        }else if (nota>=70 && nota<=79){
            System.out.println("C");
        }else if (nota>=60 && nota<=69){
            System.out.println("D");
        }else{ 
            System.out.println("Estudiante reprobado");  
        }
    }
}
/**
 * run:
 * Igrese la nota del estudiante: 5
 * Estudiante reprobado
 * 
 * 
 * 
 * /
