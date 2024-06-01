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
    public CURP raiz;

    public ArbolCadenas() {

    }

    public boolean existePorEstatura(Double Estatura) {
    return existePorEstatura(this.raiz, Estatura);
}

private boolean existePorEstatura(CURP n, Double Estatura) {
    if (n == null) {
        JOptionPane.showMessageDialog(null, "NO Hay Alumnos con esa Estatura");
        System.out.println("La cuenta ingresada no existe");
        return false;
    }
    if (Objects.equals(n.getEstatura(), Estatura)) {
        JOptionPane.showMessageDialog(null, "Existe: "+n.getEstatura()+"Nombres: "+n.getNombre() );
        return true;
    } else if (Estatura < n.getEstatura()) {
        return existePorEstatura(n.getIzquierda(), Estatura);
    } else {
        return existePorEstatura(n.getDerecha(), Estatura);
    }
}

    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }


    private boolean existe(CURP n, String Nombre) {
        if (n == null) {
            
            return false;
        }
        if (n.getNombre().equals(Nombre)) {
            return true;
        } else if (Nombre.compareTo(n.getNombre()) < 0) {
            return existe(n.getIzquierda(), Nombre);
        } else {
            return existe(n.getDerecha(), Nombre);
        }
    }

    public void insertar(Double Estatura, String Nombre) {
        if (this.raiz == null) {
            this.raiz = new CURP(Estatura, Nombre);
        } else {
            this.insertar(this.raiz, Estatura, Nombre);
        }
    }

    private void insertar(CURP padre, Double Estatura, String Nombre) {
        if (Estatura > padre.getEstatura()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new CURP(Estatura, Nombre));
            } else {
                this.insertar(padre.getDerecha(), Estatura, Nombre);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new CURP(Estatura, Nombre));
            } else {
                this.insertar(padre.getIzquierda(), Estatura, Nombre);
            }
        }
    }

    private String preorden(CURP n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(n.imprimirDato());
            resultado.append(preorden(n.getIzquierda()));
            resultado.append(preorden(n.getDerecha()));
        }
        return resultado.toString();
    }

    

    private String inorden(CURP n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(inorden(n.getIzquierda()));
            resultado.append(n.imprimirDato());
            resultado.append(inorden(n.getDerecha()));
        }
        return resultado.toString();
       
                
    }



    private String postorden(CURP n) {
        StringBuilder resultado = new StringBuilder();
        if (n != null) {
            resultado.append(postorden(n.getIzquierda()));
            resultado.append(postorden(n.getDerecha()));
            resultado.append(n.imprimirDato());
        }
        return resultado.toString();
    }

    public String preorden() {
        return this.preorden(this.raiz);
    }

     public String inorden() {
       return this.inorden(this.raiz);
    }
    public String postorden() {
        return this.postorden(this.raiz);
    }
    
//       @Override
//     public String toString(){
//        String s = "NUMERO DE CUENTA: "+this.getTitular() +
//                "NOMBRE DEL TITULAR: "+this.getTitular()+"Saldo"+this.getSaldo()+"\n";
//        return s;
//    }
}


