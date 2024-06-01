/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolstr;

/**
 *
 * @author Usuario
 */
public class ArbolCadenas {
     private Nodo raiz;

    public ArbolCadenas() {

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

    public void insertar(String dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, String dato) {
        if (dato.compareTo(padre.getDato()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    private String preorden(Nodo n) {
        StringBuilder convertString = new StringBuilder();
        if (n != null) {
             n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
        return convertString.toString();
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
    

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    public String preorden() {
       return this.preorden(this.raiz);
    }

    public String inorden() {
        return this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
}


    

