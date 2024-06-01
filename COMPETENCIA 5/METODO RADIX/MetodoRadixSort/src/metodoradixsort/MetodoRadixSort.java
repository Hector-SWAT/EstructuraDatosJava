/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoradixsort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MetodoRadixSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar en el RadixSort"));
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            String f = JOptionPane.showInputDialog("Ingrese el Array" + (i + 1));
            int numero = Integer.parseInt(f);
            numeros[i] = numero;
        }
        
        RadixSort Rs =  new RadixSort();
        
        int a = numeros.length;

        System.out.println("Arreglo original:"+Arrays.toString(numeros));
  
        // Aplica el ordenamiento radix
        Rs.radixSort(numeros, a);

        System.out.println("\nArreglo ordenado:"+Arrays.toString(numeros));
        
        
        System.out.println("\nEl mayor de Arreglo es: "+ Rs.encontrarMaximo(numeros, a));
        
        
    }
    
}
