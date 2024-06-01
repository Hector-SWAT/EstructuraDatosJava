/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedasecuencialdesordenado;

/**
 *
 * @author Usuario
 */
public class SecuencialDesordenado {

    public int Secuencial(int[] v, int N, int x, int i) {

        while ((i < N) && v[i] != x) {
            i++;
        }
        if (i >= N) {
            return -1;
        } else {
            return i;
        }

    }

    public int SecuencialRecursivo(int[] V, int N, int X, int I) {
        if (I >= N) {
            return -1;
        }
        if (V[I] == X) {
            return I;
        } else {
            return SecuencialRecursivo(V, N, X, I + 1);
        }
    }

    public int SecuencialOrdenado(int[] V, int N, int X, int I) {
        while ((I <= N) && (X > V[I])) {
            I++;
        }

        if ((I > N) || (X < V[I])) {
            System.out.println("La informacion no se encuentra en el arreglo");
            return -1;
        } else {
            System.out.println("La informacion se encuentra en la posicion"+I);
            return I;
        }
    }

    public int SecuencialOrdenadoRecursivo(int[] V, int N, int X, int I) {
        if ((I <= N) && (X > V[I])) {
            return SecuencialOrdenadoRecursivo(V, N, X, I + 1);
        }
        if ((I >= N) || (X != V[I])) {
            return -1;
        } else {
            return I;
        }
    }

}
