package com.mycompany.cantidades;

import com.mycompany.cuentaahorros.CuentaAhorros;
import java.util.Scanner;


public class Cantidades {
    public static void main(String[] args){
        
        CuentaAhorros micuenta= new CuentaAhorros ();
        Scanner sc=new Scanner (System.in);
        System.out.println("Cual es el saldo de la cuenta");
        int saldo = sc.nextInt();  
        micuenta.setSaldo(saldo);
        System.out.println("Como se llama su merce");
        String nombre = sc.next();
        micuenta.setTituarCuenta(nombre);
        int num;
        do {
            System.out.println("Menu\n1.  Consignar dinero\n2. Retirar\n3. Consultar Saldo\n4. Salir");
            num = sc.nextInt(); 
            switch(num){
                case 1 ->  {
                    System.out.println("Ingrese la cantidad que quiere consignar");
                    int cant = sc.nextInt(); 
                    micuenta.Consignar(cant);
                }
                case 2 -> { 
                    System.out.println("Ingrese la cantidad que quiere retirar");
                    int cant = sc.nextInt(); 
                    micuenta.Retirar(cant);
                }
                case 3 -> {
                    saldo = micuenta.getsaldo(); 
                    System.out.println("Su saldo es "+saldo);
                }                
            }
        } while(num!=4);
    }
}
