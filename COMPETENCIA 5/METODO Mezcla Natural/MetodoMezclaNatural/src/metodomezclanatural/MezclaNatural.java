/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodomezclanatural;

/**
 *
 * @author Usuario
 */
public class MezclaNatural {
    // Método para ordenar un arreglo usando mezcla natural

    public void mezclaNatural(int[] arreglo) {
        // Variables para almacenar los índices de las secuencias
        int izquierda = 0, izq = 0, derecha = arreglo.length - 1, der = derecha;
        // Variable para indicar si el arreglo está ordenado
        boolean ordenado = false;
        // Variable para almacenar el arreglo auxiliar
        int[] aux = new int[arreglo.length];
        // Mientras el arreglo no esté ordenado
        while (!ordenado) {
            // Se asume que el arreglo está ordenado
            ordenado = true;
            // Se inicializa el índice de la izquierda
            izquierda = 0;
            // Mientras el índice de la izquierda sea menor que el de la derecha
            while (izquierda < derecha) {
                // Se busca el final de la primera secuencia
                izq = izquierda;
                while (izq < derecha && arreglo[izq] <= arreglo[izq + 1]) {
                    izq++;
                }
                // Se busca el final de la segunda secuencia
                der = izq + 1;
                while (der == derecha - 1 || der < derecha && arreglo[der] <= arreglo[der + 1]) {
                    der++;
                }
                // Si se encontraron dos secuencias, se fusionan
                if (der <= derecha) {
                    // Se indica que el arreglo no está ordenado
                    ordenado = false;
                    // Se mezclan las dos secuencias en el arreglo auxiliar
                    mezclar(arreglo, aux, izquierda, izq, der);
                }
                // Se actualiza el índice de la izquierda
                izquierda = der + 1;
            }
            // Se copia el arreglo auxiliar en el arreglo original
            System.arraycopy(aux, 0, arreglo, 0, arreglo.length);
        }
    }

// Método para mezclar dos secuencias ordenadas
    public void mezclar(int[] arreglo, int[] aux, int izquierda, int izq, int der) {
        // Se inicializan los índices de los arreglos
        int i = izquierda, j = izq + 1, k = izquierda;
        // Mientras haya elementos en ambas secuencias
        while (i <= izq && j <= der) {
            // Se comparan los elementos y se copia el menor al arreglo auxiliar
            if (arreglo[i] <= arreglo[j]) {
                aux[k++] = arreglo[i++];
            } else {
                aux[k++] = arreglo[j++];
            }
        }
        // Se copian los elementos restantes de la primera secuencia
        while (i <= izq) {
            aux[k++] = arreglo[i++];
        }
        // Se copian los elementos restantes de la segunda secuencia
        while (j <= der) {
            aux[k++] = arreglo[j++];
        }
    }
}
