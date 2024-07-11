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
public class TesteFuncionario {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario(null, null, 0, null, null);

        f1.setNome("cleber");
        f1.setSalario(2500);

        f1.mostra();
    }
    
}
