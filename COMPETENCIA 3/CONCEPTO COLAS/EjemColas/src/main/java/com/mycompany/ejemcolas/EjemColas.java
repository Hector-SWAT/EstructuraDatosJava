/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemcolas;

/**
 *
 * @author Usuario
 */
public class EjemColas {

    public static void main(String[] args) {
     Colas cola1=new Colas();
  cola1.insertar(46);
  cola1.insertar(12);
  cola1.insertar(87);
  cola1.insertar(125);
  cola1.insertar(30);
  cola1.extraer();
  cola1.estaVacia();
  cola1.contar();
  System.out.println(cola1.toString());
 }
    }

