/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busqbinaria;

/**
 *
 * @author Usuario
 */
public class BinarioB {
     public int busquedaBinaria(int[] V, int N, int X) {
        int IZQ = 0;
        int DER = N - 1;
        int CEN = 0;
        boolean BAN = false;

        while (IZQ <= DER && !BAN) {
             CEN = (IZQ + DER) / 2;
            if (X == V[CEN]) {
                BAN = true;
            } else {
                if (X > V[CEN]) {
                    IZQ = CEN + 1;
                } else {
                    DER = CEN - 1;
                }
            }
        }
        
        if (BAN) {
            System.out.println("La informacion esta en la posicion " + CEN);
            return CEN;
        } else {
            System.out.println("La información no se encuentra en el arreglo");
            return -1;
        }
    }
    
}
