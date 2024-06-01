/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author Usuario
 */
public class FIBONACCI {
     public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 7;
        int resultado = fibonacci(n);
        System.out.println("El término " + n + " de la secuencia de Fibonacci es: " + resultado);
    }
    
}
