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
    public Animales raiz;

    // Constructor por defecto
    public ArbolCadenas() {

    }

    // Método público para verificar si existe un nodo con la edad dada
    public boolean existePorPatas(int Patas) {
        return existePorPatas(this.raiz, Patas);
    }

    // Método privado recursivo para verificar si existe un nodo con la edad dada
    private boolean existePorPatas(Animales n, int Patas) {
        if (n == null) {
            // Mostrar un mensaje si no hay nodos con la edad buscada
            JOptionPane.showMessageDialog(null, "NO Hay Alumnos con esa Estatura");
            System.out.println("La cuenta ingresada no existe");
            return false;
        }
        if (Objects.equals(n.getPatas(), Patas)) {
            // Mostrar un mensaje si se encuentra un nodo con la edad buscada
            JOptionPane.showMessageDialog(null, "Existe: " + n.getPatas() + " Nombres: " + n.getNombre());
            return true;
        } else if (Patas < n.getPatas()) {
            // Buscar en el subárbol izquierdo si la edad buscada es menor
            return existePorPatas(n.getIzquierda(), Patas);
        } else {
            // Buscar en el subárbol derecho si la edad buscada es mayor
            return existePorPatas(n.getDerecha(), Patas);
        }
    }

    // Método público para verificar si existe un nodo con el nombre dado
    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    // Método privado recursivo para verificar si existe un nodo con el nombre dado
    private boolean existe(Animales n, String Nombre) {
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
    public void insertarPorPatas(int Patas, String Nombre) {
        if (this.raiz == null) {
            // Si el árbol está vacío, crea un nuevo nodo como raíz
            this.raiz = new Animales(Patas, Nombre);
        } else {
            // Llama al método privado para insertar en el subárbol correspondiente
            this.insertarPorPatas(this.raiz, Patas, Nombre);
        }
    }

    // Método privado recursivo para insertar un nodo por edad
    private void insertarPorPatas(Animales padre, int Patas, String Nombre) {
        if (Patas > padre.getPatas()) {
            // Si la edad es mayor, inserta en el subárbol derecho
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Animales(Patas, Nombre));
            } else {
                // Llama recursivamente al método para seguir buscando en el subárbol derecho
                this.insertarPorPatas(padre.getDerecha(), Patas, Nombre);
            }
        } else {
            // Si la edad es menor o igual, inserta en el subárbol izquierdo
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Animales(Patas, Nombre));
            } else {
                // Llama recursivamente al método para seguir buscando en el subárbol izquierdo
                this.insertarPorPatas(padre.getIzquierda(), Patas, Nombre);
            }
        }
    }

    // Método privado para realizar un recorrido preorden en el árbol
    private String preorden(Animales n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(n.imprimirDato());
            resultado.append(preorden(n.getIzquierda()));
            resultado.append(preorden(n.getDerecha()));
        }
        return resultado.toString();
    }

    // Método privado para realizar un recorrido inorden en el árbol
    private String inorden(Animales n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(inorden(n.getIzquierda()));
            resultado.append(n.imprimirDato());
            resultado.append(inorden(n.getDerecha()));
        }
        return resultado.toString();
    }

    // Método privado para realizar un recorrido postorden en el árbol
    private String postorden(Animales n) {
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

  public void insertar(String dato, int patas) {
        if (this.raiz == null) {
            this.raiz = new Animales(patas,dato);
        } else {
            this.insertar(this.raiz, dato,patas);
        }
    }

    private void insertar(Animales padre, String dato,int patas) {
        if (dato.compareTo(padre.getNombre()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Animales(patas,dato));
            } else {
                this.insertar(padre.getDerecha(), dato,patas);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Animales(patas,dato));
            } else {
                this.insertar(padre.getIzquierda(), dato,patas);
            }
        }
    }

    public void eliminarPorNombre(String Nombre) {
    // Llama al método privado para realizar la eliminación
    this.raiz = eliminarPorNombre(this.raiz, Nombre);
}

    
private Animales eliminarPorNombre(Animales nodo, String Nombre) {
    // Si el nodo es nulo, no hay nada que eliminar
    if (nodo == null) {
        JOptionPane.showMessageDialog(null, "No se encontró el nombre a eliminar: " + Nombre);
        return null;
    }

    // Compara el nombre del nodo actual con el nombre a eliminar
    int comparacion = Nombre.compareToIgnoreCase(nodo.getNombre());

    // Si el nombre a eliminar es menor, busca en el subárbol izquierdo
    if (comparacion < 0) {
        nodo.setIzquierda(eliminarPorNombre(nodo.getIzquierda(), Nombre));
    }
    // Si el nombre a eliminar es mayor, busca en el subárbol derecho
    else if (comparacion > 0) {
        nodo.setDerecha(eliminarPorNombre(nodo.getDerecha(), Nombre));
    }
    // Si se encuentra el nombre a eliminar
    else {
        // Caso 1: Nodo con un solo hijo o sin hijos
        if (nodo.getIzquierda() == null) {
            return nodo.getDerecha();
        } else if (nodo.getDerecha() == null) {
            return nodo.getIzquierda();
        }

        // Caso 2: Nodo con dos hijos
        // Encuentra el sucesor en inorden (el nodo más pequeño en el subárbol derecho)
        nodo.setPatas(minimoValor(nodo.getDerecha()).getPatas());
        nodo.setNombre(minimoValor(nodo.getDerecha()).getNombre());

        // Elimina el sucesor
        nodo.setDerecha(eliminarPorNombre(nodo.getDerecha(), nodo.getNombre()));
    }

    return nodo;
}

// Método auxiliar para encontrar el nodo con el valor mínimo en un subárbol
private Animales minimoValor(Animales nodo) {
    while (nodo.getIzquierda() != null) {
        nodo = nodo.getIzquierda();
    }
    return nodo;
}

}
