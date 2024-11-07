/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Ejercicio3_Mayor_numero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero_1,numero_2, numero_3 = 0, mayor;
        
        System.out.print("Ingrese el primer numero: ");
        numero_1= input.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        numero_2= input.nextInt();
        
        System.out.print("Ingrese el tercer numero: ");
        numero_2= input.nextInt();
        
        if (numero_1 > numero_2) {
            if (numero_1 > numero_3) {
                mayor = numero_1;
            } else {
                mayor = numero_3;
            }
        } else {
            if (numero_2 > numero_3) {
                mayor = numero_2;
            } else {
                mayor = numero_3;
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
/**
 * run:
 * Ingrese el primer numero: 5
 * Ingrese el segundo numero: 7
 * Ingrese el tercer numero: 9
 * El n�mero mayor es: 9
 */