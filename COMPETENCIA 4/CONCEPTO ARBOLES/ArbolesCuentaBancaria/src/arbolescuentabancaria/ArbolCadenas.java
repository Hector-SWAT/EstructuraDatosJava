/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolescuentabancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ArbolCadenas {
    public CuentaBancaria raiz;

    public ArbolCadenas() {

    }

    public boolean existePorNumero(int numeroCuenta) {
    return existePorNumero(this.raiz, numeroCuenta);
}

private boolean existePorNumero(CuentaBancaria n, int numeroCuenta) {
    if (n == null) {
        JOptionPane.showMessageDialog(null, "La cuenta ingresada no existe");
        System.out.println("La cuenta ingresada no existe");
        return false;
    }
    if (n.getNoCuenta() == numeroCuenta) {
        JOptionPane.showMessageDialog(null, "La cuenta ingresada existe");
        return true;
    } else if (numeroCuenta < n.getNoCuenta()) {
        return existePorNumero(n.getIzquierda(), numeroCuenta);
    } else {
        return existePorNumero(n.getDerecha(), numeroCuenta);
    }
}

    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }


    private boolean existe(CuentaBancaria n, String busqueda) {
        if (n == null) {
            
            return false;
        }
        if (n.getTitular().equals(busqueda)) {
            return true;
        } else if (busqueda.compareTo(n.getTitular()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }
    }

    public void insertar(int noCuenta, String titular, float saldo) {
        if (this.raiz == null) {
            this.raiz = new CuentaBancaria(noCuenta, titular, saldo);
        } else {
            this.insertar(this.raiz, noCuenta, titular, saldo);
        }
    }

    private void insertar(CuentaBancaria padre, int noCuenta, String titular, float saldo) {
        if (noCuenta > padre.getNoCuenta()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new CuentaBancaria(noCuenta, titular, saldo));
            } else {
                this.insertar(padre.getDerecha(), noCuenta, titular, saldo);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new CuentaBancaria(noCuenta, titular, saldo));
            } else {
                this.insertar(padre.getIzquierda(), noCuenta, titular, saldo);
            }
        }
    }

    private String preorden(CuentaBancaria n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(n.imprimirDato());
            resultado.append(preorden(n.getIzquierda()));
            resultado.append(preorden(n.getDerecha()));
        }
        return resultado.toString();
    }

    

    private String inorden(CuentaBancaria n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(inorden(n.getIzquierda()));
            resultado.append(n.imprimirDato());
            resultado.append(inorden(n.getDerecha()));
        }
        return resultado.toString();
       
                
    }



    private String postorden(CuentaBancaria n) {
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
    
//       @Override
//     public String toString(){
//        String s = "NUMERO DE CUENTA: "+this.getTitular() +
//                "NOMBRE DEL TITULAR: "+this.getTitular()+"Saldo"+this.getSaldo()+"\n";
//        return s;
//    }
}


