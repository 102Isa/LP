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
public class Pessoa {

    private String nome;
    private int idade;

    public void aniversario(){
        this.idade = idade + 1;
        System.out.println(nome+" fez aniversario!!!");
    }

    public void printALL(){
        System.out.println("Agora "+nome+" tem "+idade+" anos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}

