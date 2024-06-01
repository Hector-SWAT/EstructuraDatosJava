/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

/**
 *
 * @author Usuario
 */
public class PALINDROMO {
    public static boolean esPalindromo(String cadena) {
        if (cadena.length() <= 1) {
            return true;
        } else if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
            return esPalindromo(cadena.substring(1, cadena.length() - 1));
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
