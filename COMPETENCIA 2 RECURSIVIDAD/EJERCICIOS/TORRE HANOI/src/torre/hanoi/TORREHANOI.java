/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torre.hanoi;

/**
 *
 * @author Usuario
 */
public class TORREHANOI {
    public static void moverTorre(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
        } else {
            moverTorre(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            moverTorre(n - 1, auxiliar, destino, origen);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroDiscos = 3;
        moverTorre(numeroDiscos, 'A', 'C', 'B');
    }
    
}
