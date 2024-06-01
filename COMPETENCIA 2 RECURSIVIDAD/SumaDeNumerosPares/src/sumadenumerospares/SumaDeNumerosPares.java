/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadenumerospares;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SumaDeNumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de n
        System.out.print("Ingrese un número (n): ");
        int n = scanner.nextInt();

        // Calcular la suma de números pares hasta n
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }

        // Mostrar el resultado
        System.out.println("La suma de los números pares hasta " + n + " es: " + suma);

        // Cerrar el escáner
        scanner.close();
    }
    
}
