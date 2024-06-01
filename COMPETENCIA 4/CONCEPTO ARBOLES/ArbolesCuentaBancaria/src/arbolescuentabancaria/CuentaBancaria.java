/*,
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolescuentabancaria;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private int NoCuenta;
    private String Titular;
    private float Saldo;
    private CuentaBancaria izquierda, derecha;
    
    public CuentaBancaria (int NoCuenta, String Titular,float Saldo){
        this.NoCuenta = NoCuenta;
        this.Saldo = Saldo;
        this.Titular = Titular;
        this.izquierda = this.derecha = null;
    }
    
    public int getNoCuenta(){
        return NoCuenta;
    }
    public void setNoCuenta(int NoCuenta){
        this.NoCuenta = NoCuenta;
        
    }
    public float getSaldo(){
        return Saldo;
    }
    public void setSaldo(float Saldo){
        this.Saldo = Saldo;
    }
      public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

  

   

    public CuentaBancaria getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(CuentaBancaria izquierda) {
        this.izquierda = izquierda;
    }

    public CuentaBancaria getDerecha() {
        return derecha;
    }

    public void setDerecha(CuentaBancaria derecha) {
        this.derecha = derecha;
    }

    public String imprimirDato() {
         String s = "NUMERO DE CUENTA: "+this.getNoCuenta()+"\n"+
                "NOMBRE DEL TITULAR: "+this.getTitular()+"\n"+"Saldo: "+this.getSaldo()+"\n";
        return s;
//        System.out.println(this.getNoCuenta()+this.getTitular()+this.getSaldo());
//       return this.getNoCuenta()+" "+this.getTitular()+this.getSaldo()+"\n";      
    }
    
    @Override
     public String toString(){
        String s = "NUMERO DE CUENTA: "+this.getTitular() +
                "NOMBRE DEL TITULAR: "+this.getTitular()+"Saldo"+this.getSaldo()+"\n";
        return s;
    }
    
}
