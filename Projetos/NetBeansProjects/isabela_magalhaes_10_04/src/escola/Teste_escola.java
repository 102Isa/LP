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
public class Teste_escola {
    
    public static void main(String[] args) {
        Turma objTurmaD = new Turma("D");
        Aluno objAlunoPedro = new Aluno("Pedro", "11234", "12/05/26", "12345", objTurmaD);
        Professor objProfTulio = new Professor("Tulio", "1235", "16/05/19", "45678");
        Professor objProfJoao = new Professor("Joao", "456", "16/05/19", "4852");
        Disciplina objDiscProgramacao = new Disciplina("Programação", objAlunoPedro, objProfJoao);
        Disciplina objDiscPortugues = new Disciplina("Português", objAlunoPedro, objProfJoao);
        objProfJoao.publicarNota(objDiscPortugues, objAlunoPedro, 10, 5, 7);
        objProfTulio.publicarNota(objDiscPortugues, objAlunoPedro, 7, 2, 5);
        objAlunoPedro.exibirdados();
        objDiscPortugues.relatorioAlunoDisciplina();
        objDiscProgramacao.relatorioAlunoDisciplina();
         
    }
            
    
}
