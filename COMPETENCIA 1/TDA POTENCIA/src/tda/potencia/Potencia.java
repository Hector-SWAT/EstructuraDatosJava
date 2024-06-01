/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda.potencia;

/**
 *
 * @author Usuario
 */
public class Potencia {
    // Método para calcular la potencia de un número
    static double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            double resultado = 1;
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }
            return resultado;
        } else {
            // Manejo de exponentes negativos (1 / base^|exponente|)
            return 1 / calcularPotencia(base, -exponente);
        }
    }
}
