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
public class VerificacaoNumerosPares {/*Escreva um programa em Java que verifica e exibe todos os números pares no
intervalo de 1 a 100. Utilize a estrutura de repetição for para iterar sobre os números e
verificar se cada um deles é par.*/
    
    public static void main(String[] args){
        
        int i = 0;
       for (i = 1; i <= 100; i++)
       {
        if(i % 2 == 0)
        {
            System.out.println(i);
        }
    }
        
    }
    
}
