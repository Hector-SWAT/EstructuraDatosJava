/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda.calculadora;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void sumar(double numero1, double numero2) {
        resultado = numero1 + numero2;
    }

    public void restar(double numero1, double numero2) {
        resultado = numero1 - numero2;
    }

    public void multiplicar(double numero1, double numero2) {
        resultado = numero1 * numero2;
    }

    public void dividir(double numero1, double numero2) {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
    
}
