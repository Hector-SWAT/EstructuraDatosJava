/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secuencialdesordenado;

/**
 *
 * @author Usuario
 */
public class Secuencial {

    public int Secuencial(int[] v, int N, int x, int i) {

        while ((i < N) && v[i] != x) {
            i++;
        }
        if (i >= N) {
            System.out.println("La infomacion no esta en el arreglo");
            return -1;
        } else {
            System.out.println("La infomacion se encuentra en la posicion: " + i);
            return i;
        }

    }

}
