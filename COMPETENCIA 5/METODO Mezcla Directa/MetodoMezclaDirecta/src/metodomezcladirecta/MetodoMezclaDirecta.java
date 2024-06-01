/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodomezcladirecta;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MetodoMezclaDirecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar en el MetodoMezclaDirecta"));
        int[] numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            String f = JOptionPane.showInputDialog("Ingrese el Array" + (i + 1));
            int numero = Integer.parseInt(f);
            numeros[i] = numero;
        }
        MezclaDirecta Md = new MezclaDirecta();
        

        System.out.println("Arreglo original:"+Arrays.toString(numeros));
        Md.mezclaDirecta(numeros);
        System.out.println("\nArreglo ordenado:"+Arrays.toString(numeros));
        
    }

    
}


