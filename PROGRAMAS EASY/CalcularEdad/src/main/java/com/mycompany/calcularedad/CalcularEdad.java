/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calcularedad;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CalcularEdad {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha de nacimiento en formato YYYY-MM-DD:");
        String fechaNacimientoStr = scanner.nextLine();

        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        LocalDate fechaActual = LocalDate.now();

        int años = Period.between(fechaNacimiento, fechaActual).getYears();

        LocalDate ultimoCumpleaños = fechaNacimiento.plusYears(años);
        LocalDate proximoCumpleaños = ultimoCumpleaños.plusYears(1);

        Period tiempoDesdeUltimoCumple = Period.between(ultimoCumpleaños, fechaActual);
        Period tiempoHastaProximoCumple = Period.between(fechaActual, proximoCumpleaños);

        int mesesDesdeUltimoCumple = tiempoDesdeUltimoCumple.getMonths();
        int diasDesdeUltimoCumple = tiempoDesdeUltimoCumple.getDays();
        int mesesHastaProximoCumple = tiempoHastaProximoCumple.getMonths();
        int diasHastaProximoCumple = tiempoHastaProximoCumple.getDays();

        System.out.println("Edad: " + años + " años.");
        System.out.println("Meses y días desde el último cumpleaños: " + mesesDesdeUltimoCumple + " meses y " + diasDesdeUltimoCumple + " días.");
        System.out.println("Meses y días faltantes para el próximo cumpleaños: " + mesesHastaProximoCumple + " meses y " + diasHastaProximoCumple + " días.");

        scanner.close();
    }
}

