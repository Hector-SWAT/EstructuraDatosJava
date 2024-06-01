/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencialdesordenado;

/**
 *
 * @author Usuario
 */
public class SecuencialDesordenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Secuencial Sc = new Secuencial();
         //SECUENCIAL DESORDENADO
        //CRACION DE LA VARIABLE V LA CUAL CONTIENE UN VECTOR DE N ELEMTOS 
        int[] V = {4, 2, 3, 1, 8, 9};
        //CREACION DE LA VARIABLE N LA CUAL SE LE ASIGANA LA CANTIDAD DE ELEMTOS ENCONTRADOS EN LA VARIABLE V
        int N = V.length;
        //CREACION DE LA VARIABLE X LA CUAL ES EL ELEMTNO A BUSCAR
        int x = 8;
        // SE LLAMA AL OBJETO SC CON EL METODO DE LA CLASE SECUENCIAL Y SE LA PASAN LOS PARAMENTROS 
        //VECTOR, CANTIDAD DE NUMEROS EN EL VECTOR, EL ELEMTO A BUSCAR Y I SE INICIALIZA EN 0
        Sc.Secuencial(V , N, x, 0);
        
    }
    
}
