/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author 16771606678
 */
public class Pessoa {
    private String nome, cpf, data_nasci;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasci() {
        return data_nasci;
    }

    public void setData_nasci(String data_nasci) {
        this.data_nasci = data_nasci;
    }
    
    public Pessoa(String nome, String cpf, String data_nasci) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasci = data_nasci;
    }

    public void exibirdados (){
        System.out.println("Nome:"+this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("Data de Nascimento"+this.getData_nasci());
        
    }
    
}
