/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;

/**
 *
 * @author 16771606678
 */
public class teste {/**Crie uma classe com o nome Aritmetica com os métodos soma, subtracao, divisao,
    multiplicacao e modulo. Crie uma classe para teste com o método main e peça para o usuário dois números e mostre o resultado de todas operações
     * @param args.*/
    
    public static void main(String[] args) {
        
        Aritmetica x = new Aritmetica();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite n1:");
        double n1 = entrada.nextDouble();
        
        System.out.println("Digite n2:");
        double n2 = entrada.nextDouble();
        
        System.out.println("Resultado: "+x.soma(n1,n2));
        System.out.println("Resultado: "+x.subtracao(n1,n2));
        System.out.println("Resultado: "+x.divisao(n1,n2));
        System.out.println("Resultado: "+x.multiplicacao(n1,n2));
        System.out.println("Resultado: "+x.modulo(n1,n2));
                
      
    }

 
    }

