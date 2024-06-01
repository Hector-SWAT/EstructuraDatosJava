/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedabinaria;

/**
 *
 * @author Usuario
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Binaria Bn = new Binaria();
         int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int N = arreglo.length;
        int elementoBuscar = 7;

        Bn.busquedaBinaria(arreglo, N, elementoBuscar);
        
        
        
        
    }
    
}
