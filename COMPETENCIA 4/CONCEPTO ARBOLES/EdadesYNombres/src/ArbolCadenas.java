/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ArbolCadenas {

    // Atributo que representa la raíz del árbol
    public Edades raiz;

    // Constructor por defecto
    public ArbolCadenas() {

    }

    // Método público para verificar si existe un nodo con la edad dada
    public boolean existePorEdad(int Edad) {
        return existePorEdad(this.raiz, Edad);
    }

    // Método privado recursivo para verificar si existe un nodo con la edad dada
    private boolean existePorEdad(Edades n, int Edad) {
        if (n == null) {
            // Mostrar un mensaje si no hay nodos con la edad buscada
            JOptionPane.showMessageDialog(null, "NO Hay Alumnos con esa Estatura");
            System.out.println("La cuenta ingresada no existe");
            return false;
        }
        if (Objects.equals(n.getEdad(), Edad)) {
            // Mostrar un mensaje si se encuentra un nodo con la edad buscada
            JOptionPane.showMessageDialog(null, "Existe: " + n.getEdad() + " Nombres: " + n.getNombre());
            return true;
        } else if (Edad < n.getEdad()) {
            // Buscar en el subárbol izquierdo si la edad buscada es menor
            return existePorEdad(n.getIzquierda(), Edad);
        } else {
            // Buscar en el subárbol derecho si la edad buscada es mayor
            return existePorEdad(n.getDerecha(), Edad);
        }
    }

    // Método público para verificar si existe un nodo con el nombre dado
    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    // Método privado recursivo para verificar si existe un nodo con el nombre dado
    private boolean existe(Edades n, String Nombre) {
        if (n == null) {
            // Si no hay nodos, devuelve falso
            return false;
        }
        if (n.getNombre().equals(Nombre)) {
            // Si se encuentra un nodo con el nombre buscado, devuelve verdadero
            return true;
        } else if (Nombre.compareTo(n.getNombre()) < 0) {
            // Buscar en el subárbol izquierdo si el nombre buscado es menor
            return existe(n.getIzquierda(), Nombre);
        } else {
            // Buscar en el subárbol derecho si el nombre buscado es mayor
            return existe(n.getDerecha(), Nombre);
        }
    }

    // Método público para insertar un nodo por edad
    public void insertarPorEdad(int Edad, String Nombre) {
        if (this.raiz == null) {
            // Si el árbol está vacío, crea un nuevo nodo como raíz
            this.raiz = new Edades(Edad, Nombre);
        } else {
            // Llama al método privado para insertar en el subárbol correspondiente
            this.insertarPorEdad(this.raiz, Edad, Nombre);
        }
    }

    // Método privado recursivo para insertar un nodo por edad
    private void insertarPorEdad(Edades padre, int Edad, String Nombre) {
        if (Edad > padre.getEdad()) {
            // Si la edad es mayor, inserta en el subárbol derecho
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Edades(Edad, Nombre));
            } else {
                // Llama recursivamente al método para seguir buscando en el subárbol derecho
                this.insertarPorEdad(padre.getDerecha(), Edad, Nombre);
            }
        } else {
            // Si la edad es menor o igual, inserta en el subárbol izquierdo
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Edades(Edad, Nombre));
            } else {
                // Llama recursivamente al método para seguir buscando en el subárbol izquierdo
                this.insertarPorEdad(padre.getIzquierda(), Edad, Nombre);
            }
        }
    }

    // Método privado para realizar un recorrido preorden en el árbol
    private String preorden(Edades n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(n.imprimirDato());
            resultado.append(preorden(n.getIzquierda()));
            resultado.append(preorden(n.getDerecha()));
        }
        return resultado.toString();
    }

    // Método privado para realizar un recorrido inorden en el árbol
    private String inorden(Edades n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(inorden(n.getIzquierda()));
            resultado.append(n.imprimirDato());
            resultado.append(inorden(n.getDerecha()));
        }
        return resultado.toString();
    }

    // Método privado para realizar un recorrido postorden en el árbol
    private String postorden(Edades n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(postorden(n.getIzquierda()));
            resultado.append(postorden(n.getDerecha()));
            resultado.append(n.imprimirDato());
        }
        return resultado.toString();
    }

    // Métodos públicos para realizar recorridos en el árbol
    public String preorden() {
        return this.preorden(this.raiz);
    }

    public String inorden() {
        return this.inorden(this.raiz);
    }

    public String postorden() {
        return this.postorden(this.raiz);
    }

   public void insertar(String dato, int edad) {
        if (this.raiz == null) {
            this.raiz = new Edades(edad,dato);
        } else {
            this.insertar(this.raiz, dato,edad);
        }
    }

    private void insertar(Edades padre, String dato, int edad) {
        if (dato.compareTo(padre.getNombre()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Edades(edad,dato));
            } else {
                this.insertar(padre.getDerecha(), dato,edad);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Edades(edad,dato));
            } else {
                this.insertar(padre.getIzquierda(), dato,edad);
            }
        }
    }
}
