/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenpractic;

/**
 *
 * @author SALA-D
 */
public class CuentaBancaria {
    //Variables de la clase
    private int NoCuenta;
    private float Saldo;
    
    //Cosntructor
    public CuentaBancaria(int NoCuenta,float Saldo){  
        this.NoCuenta = NoCuenta;
         this.Saldo = Saldo;
    }
    
    public int getNoCuenta(){
        return NoCuenta;
    }
    
    public void setNoCuenta (int NoCuenta){
        this.NoCuenta = NoCuenta;
    }
    
    public float getSaldo( ){
        return Saldo;
    }
    
    public void setSaldo(float Saldo){
        this.Saldo = Saldo;
    }
    
    
}
