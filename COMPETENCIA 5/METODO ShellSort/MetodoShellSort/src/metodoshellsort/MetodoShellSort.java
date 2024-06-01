/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoshellsort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MetodoShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar en el ShellSort"));
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            String f = JOptionPane.showInputDialog("Ingrese en la posicion: " + (i + 1));
            int numero = Integer.parseInt(f);
            numeros[i] = numero;
        }
        ShellSort Ss = new ShellSort();

        System.out.println("Array antes de ordenar:"+Arrays.toString(numeros));
        

        Ss.shellSort(numeros);

        System.out.println("\nArray después de ordenar:"+Arrays.toString(numeros));
        
    }
    
}
