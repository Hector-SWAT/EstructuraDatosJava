/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metododeintercalacion;

/**
 *
 * @author Usuario
 */
public class Intercalacion {
    
     public void intercalarAray(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;

            // Ordenar la mitad izquierda y derecha
            intercalarAray(array, izquierda, medio);
            intercalarAray(array, medio + 1, derecha);

            // Combinar las mitades ordenadas
            intercalar(array, izquierda, medio, derecha);
        }
    }

    public void intercalar(int[] array, int izquierda, int medio, int derecha) {
        int longitudIzquierda = medio - izquierda + 1;
        int longitudDerecha = derecha - medio;

        int[] izquierdaArray = new int[longitudIzquierda];
        int[] derechaArray = new int[longitudDerecha];

        // Copiar datos a los arrays temporales
        for (int i = 0; i < longitudIzquierda; i++) {
            izquierdaArray[i] = array[izquierda + i];
        }
        for (int j = 0; j < longitudDerecha; j++) {
            derechaArray[j] = array[medio + 1 + j];
        }

        // Combinar los arrays temporales
        int i = 0, j = 0, k = izquierda;
        while (i < longitudIzquierda && j < longitudDerecha) {
            if (izquierdaArray[i] <= derechaArray[j]) {
                array[k] = izquierdaArray[i];
                i++;
            } else {
                array[k] = derechaArray[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de la mitad izquierda (si los hay)
        while (i < longitudIzquierda) {
            array[k] = izquierdaArray[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de la mitad derecha (si los hay)
        while (j < longitudDerecha) {
            array[k] = derechaArray[j];
            j++;
            k++;
        }
    }

    public int[] intercalarArrays(int[] array1, int[] array2) {
        int longitudTotal = array1.length + array2.length;
        int[] resultado = new int[longitudTotal];

        int indiceArray1 = 0;
        int indiceArray2 = 0;
        int indiceResultado = 0;

        // Intercalar elementos hasta que uno de los arrays se agote
        while (indiceArray1 < array1.length && indiceArray2 < array2.length) {
            resultado[indiceResultado++] = array1[indiceArray1++];
            resultado[indiceResultado++] = array2[indiceArray2++];
        }

        // Copiar los elementos restantes del primer array (si los hay)
        while (indiceArray1 < array1.length) {
            resultado[indiceResultado++] = array1[indiceArray1++];
        }

        // Copiar los elementos restantes del segundo array (si los hay)
        while (indiceArray2 < array2.length) {
            resultado[indiceResultado++] = array2[indiceArray2++];
        }

        return resultado;
    }

    public void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    
}
