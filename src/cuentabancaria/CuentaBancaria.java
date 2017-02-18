package cuentabancaria;
import java.util.Scanner;

public class CuentaBancaria {
    //variables nativas
    
    private String numero;
    private String dueno;
    private double saldo;
    private int clave;
    
    
    Scanner lec= new Scanner(System.in);
    //constructores
    
    public CuentaBancaria(String d, String n, int c, double s){
     numero = n;
     clave = c;
     dueno = d;
     saldo = s;
    }
    
    //metodos
    
   public void consignar(){
       System.out.println("Ingrese el valor a consignar a "+ this.dueno+":");
       double valor = lec.nextDouble();
       this.saldo = this.saldo + valor;
       System.out.println(this.dueno + " ha recibido una consignación por valor de: "+ valor);
    
   }
   
   public void retirar(){
       System.out.println("Ingrese el valor a retirar "+ this.dueno+":");
       double x = lec.nextDouble();
       this.saldo = this.saldo + x;
       System.out.println(this.dueno + " ha realizado un retiro por valor de: "+ x);
   }
   
   public void cambiarclave(){
    System.out.println("Ingrese nueva clave para su cuenta, Sr/Sra: "+ this.dueno);
    int x = lec.nextInt();
    this.clave=x;
   }
   
   public void mostrarclave(){
   System.out.println("Sr./Sra. "+this.dueno+" su clave es: "+this.clave);
   }
   
   public void saldo(){
   System.out.println("Sr./Sra. "+this.dueno+" su saldo es: "+this.saldo);
     
   }


   
}
