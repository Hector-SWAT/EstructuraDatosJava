/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickshort;

/**
 *
 * @author Usuario
 */
public class Qick {

    public void ordenarquickShort(int array[]) {
        array = quickShort1(array);
    }

    public int[] quickShort1(int numeros[]) {
        return quickShort(numeros, 0, numeros.length - 1);
    }

    public int[] quickShort(int numeros[], int izq, int der) {
        if (izq >= der) {
            return numeros;
        }
        int i = izq, d = der;
        if (izq != der) {
            int pivote;
            int aux;
            pivote = izq;

            while (izq != der) {
                while (numeros[der] >= numeros[pivote] && izq < der) {
                    der--;
                }
                while (numeros[izq] < numeros[pivote] && izq < der) {
                    izq++;
                }
                if (der != izq) {
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                }
            }
            if (izq == der) {
                quickShort(numeros, i, izq - 1);
                quickShort(numeros, izq + 1, d);
            }
        } else {
            return numeros;
        }
        return numeros;

    }

}
