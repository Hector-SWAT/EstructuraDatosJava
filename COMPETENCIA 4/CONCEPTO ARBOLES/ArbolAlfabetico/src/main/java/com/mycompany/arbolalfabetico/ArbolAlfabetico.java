/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arbolalfabetico;

/**
 *
 * @author Usuario
 */
public class ArbolAlfabetico {

    public static void main(String[] args) {
        ArbolCadenas arbolCadenas = new ArbolCadenas();
        arbolCadenas.insertar("Casa");
        arbolCadenas.insertar("Gato");
        arbolCadenas.insertar("Perro");
        arbolCadenas.insertar("Loro");
        arbolCadenas.insertar("Zorro");
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
