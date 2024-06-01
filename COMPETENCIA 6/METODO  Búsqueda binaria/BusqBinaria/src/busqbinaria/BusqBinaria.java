/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busqbinaria;

/**
 *
 * @author Usuario
 */
public class BusqBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SE INSTANCIA LA CLASE Y SE CREA UN OBJETO LLAMADO Bb
        BinarioB Bb = new BinarioB();
        //SE INGRESA UN ARREGLO ORDENADO 
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //SE LEE EL ARREGLO PARA SABER CUANTOS ELEMENTOS TIENE 
        int N = arreglo.length;
        //SE LE ASIGNA A UNA VARIABLE EL NUMERO A BUSCAR EN EL ARREGLO
        int elementoBuscar = 10;
        /* SE LLAMA AL OBJETO CREADO Y CON ELLA AL METODO DENTRO DE LA CLASE
        AL METODO SE LE PASAN LOS DATOS, ARREGLO, CANTIDAD DE ELELEMTOS DENTRO 
        DEL ARREGLO Y EL NUMERO A BUSCAR */
        Bb.busquedaBinaria(arreglo, N, elementoBuscar);
        
    }
    
}
