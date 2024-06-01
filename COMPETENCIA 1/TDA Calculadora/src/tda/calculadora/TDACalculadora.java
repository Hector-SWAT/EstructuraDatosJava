/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tda.calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TDACalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Crear una instancia de la calculadora
        Calculadora calculadora = new Calculadora();

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicitar al usuario que elija una operación
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        // Realizar la operación seleccionada
        switch (opcion) {
            case 1:
                calculadora.sumar(numero1, numero2);
                break;
            case 2:
                calculadora.restar(numero1, numero2);
                break;
            case 3:
                calculadora.multiplicar(numero1, numero2);
                break;
            case 4:
                calculadora.dividir(numero1, numero2);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        // Mostrar el resultado
        System.out.println("El resultado es: " + calculadora.getResultado());

        // Cerrar el escáner
        scanner.close();
    }
}
