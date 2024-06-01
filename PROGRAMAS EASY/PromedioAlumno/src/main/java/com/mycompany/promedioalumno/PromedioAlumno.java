/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.promedioalumno;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class PromedioAlumno {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int numCalificaciones;
        float calificacion, sumaCalificaciones = 0.0f, promedio;

        System.out.print("¿Cuántas calificaciones deseas ingresar? ");
        numCalificaciones = sc.nextInt();

        for(int i = 1; i <= numCalificaciones; i++) {
            System.out.print("Ingresa la calificación " + i + ": ");
            calificacion = sc.nextFloat();
            sumaCalificaciones += calificacion;
        }

        promedio = sumaCalificaciones / numCalificaciones;

        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}
