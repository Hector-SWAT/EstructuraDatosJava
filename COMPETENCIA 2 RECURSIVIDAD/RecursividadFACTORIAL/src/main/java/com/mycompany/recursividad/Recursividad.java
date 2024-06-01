/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursividad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Recursividad {
    
    public static int Factorial(int n){
        int Aux=1;
        for(int i=n; i>=1; i--){
            Aux*=i;
        }
        return Aux;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero para calcular su Factorial: ");
        int num= sc.nextInt();
        int resul= Factorial(num);
        System.out.print("Su numero: "+num+" El Factorial Es: "+resul);
    }
}
