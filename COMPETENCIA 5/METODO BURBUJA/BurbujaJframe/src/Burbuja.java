/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Usuario
 */
public class Burbuja {

    public void burbuja(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            // Aquí "y" se detiene antes de llegar
            // a length - 1 porque dentro del for, accedemos
            // al siguiente elemento con el índice actual + 1
            for (int j = 0; j < arreglo.length - 1; j++) {
                int elementoActual = arreglo[j],
                        elementoSiguiente = arreglo[j + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    arreglo[j] = elementoSiguiente;
                    arreglo[j + 1] = elementoActual;
                }
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
