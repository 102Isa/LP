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
public class Aluno extends Pessoa {
    
    
    private String  nMatricula, senha;
    private Turma objTurma;

    public Turma getObjTurma() {
        return objTurma;
    }

    public String getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(String nMatricula) {
        this.nMatricula = nMatricula;
    }

    
    
     public Aluno(String nome, String cpf, String data_nasci, String nMatricula, Turma objTurma) {
        super(nome, cpf, data_nasci);
        this.nMatricula = nMatricula;
        this.objTurma = objTurma;
    }
    @Override
 public void exibirdados (){
        System.out.println("------------Dados Aluno----------");
        super.exibirdados();
        System.out.println("Matricula: "+this.nMatricula);
        System.out.println("Turma: "+this.objTurma.getNomeTurma());
       
        
    }

}

    
