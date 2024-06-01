/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodomezcladirecta;

/**
 *
 * @author Usuario
 */
public class MezclaDirecta {

    // Método principal para realizar la mezcla directa
    public void mezclaDirecta(int[] arreglo) {
        if (arreglo.length <= 1) {
            return;
        }

        int mitad = arreglo.length / 2;
        int[] mitadIzquierda = new int[mitad];
        int[] mitadDerecha = new int[arreglo.length - mitad];

        // Dividir el arreglo en dos mitades
        System.arraycopy(arreglo, 0, mitadIzquierda, 0, mitad);
        System.arraycopy(arreglo, mitad, mitadDerecha, 0, arreglo.length - mitad);

        // Recursivamente ordenar las dos mitades
        mezclaDirecta(mitadIzquierda);
        mezclaDirecta(mitadDerecha);

        // Combinar las dos mitades ordenadas
        combinar(arreglo, mitadIzquierda, mitadDerecha);
    }

    // Método para combinar dos mitades ordenadas en un solo arreglo ordenado
    private void combinar(int[] resultado, int[] mitadIzquierda, int[] mitadDerecha) {
        int i = 0, j = 0, k = 0;

        // Combinar elementos en orden ascendente
        while (i < mitadIzquierda.length && j < mitadDerecha.length) {
            if (mitadIzquierda[i] <= mitadDerecha[j]) {
                resultado[k++] = mitadIzquierda[i++];
            } else {
                resultado[k++] = mitadDerecha[j++];
            }
        }

        // Copiar los elementos restantes de la mitad izquierda, si los hay
        while (i < mitadIzquierda.length) {
            resultado[k++] = mitadIzquierda[i++];
        }

        // Copiar los elementos restantes de la mitad derecha, si los hay
        while (j < mitadDerecha.length) {
            resultado[k++] = mitadDerecha[j++];
        }
    }
    // Método auxiliar para imprimir un arreglo
    public void imprimirArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
