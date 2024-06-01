/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Se le pide al usuario un numero entero
        System.out.print("Ingrese el numero para calcular e factorial: ");
        //Se lee la entrada dijitada por el usuario y se almacena en una Variable
        //Varible = num
        int num= sc.nextInt();
        //Se instancia la clase en en main y se le asigan el nombre rec
        Recursividad rec = new Recursividad();
        //Se crea una variable entera para almacenar el valor devuelto una vez paso
        //El metodo de la clase y se le pasa como parametro el num ingresado 
        int res = rec.CFactorial(num);
        //Se imprimen los resultados
        System.out.print("El numero "+num+" Su factorial es: "+res);
        //Se cierra la entrada al usuario 
        sc.close();
        
    }
    
}

