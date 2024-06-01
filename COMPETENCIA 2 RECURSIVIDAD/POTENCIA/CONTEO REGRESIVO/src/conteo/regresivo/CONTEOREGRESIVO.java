/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteo.regresivo;

/**
 *
 * @author Usuario
 */
public class CONTEOREGRESIVO {
    public static void contarRegresivo(int n) {
        if (n > 0) {
            System.out.println(n);
            contarRegresivo(n - 1);
        } else {
            System.out.println("¡Boom!");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numeroInicial = 5;
        contarRegresivo(numeroInicial);
    }
    
}
