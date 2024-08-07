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
public class Supervisor extends Funcionario{

    public Supervisor(String nome, String departamento, double salario, String dataEntrada, String rg) {
        super(nome, departamento, salario, dataEntrada, rg);
    }

    
    @Override
    public double getBonificacao(){
        return super.getSalario() + 700;
        
    }
    
    
    
}
