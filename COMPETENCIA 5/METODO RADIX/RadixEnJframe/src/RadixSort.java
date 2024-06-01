/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class RadixSort {

    // Encuentra el máximo número para determinar el número de dígitos
    public int encontrarMaximo(int arr[], int n) {

        int maximo = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }

        return maximo;
    }

    // Un método para realizar el ordenamiento por el método de conteo
    public void contarOrden(int arr[], int n, int exp) {
        int salida[] = new int[n];
        int conteo[] = new int[10];
        Arrays.fill(conteo, 0);

        // Almacena la cuenta de ocurrencias en el arreglo de conteo
        for (int i = 0; i < n; i++) {
            conteo[(arr[i] / exp) % 10]++;
        }

        // Cambia el conteo[i] para que ahora contenga la posición real de este dígito en salida[]
        for (int i = 1; i < 10; i++) {
            conteo[i] += conteo[i - 1];
        }

        // Construye el arreglo de salida
        for (int i = n - 1; i >= 0; i--) {
            salida[conteo[(arr[i] / exp) % 10] - 1] = arr[i];
            conteo[(arr[i] / exp) % 10]--;
        }

        // Copia el arreglo de salida al arreglo original arr[]
        System.arraycopy(salida, 0, arr, 0, n);
    }

    // La función principal para ordenar un arreglo usando el método de ordenamiento radix
    public void radixSort(int arr[], int n) {
        // Encuentra el máximo número para saber el número de dígitos
        int maximo = encontrarMaximo(arr, n);

        // Realiza el ordenamiento para cada dígito
        for (int exp = 1; maximo / exp > 0; exp *= 10) {
            contarOrden(arr, n, exp);
        }
    }

    // Un método de utilidad para imprimir un arreglo
    public String imprimirArreglo(int arr[], int n) {

        StringBuilder Sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            Sb.append(arr[i] + " ");
        }
        return Sb.toString();
    }

}
