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
public class AtualizadorDeContas extends Conta {
    Conta c = new ContaCorrente();
    private double saldoTotal = 0;
    private double selic;
     AtualizadorDeContas(double selic) {
    this.selic = selic;
}
    public void roda(Conta c){
        // aqui voce imprime o saldo anterior, 
        System.out.println("Saldo anterior: "+c.getSaldo());
        //atualiza a conta
        c.atualiza(this.selic);
        System.out.println("Saldo atualizado da conta: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    // e depois imprime o saldo final
        
// lembrando de somar o saldo final ao atributo saldoTotal
   
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal += c.getSaldo();
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    @Override
    public void atualiza(double taxa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
