/*,
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabancaria;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private int NoCuenta;
    private float Saldo;
    
    public CuentaBancaria (int NoCuenta, float Saldo){
        this.NoCuenta = NoCuenta;
        this.Saldo = Saldo;
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
    
}
