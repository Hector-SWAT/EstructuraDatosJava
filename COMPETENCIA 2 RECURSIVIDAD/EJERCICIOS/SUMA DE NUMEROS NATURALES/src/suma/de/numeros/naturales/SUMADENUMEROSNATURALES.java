/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma.de.numeros.naturales;

/**
 *
 * @author Usuario
 */
public class SUMADENUMEROSNATURALES {
     public static int sumaNaturales(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 5;
        int resultado = sumaNaturales(numero);
        System.out.println("La suma de los primeros " + numero + " números naturales es: " + resultado);
    }
    }
    

