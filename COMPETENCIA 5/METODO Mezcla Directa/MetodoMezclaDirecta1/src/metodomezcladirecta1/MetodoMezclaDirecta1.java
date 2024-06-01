/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodomezcladirecta1;



/**
 *
 * @author Usuario
 */
public class MetodoMezclaDirecta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MezclaDirecta Md = new MezclaDirecta();
        int[] array1 = {9, 14, 29, 31, 4, 13, 72, 61};
        int[] array2 = {75, 68, 17, 25, 5, 18, 46};

        int[] arrayCombinado = Md.mezclaDirecta(array1, array2);
        System.out.println("Arreglo original Mezclado:");
        Md.imprimirArray(arrayCombinado);
        
        // Ordenar el resultado combinado de forma ascendente
        Md.ordenarAscendente(arrayCombinado);

        System.out.println("Arreglo original Mezclado ordenado:");
        Md.imprimirArray(arrayCombinado);
    }
    
}
