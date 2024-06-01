/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodborbuja;

/**
 *
 * @author Usuario
 */
public class Burbuja {

    public void burbuja(int[] arreglo) {
        // Bucle externo para iterar a través de todo el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            // Bucle interno para comparar y ordenar los elementos
            for (int j = 0; j < arreglo.length - 1; j++) {
                // Obtener el elemento actual y el siguiente en el arreglo
                int elementoActual = arreglo[j];
                int elementoSiguiente = arreglo[j + 1];

                // Comprobar si el elemento actual es mayor que el siguiente
                if (elementoActual > elementoSiguiente) {
                    // Si es así, intercambiar los elementos para ordenarlos
                    arreglo[j] = elementoSiguiente;
                    arreglo[j + 1] = elementoActual;
                }
            }
        }
    }

}
