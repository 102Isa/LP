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
public class Verificacaoidade {/*Atividade 01. Escreva um programa em Java que recebe a idade de uma pessoa como entrada
e verifica se ela é maior de idade ou não. Caso a idade seja maior ou igual a 18, o programa
deve exibir a mensagem &quot;Maior de Idade&quot;. Caso contrário, o programa deve exibir a
mensagem &quot;Menor de Idade&quot;*/
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            
         if (idade >= 18){
             System.out.println("Maior de idade.");
         }
         else {
             System.out.println("Menor de Idade.");
         }
         
        // TODO code application logic here
    }
    
}
    

