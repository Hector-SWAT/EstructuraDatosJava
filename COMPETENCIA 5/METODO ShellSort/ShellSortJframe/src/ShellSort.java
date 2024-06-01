/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Usuario
 */
public class ShellSort {

    public void shellSort(int arr[]) {
        int n = arr.length;

        // Comienza con un intervalo grande y lo reduce
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i += 1) {
                int temp = arr[i];
                int j;

                for (j = i; j >= intervalo && arr[j - intervalo] > temp; j -= intervalo) {
                    arr[j] = arr[j - intervalo];
                }

                arr[j] = temp;
            }
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
