/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodointercalacion;

/**
 *
 * @author Usuario
 */
public class Intercalacion {

    public void intercalar(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            // Encuentra el punto medio del array
            int medio = (izquierda + derecha) / 2;

            // Ordena la primera mitad
            intercalar(array, izquierda, medio);

            // Ordena la segunda mitad
            intercalar(array, medio + 1, derecha);

            // Combina las dos mitades ordenadas
            combinar(array, izquierda, medio, derecha);
        }
    }

    public void combinar(int[] array, int izquierda, int medio, int derecha) {
        // Tamaño de los sub-arrays
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        // Arrays temporales
        int[] izquierdaArray = new int[n1];
        int[] derechaArray = new int[n2];

        // Copia los datos a los arrays temporales
        System.arraycopy(array, izquierda, izquierdaArray, 0, n1);
        System.arraycopy(array, medio + 1, derechaArray, 0, n2);

        // Índices iniciales de los sub-arrays
        int i = 0, j = 0;

        // Índice inicial del array combinado
        int k = izquierda;

        // Combina los arrays temporales de nuevo en el array original
        while (i < n1 && j < n2) {
            if (izquierdaArray[i] <= derechaArray[j]) {
                array[k] = izquierdaArray[i];
                i++;
            } else {
                array[k] = derechaArray[j];
                j++;
            }
            k++;
        }

        // Copia los elementos restantes de izquierdaArray, si los hay
        while (i < n1) {
            array[k] = izquierdaArray[i];
            i++;
            k++;
        }

        // Copia los elementos restantes de derechaArray, si los hay
        while (j < n2) {
            array[k] = derechaArray[j];
            j++;
            k++;
        }
    }

    public void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

