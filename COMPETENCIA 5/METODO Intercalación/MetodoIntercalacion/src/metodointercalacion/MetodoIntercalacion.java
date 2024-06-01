/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodointercalacion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MetodoIntercalacion {

    /**
     * La "intercalación" en el contexto de estructuras de datos generalmente se
     * refiere a la acción de combinar dos o más conjuntos de datos ordenados en
     * un solo conjunto ordenado más grande. En el caso de Java y estructuras de
     * datos como listas o arrays, esto se puede lograr de varias maneras, pero
     * comúnmente se utiliza el proceso de mezcla o intercalación.
     *
     * La intercalación es un algoritmo de ordenamiento que funciona dividiendo
     * la lista en subconjuntos más pequeños, ordenandolos y luego combinándolos
     * para obtener la lista final ordenada.
     */
    /**
     *
     **
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar en el MetodoIntercalacion"));
        int[] numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            String f = JOptionPane.showInputDialog("Ingrese el Array" + (i + 1));
            int numero = Integer.parseInt(f);
            numeros[i] = numero;
        }
        Intercalacion It = new Intercalacion();
         
        System.out.println("Array original:" + Arrays.toString(numeros));
        
        It.intercalar(numeros, 0, numeros.length - 1);
        
        System.out.println("\nArray ordenado:");
        It.imprimirArray(numeros);
    }
}
        