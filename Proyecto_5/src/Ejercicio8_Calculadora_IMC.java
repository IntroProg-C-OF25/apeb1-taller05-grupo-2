/*
Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona 
y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
/**
Autor: Pedro Vargas
 */
import java.util.Scanner;
public class Ejercicio8_Calculadora_IMC {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su altura en metros: ");
        altura = tcl.nextDouble();
        System.out.println("Ingrese su peso en kg: ");
        peso = tcl.nextDouble();
        imc = peso/(altura*2);
        System.out.println("Su IMC es= "+ imc);
        if (imc < 18.5){
            System.out.println("Tiene Bajo Peso");
        } else if (imc >= 18.5 && imc <= 24.9 ){
            System.out.println("Tiene Peso Normal");
        } else if (imc >=25 && imc <=29.9){
            System.out.println("Tiene Sobrepeso");
        }else {
            System.out.println("Tiene Obesidad grave");
        }
    }
}
/*
run:
Ingrese su altura en metros: 
1.70
Ingrese su peso en kg: 
85
Su IMC es= 25.0
Tiene Sobrepeso
BUILD SUCCESSFUL (total time: 7 seconds)
*/