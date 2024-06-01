/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolalumno;

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

    public void insertar(String dato,float p) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato,p);
        } else {
            this.insertar(this.raiz, dato,p);
        }
    }

    private void insertar(Nodo padre, String dato,Float p) {
        if (dato.compareTo(padre.getDato()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato,p));
            } else {
                this.insertar(padre.getDerecha(), dato,p);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato,p));
            } else {
                this.insertar(padre.getIzquierda(), dato,p);
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
    
    
}


