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
public class Professor extends Pessoa {
    private String nRegistro;
    private Disciplina objDisciplina;
    private Aluno objAluno;
   

    public Professor(String nome, String cpf, String data_nasci, String nRegistro) {
        super(nome, cpf, data_nasci);
        this.nRegistro = nRegistro;
    }
    
    @Override
     public void exibirdados (){
        System.out.println("---------Dados do Professor---------");
       super.exibirdados();
        System.out.println("N Registro"+this.nRegistro);

        }
     
     public void publicarNota(Disciplina objDisciplina, Aluno objAluno, double nota1, double nota2, double nota3){
         this.objAluno = objAluno;
         this.objDisciplina = objDisciplina;
         this.objDisciplina.setNota1(nota1);
         this.objDisciplina.setNota2(nota2);
         this.objDisciplina.setNota3(nota3);
     }
     
}
