/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mcdrecursividad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MCDRecursividad {
    public static int MCDrecursividad(int a, int b){
        if(a < b){
            return MCDrecursividad(b,a);
        }else if (b == 0){
            return a;
        }else{
            return MCDrecursividad(b, a%b );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        
        System.out.println("Favor de ingresar el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Favor de ingresar el segundo numero: ");
        int b = sc.nextInt();
        int MCD = MCDrecursividad(a,b);
        System.out.print("El MCD entre los dos numeros es: "+ MCD);
    }
}
