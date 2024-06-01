/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodomezcladirecta1;

/**
 *
 * @author Usuario
 */
public class MezclaDirecta {

    public int[] mezclaDirecta(int[] array1, int[] array2) {
        int longitudTotal = array1.length + array2.length;
        int[] resultado = new int[longitudTotal];

        // Realizar la primera partición y fusión (longitud l = 1)
        int longitudParticion = 1;
        while (longitudParticion < longitudTotal) {
            particionYFusion(array1, array2, resultado, longitudParticion);
            longitudParticion *= 2; // Duplicar la longitud de la partición en cada paso
        }

        return resultado;
    }

    public void particionYFusion(int[] array1, int[] array2, int[] resultado, int longitudParticion) {
        int indiceArray1 = 0;
        int indiceArray2 = 0;
        int indiceResultado = 0;

        while (indiceArray1 < array1.length && indiceArray2 < array2.length) {
            // Realizar la fusión de secuencias ordenadas de longitud específica
            int finParticionArray1 = Math.min(indiceArray1 + longitudParticion, array1.length);
            int finParticionArray2 = Math.min(indiceArray2 + longitudParticion, array2.length);

            fusionarArrays(array1, array2, resultado, indiceArray1, finParticionArray1, indiceArray2, finParticionArray2, indiceResultado);

            indiceArray1 = finParticionArray1;
            indiceArray2 = finParticionArray2;
            indiceResultado += longitudParticion * 2;
        }

        // Copiar los elementos restantes del primer array (si los hay)
        while (indiceArray1 < array1.length) {
            resultado[indiceResultado++] = array1[indiceArray1++];
        }

        // Copiar los elementos restantes del segundo array (si los hay)
        while (indiceArray2 < array2.length) {
            resultado[indiceResultado++] = array2[indiceArray2++];
        }

    }

    public void fusionarArrays(int[] array1, int[] array2, int[] resultado,
            int inicioArray1, int finArray1, int inicioArray2, int finArray2, int inicioResultado) {
        int longitudArray1 = finArray1 - inicioArray1;
        int longitudArray2 = finArray2 - inicioArray2;

        int[] tempArray1 = new int[longitudArray1];
        int[] tempArray2 = new int[longitudArray2];

        // Copiar datos a arrays temporales
        for (int i = 0; i < longitudArray1; i++) {
            tempArray1[i] = array1[inicioArray1 + i];
        }
        for (int j = 0; j < longitudArray2; j++) {
            tempArray2[j] = array2[inicioArray2 + j];
        }

        // Realizar la fusión de los arrays temporales
        int i = 0, j = 0, k = inicioResultado;

        while (i < longitudArray1 && j < longitudArray2) {
            if (tempArray1[i] <= tempArray2[j]) {
                resultado[k++] = tempArray1[i++];
            } else {
                resultado[k++] = tempArray2[j++];
            }
        }

        // Copiar los elementos restantes de tempArray1 (si los hay)
        while (i < longitudArray1) {
            resultado[k++] = tempArray1[i++];
        }

        // Copiar los elementos restantes de tempArray2 (si los hay)
        while (j < longitudArray2) {
            resultado[k++] = tempArray2[j++];
        }
    }

    public void ordenarAscendente(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int actual = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > actual) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = actual;
        }
    }

    public void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
