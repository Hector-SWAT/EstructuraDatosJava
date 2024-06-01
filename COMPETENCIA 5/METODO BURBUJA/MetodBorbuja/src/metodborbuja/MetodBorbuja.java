/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodborbuja;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MetodBorbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;

        Burbuja b = new Burbuja();

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar en el ARRAY"));
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            String f = JOptionPane.showInputDialog("Ingrese el ARRAY" + (i + 1));
            int numero = Integer.parseInt(f);
            numeros[i] = numero;
        }

//      int numeros[] = {1, 9, 23, 4, 55, 100, 1, 1, 23};
        System.out.println("Antes del método de la Burbuja: " + Arrays.toString(numeros));

        b.burbuja(numeros);

        System.out.println("Después del método de la Burbuja: " + Arrays.toString(numeros));
    }

}
