package cuentabancaria;
import cuentabancaria.CuentaBancaria;


public class Main {

    public static void main(String[] args) {
       CuentaBancaria M = new CuentaBancaria("Magdalena Sanchez","1012",1234,0);
       M.consignar();
       CuentaBancaria J= new CuentaBancaria("Joselito Perez","1013",9876,500000);
       J.cambiarclave();
       J.mostrarclave();
       J.saldo();
       
    }
    
}
