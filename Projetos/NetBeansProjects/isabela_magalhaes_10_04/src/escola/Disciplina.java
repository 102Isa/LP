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
public class Disciplina {
    private String nome_disciplina;
    private int idDisciplina;
    private double nota1, nota2, nota3, media;
    private Aluno objAluno;
    private Professor objProfessor;

    public Disciplina(String nome_disciplina, Aluno objAluno, Professor objProfessor) {
        this.nome_disciplina = nome_disciplina;
        this.objAluno = objAluno;
        this.objProfessor = objProfessor;
    }

    
    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        media= (nota1+nota2+nota3)/3;
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }
    

    public void relatorioAlunoDisciplina(){
        System.out.println("Aluno: "+this.objAluno.getNome()+ "Turma: "+this.objAluno.getObjTurma().getNomeTurma());
        System.out.println("Disciplina: "+this.getNome_disciplina()+ "Professo: "+this.objProfessor.getNome());
        System.out.println("Nota1: "+this.getNota1()+"Nota2: "+this.getNota2()+"Nota3: "+this.getNota3());
        if(this.getMedia()<6){
            System.out.println("Aluno Reprovado!");
        }else{
            System.out.println("Aluno Aprovado! ");
        }
        System.out.println("Com média: "+this.getMedia());
    }

            }
    

