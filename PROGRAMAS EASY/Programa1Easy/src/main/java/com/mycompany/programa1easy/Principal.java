/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa1easy;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 * Materia EDD
 * 31/10/21
 * 
 */
public class Principal {
    public static void main(String [] args){
        int edad = 22;
        String nombre = "Hector Delfino Hernandez Pérez";
        float pi = 3.1416f;
        JOptionPane.showMessageDialog(null, "Hola mundo"+"\n Mi nombre es "
                + nombre+ "\nMi edad es: "+ edad
        + " \nEl valor de Pi: "+pi);
        
        System.out.println("Hola mundo"+" \nMi nombre es "
                + nombre+ "\nMi edad es: "+ edad
        + " \nEl valor de Pi: "+pi);
    }
    
    
    
    
    
}
