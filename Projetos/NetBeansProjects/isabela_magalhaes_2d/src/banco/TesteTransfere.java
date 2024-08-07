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
public class TesteTransfere {
    public static void main(String[] args) {
        Conta minhaConta = new ContaCorrente();
        Conta outraConta = new ContaCorrente();
        minhaConta.deposita(1000);
        outraConta.deposita(1000);
        
        minhaConta.transfere(outraConta, 100);
        
        System.out.println("Saldo minhaconta: "+minhaConta.getSaldo());
        System.out.println("Saldo outraConta: "+outraConta.getSaldo());
    }
    
}
