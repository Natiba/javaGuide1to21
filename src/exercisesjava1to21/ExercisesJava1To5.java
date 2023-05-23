package exercisesjava1to21;

import java.util.Scanner;

/**
 * @author nataliaba
 */
public class ExercisesJava1To5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declaro un metodo Scanner para todos los ejercicios
        Scanner sc = new Scanner(System.in);
        
        // 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        // dos. El programa deberá después mostrar el resultado de la suma
        
        System.out.println("Ingrese el primer numero, por favor");
        int number1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero, por favor");
        int number2 = sc.nextInt();
        
        int sum = number1 + number2;
        
        System.out.println("La suma de los numeros " + number1 + "+" + number2 + " da: " + sum);
        
        sc.nextLine(); // para 'limpiar' y que lea el proximo String Scanner
        
        System.out.println("-----------------------------------------------------------------"); 
        
        // 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        // pantalla.
        
        System.out.println("Ingresa tu nombre, por favor");
        String nombre = sc.nextLine();
        
        
        System.out.println("Hola " + nombre + "!");
       
        
        System.out.println("-----------------------------------------------------------------"); 
        
        
        // 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        // en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

        System.out.println("Ingresar una frase, por favor");
        
        String phrase = sc.nextLine();
        
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
        
        System.out.println("-----------------------------------------------------------------"); 
        
       // 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
       // Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
       
        System.out.println("Ingrese los grados centígrados, por favor");
        int degrees = sc.nextInt();
        sc.nextLine();
        
        int farenheit = 32 + (9 * degrees /5);
        
        System.out.println(degrees + " grados centigrados son en Farenheit " + farenheit + " grados");
        
        System.out.println("-----------------------------------------------------------------"); 
        
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        // doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

        // La raíz cuadrada de 16
        // System.out.println(Math.sqrt(16));
        
        System.out.println("Ingresar un numero entero, por favor");
        int intNumber = sc.nextInt();
        
        double doubleNumber = intNumber * 2;
        double triNumber = intNumber * 3;
        
        
        System.out.println("El doble del numero " + intNumber + " es " + doubleNumber);
        System.out.println("El triple del numero " + intNumber + " es " + triNumber);
        System.out.println("La raiz cuadrada del numero " + intNumber + " es " + Math.sqrt(intNumber));
        
        System.out.println("-----------------------------------------------------------------"); 
        
        
        
        System.out.println("-----------------------------------------------------------------"); 
       
    }
    
}
