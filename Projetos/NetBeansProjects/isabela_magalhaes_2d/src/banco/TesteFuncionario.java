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
    public static void main(String[] args){
        
    
   Funcionario objFuncionario = new Gerente("tulio", "Gerente", 4000, "24/05", "12345");
        Funcionario objFuncionario2 = new Supervisor("Livia", "supervisor", 2000, "24/05", "1234");
       
      //  objFuncionario.setNome("João");
      // objFuncionario2.setNome("Maria");
       
       objFuncionario.setSalario(10000);
       objFuncionario.bonifica(1000);
       objFuncionario.demite();
       
       objFuncionario.mostra();
       objFuncionario2.mostra();
}
    
}
