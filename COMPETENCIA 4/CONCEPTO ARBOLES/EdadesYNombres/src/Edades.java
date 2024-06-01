/*,
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Usuario
 */
public class Edades {
    // Atributos privados de la clase
    private int Edad;
    private String Nombre;
    
    // Referencias a los nodos hijos izquierdo y derecho
    private Edades izquierda, derecha;
    
    // Constructor de la clase que inicializa los atributos
    public Edades(int Estatura, String Nombre) {
        this.Edad = Estatura;
        this.Nombre = Nombre;
        this.izquierda = this.derecha = null;
    }
    
    // Métodos getter y setter para el atributo 'Edad'
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    // Métodos getter y setter para el atributo 'Nombre'
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    // Métodos getter y setter para los nodos hijos izquierdo y derecho
    public Edades getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Edades izquierda) {
        this.izquierda = izquierda;
    }

    public Edades getDerecha() {
        return derecha;
    }

    public void setDerecha(Edades derecha) {
        this.derecha = derecha;
    }

    // Método para imprimir los datos del nodo en un formato específico
    public String imprimirDato() {
        String s = "Edad: " + this.getEdad() + " " +
                   "NOMBRE: " + this.getNombre() + "\n";
        return s;
    }
    
    // Sobrescritura del método toString para obtener una representación de la clase como String
    @Override
    public String toString() {
        String s = "Edad: " + this.getEdad() + " " +
                   "NOMBRE: " + this.getNombre() + "\n";
        return s;
    }
}
