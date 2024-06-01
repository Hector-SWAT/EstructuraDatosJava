/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metododeintercalacion;

/**
 *
 * @author Usuario
 */
public class MetodoDeIntercalacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Intercalacion It = new Intercalacion();
        int[] array1 = {6, 9, 18, 20, 35};
         // Imprimir el array
        System.out.print("F1: [");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            // Imprimir una coma y un espacio si no es el último elemento
            if (i < array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        int[] array2 = {10, 16, 25, 28, 66, 82, 87};
         // Imprimir el array
        System.out.print("F2: [");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            // Imprimir una coma y un espacio si no es el último elemento
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"+"\n");
        
        int[] arrayCombinado = It.intercalarArrays(array1, array2);

        System.out.println("Arreglo original Intercalado:");
        It.imprimirArray(arrayCombinado);

        It.intercalarAray(arrayCombinado, 0, arrayCombinado.length - 1);

        System.out.println("\nArreglo ordenado F3:");
        It.imprimirArray(arrayCombinado);
        
                
    }
    
}
