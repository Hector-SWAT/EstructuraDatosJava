/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combinatoria;

/**
 *
 * @author Usuario
 */
public class COMBINATORIA {
     public static int coeficienteBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return coeficienteBinomial(n - 1, k - 1) + coeficienteBinomial(n - 1, k);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n = 4;
        int k = 2;
        int resultado = coeficienteBinomial(n, k);
        System.out.println("Coeficiente binomial C(" + n + ", " + k + ") es: " + resultado);
    }
    
}
