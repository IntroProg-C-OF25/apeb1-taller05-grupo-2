/**
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Ejercici9_Orden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, num3, menor, medio, mayor;
        
        System.out.print("Ingrese el primer numero: ");
        num1= input.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        num2= input.nextInt();
        
        System.out.print("Ingrese el tercer numero: ");
        num3= input.nextInt();
        
        if (num1 <= num2) {
            if (num1 <= num3) {
                menor = num1;
                if (num2 <= num3) {
                    medio = num2;
                    mayor = num3;
                } else {
                    medio = num3;
                    mayor = num2;
                }
            } else {
                menor = num3;
                medio = num1;
                mayor = num2;
            }
        } else {
            if (num2 <= num3) {
                menor = num2;
                if (num1 <= num3) {
                    medio = num1;
                    mayor = num3;
                } else {
                    medio = num3;
                    mayor = num1;
                }
            } else {
                menor = num3;
                medio = num2;
                mayor = num1;
            }
        }
        System.out.println("Numeros en orden ascendente: " + menor + ", " + medio + ", " + mayor);
    }
}
/**
 * run: 
 * Ingrese el primer numero: 9
 * Ingrese el segundo numero: 22
 * Ingrese el tercer numero: 12
 * Numeros en orden ascendente: 9, 12, 22
 * 
 * /
