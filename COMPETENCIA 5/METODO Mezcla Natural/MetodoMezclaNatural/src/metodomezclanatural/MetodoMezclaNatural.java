/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodomezclanatural;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MetodoMezclaNatural {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar en el MetodoMezclaNatural"));
        int[] numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            String f = JOptionPane.showInputDialog("Ingrese el Array" + (i + 1));
            int numero = Integer.parseInt(f);
            numeros[i] = numero;
        }
        MezclaNatural Mn = new MezclaNatural();
        

        System.out.println("Arreglo original:"+Arrays.toString(numeros));
        Mn.mezclaNatural(numeros);
        System.out.println("\nArreglo ordenado:"+Arrays.toString(numeros));
    }
    
}
