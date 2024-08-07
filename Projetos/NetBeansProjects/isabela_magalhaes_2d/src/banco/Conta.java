/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 16771606678
 */
public abstract class Conta {
   private int numero;
   double saldo;
   private double limite;
   int identificador;
   
   private static int totalDeContas; //variáveis static pertence a classe
   
   Cliente objCliente = new Cliente();
   
  Conta(){//construtor padrão
      Conta.totalDeContas = Conta.totalDeContas+1;
      this.identificador = Conta.totalDeContas;
       System.out.println("Construindo uma conta");
   }

    public int getIdentificador() {
        return identificador;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }
   Conta(double saldo){
       this();//chama o construtor padrão.
       this.saldo = saldo;
   }
   
   Conta(double saldo, double limite,int numero){
       this(saldo);//chama construtor de saldo
       this.limite = limite;
       this.numero = numero;
   }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return saldo + limite;
    }


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
   
   
    
    public boolean saca(double quantidade){
        if(this.getSaldo() >= quantidade){
        this.saldo = this.saldo -quantidade;
        return true;
        
    }else{
        System.out.println("Saldo insuficiente: " + this.getSaldo());
        return false;
     }
    }
    public void deposita(double quantidade) {
        this.saldo = this.saldo + quantidade;
       
    }
    
    public void transfere(Conta destino, double quantidade){
        if(this.saca(quantidade)){
            destino.deposita(quantidade);
            System.out.println("Trasferência ralizada com suceso");
      
        }else{
            System.out.println("trasferência não realizada");
        }
         //this.saldo = this.saldo -quantidade;
        // destino.saldo = destino.saldo + quantidade;   
    }

    public abstract void atualiza(double taxa);

}
