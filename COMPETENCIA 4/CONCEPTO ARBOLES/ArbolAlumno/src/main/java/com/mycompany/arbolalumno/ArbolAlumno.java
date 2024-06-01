
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arbolalumno;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ArbolAlumno {

    public static void main(String[] args) {
        ArbolCadenas arbol = new ArbolCadenas();
       int limte = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de Alumnos a almacenar"));
        for (int i = 0; i < limte; i++) {
            String palabra = JOptionPane.showInputDialog("Ingrese el Nombre del alumno: "+ (i+1)+": ");
            float promedio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el promedio del alumno: "+(i+1)));
            arbol.insertar(palabra,promedio);
            
        }
        
        JOptionPane.showMessageDialog(null, arbol.inorden());
        
    }
}
