/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author 16771606678
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("cleber");
        p1.setIdade(40);

        p1.aniversario();

        p1.printALL();

        p1.aniversario();

        p1.printALL();
    }
}
    
