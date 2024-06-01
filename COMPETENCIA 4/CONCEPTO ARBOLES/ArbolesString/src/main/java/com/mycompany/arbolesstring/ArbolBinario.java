/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesstring;

/**
 *
 * @author Usuario
 */
public class ArbolBinario {
    
    public class Main {
    public static void main(String[] argumentos) {
       
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
    
}
