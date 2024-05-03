package com.mycompany.cuentaahorros;


public class CuentaAhorros {
     private String titularCuenta;
     private int saldo;
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public CuentaAhorros(){
    }
    public CuentaAhorros (String titularCuenta, int saldo){
        this.titularCuenta=titularCuenta;
        this.saldo=saldo;
    }
        
    public String getTitularCuenta(){
        return titularCuenta;
    }
    public void setTituarCuenta (String titularCuenta){
        this.titularCuenta= titularCuenta;
    }
    
    public int getsaldo (){
        return this.saldo;
    }
    
    public void setSaldo (int nuevoSaldo) {
        this.saldo= nuevoSaldo;
    }
    
    public int Consignar (int cantidad){
        if (cantidad>0){
            this.saldo= this.saldo+cantidad;
        }
        return this.saldo;
    }
    
    public int Retirar (int cantidad){
        if(cantidad>this.saldo){
            System.out.println("No hay saldo suficiente");
         }   
            else{
            this.saldo= this.saldo-cantidad;
            }
        return this.saldo ;
    }
   
}
