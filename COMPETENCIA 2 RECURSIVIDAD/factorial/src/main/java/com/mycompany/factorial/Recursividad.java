/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorial;

/**
 *
 * @author Usuario
 */
//Nombre de la clase publica Recursividad
public class Recursividad {
    //Meotod de la clase entero 
    //Con un parametro que recibira llamado n
    public int CFactorial(int n){
        //Si el parametro es mayor a 0 entonces hara 
        if (n > 0){
            //Variable (ValorC) para almacenar
            //Que el parametro se multiplicara por si mismo y se le restara uno
            //Recursividad al mometo de volver a llamar tu metrodo dentro de si mismo
            int ValorC = n * CFactorial(n-1);
            return ValorC;
        } 
        //En el caso final solo se retorna un 1 cuando el parametro sea 0
        return 1;
    }
}
