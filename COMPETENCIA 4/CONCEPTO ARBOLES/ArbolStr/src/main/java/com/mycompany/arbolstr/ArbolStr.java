/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arbolstr;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ArbolStr {

    public static void main(String[] args) {
        ArbolCadenas arbol = new ArbolCadenas();
       int limte = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de Alumnos a almacenar"));
        for (int i = 0; i < limte; i++) {
            String palabra = JOptionPane.showInputDialog("Ingrese el Nombre del alumno: "+i+": ");
            arbol.insertar(palabra);
            
        }
        
        JOptionPane.showMessageDialog(null, arbol.inorden());
        
       
    }
}
