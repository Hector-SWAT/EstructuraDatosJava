/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickshort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class QuickShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar en el QuickShort"));
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            String f = JOptionPane.showInputDialog("Ingrese el QuickShort" + (i + 1));
            int numero = Integer.parseInt(f);
            numeros[i] = numero;
        }

        Qick o = new Qick();

        System.out.println("Antes del método de QuickShort: " + Arrays.toString(numeros));

        o.ordenarquickShort(numeros);

        System.out.println("Después del método de4 QuickShort: " + Arrays.toString(numeros));

//        for(int i = 0; i<arreglo.length; i++){
//            System.out.println(arreglo[i]);
//        }
    }

}
