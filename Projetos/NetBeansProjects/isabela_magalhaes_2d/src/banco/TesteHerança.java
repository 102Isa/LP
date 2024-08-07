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
public class TesteHerança {
    public static void main(String[] args) {
        Funcionario objFuncionario = new Gerente("Roberto", "Gerente", 4000, "24/05", "15896");
        Gerente objGerente = new Gerente("tulio", "Gerente", 4000, "24/05", "12345");
        Supervisor objSupervisor = new Supervisor("Livia", "supervisor", 2000, "24/05", "1234");
        
        objFuncionario.setSalario(1000);
        objGerente.setSalario(1000);
        objSupervisor.setSalario(1000);
        
        
        objFuncionario.setNome("Maria");
        objGerente.setNome("Sofia");
        objSupervisor.setNome("José");
        
        objGerente.mostra();
        objGerente.setSenha(123);
        objGerente.autentica(145);
        
        objSupervisor.mostra();
        objFuncionario.mostra();
    }
    
}
