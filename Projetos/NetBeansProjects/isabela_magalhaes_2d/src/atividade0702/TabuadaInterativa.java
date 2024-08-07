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
public class TabuadaInterativa {/*Escreva um programa em Java que solicita ao usuário que insira um número
inteiro. O programa deve então exibir a tabuada desse número até 10, utilizando a estrutura
de repetição while para realizar o cálculo.*/
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        int num = scanner.nextInt();
        
        int x = 1;
        while(x <=10)
        {
            int multi=num*x;
          System.out.println (num+" * "+x+" = " +multi);
            x++;
        }
    }
    
    
    
}
