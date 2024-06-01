/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potencia;

/**
 *
 * @author Usuario
 */
public class POTENCIA {
     public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        int resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }
    
}
