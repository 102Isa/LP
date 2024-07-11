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
public class VerificacaoNumeros {/*Escreva um programa em Java que recebe três números inteiros como entrada e
verifica qual deles é o maior. O programa deve exibir uma mensagem indicando o maior
número. Além disso, o programa deve verificar se os números são positivos, negativos ou
iguais a zero, exibindo a respectiva mensagem para cada número.
Instruções:
1. Crie uma classe Java chamada VerificacaoNumeros.
2. Dentro da classe, crie um método main para executar o programa.
3. Solicite ao usuário que insira três números inteiros como entrada.
4. Utilize a estrutura condicional if e else para comparar os números e determinar o maior.
5. Exiba uma mensagem indicando qual número é o maior.
6. Verifique se cada número é positivo, negativo ou igual a zero e exiba a respectiva mensagem
para cada número.
Exemplo de Saída:
Digite o primeiro número: 5
Digite o segundo número: -3
Digite o terceiro número: 8*/
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Insira um segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Insira um terceiro número: ");
        int num3 = scanner.nextInt();
        
        if ((num1 > num2) && (num1 > num3)){
          System.out.println("O primeiro número é o maior.");
    }
        if ((num2 > num1)&&(num2 > num3)){
            System.out.println("O segundo número é o maior.");
        }
        if ((num3 > num1)&&(num3 > num2)){
            System.out.println("O terceiro número é o maior");
        
        }
        
     if(num1 > 0) {
         System.out.println("O primeiro número é positivo.");
     } 
     
     else {
         System.out.println("O primeiro número é negativo.");
     }
         
     if(num2 > 0) {
         System.out.println("O segundo número é positivo.");
     } 
  
     else {
         System.out.println("O segundo número é negativo.");
     }
     
     
     if(num3 > 0) {
         System.out.println("O terceiro número é positivo.");
     } 
     else {
         System.out.println("O terceiro número é negativo.");
     }
     
     
    }
    
}
