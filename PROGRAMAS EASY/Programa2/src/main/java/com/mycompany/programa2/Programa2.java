/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa2;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 * Materia EDD
 * 31/10/21
 */
public class Programa2 {
    
    public static void main(String[] args) {
        //Variables de la clase main para calcular El area de un triangulo
        float base, altura, radio;
        
        
        
        //Se Muestra en pantalla que el programa sirve para calcular el area de un Triangulo
        JOptionPane.showMessageDialog(null, "Calcular el Area de un triangulo");
        //Se le pide la base del traingulo al Usuario
        base  = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del Triangulo"));
        //Se le pide la Altura del traingulo al Usuario
        altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la Altura del Triangulo"));
        //Formula para el Area (Base*Altura)/2
        //Mostar el area del Triangulo
        JOptionPane.showMessageDialog(null, "El area es = "+(base*altura/2));
        
        
        //Calcular el area y diametro de un circulo
        JOptionPane.showMessageDialog(null, "Calcular el Area y Diametro de un Circulo");
        radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Radio del circulo"));
        double area = Math.PI*Math.pow(radio, 2);
        double area1 = Math.round(area);
        JOptionPane.showMessageDialog(null, "El Area del cirulo es: "+(area1));
        JOptionPane.showMessageDialog(null, "El Diametro del cirulo es: "+(radio*2));
        
        //Elevar un numero al cuadrado
        JOptionPane.showMessageDialog(null, "Calcular el Exponente de un numero");
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        double y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero que sera el exponente del Anterior: "));
        double elv = Math.pow(x, y);
        JOptionPane.showMessageDialog(null, "El numero: "+x+" Elevado a: "+y+" Es Igual a: "+elv );
    }
}
