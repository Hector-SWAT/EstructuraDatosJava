/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numrecursivo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NumRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Numero: ");
        int numero = sc.nextInt();
        Imprimir(numero);
    }
    
    public static void Imprimir(int n){
        System.out.println(n);
        if(n > 0){
            n--;
            Imprimir(n);
        }
    }
}
