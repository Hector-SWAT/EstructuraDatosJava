/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesjframe;

/**
 *
 * @author Usuario
 */
public class Arboles {
    
    private Nodo raiz;

    public Arboles() {
        
    }

    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

   private boolean existe(Nodo n, String busqueda) {
    if (n == null) {
        return false;
    }
    if (n.getDato().equals(busqueda)) {
        return true;
    } else if (busqueda.compareTo(n.getDato()) < 0) {
        return existe(n.getIzquierda(), busqueda);
    } else {
        return existe(n.getDerecha(), busqueda);
    }
}

    public void insertar(String dato,String significado) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato,significado);
        } else {
            this.insertar(this.raiz, dato,significado);
        }
    }

    private void insertar(Nodo padre, String dato,String significado) {
    if (dato.compareTo(padre.getDato()) > 0) {
        if (padre.getDerecha() == null) {
            padre.setDerecha(new Nodo(dato,significado));
        } else {
            this.insertar(padre.getDerecha(), dato,significado);
        }
    } else {
        if (padre.getIzquierda() == null) {
            padre.setIzquierda(new Nodo(dato,significado));
        } else {
            this.insertar(padre.getIzquierda(), dato,significado);
        }
    }
}
    private String preorden(Nodo n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(n.imprimirDato());
            resultado.append(preorden(n.getIzquierda()));
            resultado.append(preorden(n.getDerecha()));
        }
        return resultado.toString();
    }
    
    private String inorden(Nodo n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(inorden(n.getIzquierda()));
            resultado.append(n.imprimirDato());
            resultado.append(inorden(n.getDerecha()));
        }
        return resultado.toString();
    }

    private String postorden(Nodo n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(postorden(n.getIzquierda()));
            resultado.append(postorden(n.getDerecha()));
            resultado.append(n.imprimirDato());
        }
        return resultado.toString();
    }
    
    public void preorden() {
        this.preorden(this.raiz);
    }

    public String inorden() {
       return this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
    
    public Arboles obtenerArbol(String palabra){
         Arboles arbol = new Arboles();
          for (int i = 0; i < palabra.length(); i++) {
            String letra = String.valueOf(palabra.charAt(i));
            if (!arbol.existe(letra)) {
                arbol.insertar(letra);
            }
        }
        return arbol;
    }
    
    
public void eliminar(String datoAEliminar) {
    this.raiz = eliminarNodo(this.raiz, datoAEliminar);
}

private Nodo eliminarNodo(Nodo nodo, String datoAEliminar) {
    if (nodo == null) {
        return nodo;
    }

    // Recursivamente buscar el nodo que contiene el dato a eliminar
    if (datoAEliminar.compareTo(nodo.getDato()) < 0) {
        nodo.setIzquierda(eliminarNodo(nodo.getIzquierda(), datoAEliminar));
    } else if (datoAEliminar.compareTo(nodo.getDato()) > 0) {
        nodo.setDerecha(eliminarNodo(nodo.getDerecha(), datoAEliminar));
    } else {
        // Si se encuentra el nodo con el dato a eliminar
        // Nodo con un solo hijo o sin hijos
        if (nodo.getIzquierda() == null) {
            return nodo.getDerecha();
        } else if (nodo.getDerecha() == null) {
            return nodo.getIzquierda();
        }

        // Nodo con dos hijos: obtener el sucesor (nodo más a la izquierda del subárbol derecho)
        nodo.setDato(obtenerDatoMinimo(nodo.getDerecha()));

        // Eliminar el sucesor
        nodo.setDerecha(eliminarNodo(nodo.getDerecha(), nodo.getDato()));
    }

    return nodo;
}

private String obtenerDatoMinimo(Nodo nodo) {
    String min = nodo.getDato();
    while (nodo.getIzquierda() != null) {
        min = nodo.getIzquierda().getDato();
        nodo = nodo.getIzquierda();
    }
    return min;
}
}
