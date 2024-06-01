/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedabinaria;

/**
 *
 * @author Usuario
 */
public class Binaria {

    public int busquedaBinaria(int[] V, int N, int X) {
        int IZQ = 0;
        int DER = N - 1;
       
        boolean BAN = false;

        while (IZQ <= DER && !BAN) {
             int CEN = (IZQ + DER) / 2;
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
            return (IZQ + DER) / 2;
        } else {
            return -1;
        }
    }
}
