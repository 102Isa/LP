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
public class Teste_metodo3 {
    public static void main(String[] args) {
        Metodos x = new Metodos();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite n1:");
        double n1 = entrada.nextDouble();
        System.out.println("Digite n2:");
        double n2 = entrada.nextDouble();
        System.out.println("Resultado: "+x.soma3(n1,n2));
        
    }
    
}
