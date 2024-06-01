/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursiv;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Recursiv {
    
    public static int Factorial(int num){
            
        if(num==0){
            
            return 1;
        }else{ 
          
            return num*Factorial(num-1);
            
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero para calcular e factorial: ");
        int num= sc.nextInt();
        int res = Factorial(num);
        System.out.print("El numero "+num+" Su Factorial es: "+res);
    }
    
}

