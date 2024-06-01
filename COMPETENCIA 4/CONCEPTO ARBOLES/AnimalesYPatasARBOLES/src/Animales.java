/*,
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Usuario
 */
public class Animales {
    // Atributos privados de la clase
    private int Patas;
    private String Nombre;
    
    // Referencias a los nodos hijos izquierdo y derecho
    private Animales izquierda, derecha;
    
    // Constructor de la clase que inicializa los atributos
    public Animales(int Estatura, String Nombre) {
        this.Patas = Estatura;
        this.Nombre = Nombre;
        this.izquierda = this.derecha = null;
    }
    
    // Métodos getter y setter para el atributo 'Patas'
    public int getPatas() {
        return Patas;
    }

    public void setPatas(int Patas) {
        this.Patas = Patas;
    }
    
    // Métodos getter y setter para el atributo 'Nombre'
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    // Métodos getter y setter para los nodos hijos izquierdo y derecho
    public Animales getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Animales izquierda) {
        this.izquierda = izquierda;
    }

    public Animales getDerecha() {
        return derecha;
    }

    public void setDerecha(Animales derecha) {
        this.derecha = derecha;
    }

    // Método para imprimir los datos del nodo en un formato específico
    public String imprimirDato() {
        String s = "Patas: " + this.getPatas() + " "  +
                   "NOMBRE: " + this.getNombre() + "\n";
        return s;
    }
    
    // Sobrescritura del método toString para obtener una representación de la clase como String
    @Override
    public String toString() {
        String s = "Patas: " + this.getPatas() + " " +
                   "NOMBRE: " + this.getNombre() + "\n";
        return s;
    }
}
