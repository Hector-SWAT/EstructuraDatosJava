/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma.de.digitos;

/**
 *
 * @author Usuario
 */
public class SUMADEDIGITOS {
     public static int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return numero % 10 + sumaDigitos(numero / 10);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero = 12345;
        int resultado = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + resultado);
    }
    
}
