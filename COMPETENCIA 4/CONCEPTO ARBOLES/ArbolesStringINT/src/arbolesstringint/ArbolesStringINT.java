/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesstringint;

/**
 *
 * @author Usuario
 */
public class ArbolesStringINT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Arbol arbol = new Arbol();
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(0);
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
        System.out.println(arbol.existe(1)); // true
        System.out.println(arbol.existe(7)); // false
        System.out.println(arbol.existe(0)); // true
        ArbolCadenas arbolCadenas = new ArbolCadenas();
        arbolCadenas.insertar("Luis");
        arbolCadenas.insertar("Chris");
        arbolCadenas.insertar("Zelda");
        arbolCadenas.insertar("Cuphead");
        arbolCadenas.insertar("Leon");
        System.out.println("Recorriendo inorden:");
        arbolCadenas.inorden();
        System.out.println("Recorriendo postorden:");
        arbolCadenas.postorden();
        System.out.println("Recorriendo preorden:");
        arbolCadenas.preorden();
        System.out.println(arbolCadenas.existe("Luis")); // true
        System.out.println(arbolCadenas.existe("Claire")); // false
        System.out.println(arbolCadenas.existe("Zelda")); // true
    }
    
}
