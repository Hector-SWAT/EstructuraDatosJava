/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lectura;
//Libreria de java importada
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Lectura {

    public static void main(String[] args) {
        //Se usa para pedir datos al usurio le la entrada de texto en la Consola
        Scanner sc = new Scanner(System.in);
        //Variable para almacenar un numero ingresado por el Usuario de tipo Entero
        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        System.out.println("numero = " + numero);
        System.out.println("Ingrese un numero Decimal: ");
        float numerod = sc.nextFloat();
        System.out.println("numerod = " + numerod);
        
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        float numDEC = Float.parseFloat(JOptionPane.showInputDialog("Ingrese in numero Decimal: "));
        
    }
}
