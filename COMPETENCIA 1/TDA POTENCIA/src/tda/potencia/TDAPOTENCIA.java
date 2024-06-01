/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tda.potencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TDAPOTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base y el exponente
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        // Calcular la potencia utilizando el TDA Potencia
        double resultado = Potencia.calcularPotencia(base, exponente);

        // Mostrar el resultado
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);

        // Cerrar el escáner
        scanner.close();
    }
    
}
