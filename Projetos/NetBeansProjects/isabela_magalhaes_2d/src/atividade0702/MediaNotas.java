/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade0702;

import java.util.Scanner;

/**
 *
 * @author 16771606678
 */
public class MediaNotas {/*05: Escreva um programa em Java que calcula a média das notas de uma turma. O
programa deve solicitar ao usuário que insira o número de alunos e em seguida as notas de
cada aluno. Utilize um vetor para armazenar as notas e calcular a média.*/
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a qualtidade de alunos na turma: ");
        int numaluno = scanner.nextInt();
        
        double[] notas = new double[numaluno];
        double somanot = 0.0;
        
        for(int i = 0; i < numaluno; i++){
            System.out.println("Digite a nota do aluno:"+i + 1);
            notas[i] = scanner.nextDouble();
            somanot += notas[i];
        }
        double media = somanot / numaluno;
        System.out.println("A média das notas é: "+media);
       
        
    }
    
}
