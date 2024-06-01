/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodhash;

import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class MetodHASH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Hash hash = new Hash(8);
       String[] arre = {"11","12","13","14","15"};
       String[] elementos = {"20","33","21","10","12","14","56","100"};
       hash.funcionHash(elementos, hash.arreglo);
       hash.mostrar();
       String buscar = hash.buscarClave("33");
       if(buscar == null){
           System.out.println("\nEL ELEMENTO NO SE ENCUENTRA");
       }
    }
    
}
