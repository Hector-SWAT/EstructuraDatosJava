/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencia.ackermann;

/**
 *
 * @author Usuario
 */
public class SECUENCIAACKERMANN {
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m = 2;
        int n = 1;
        int resultado = ackermann(m, n);
        System.out.println("Ackermann(" + m + ", " + n + ") es: " + resultado);
    }
    
}
