/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author 16771606678
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        Medico objmedico = new Medico();
       Paciente objpaciente = new Paciente();
        Enfermeiro objenfermeiro = new Enfermeiro();
        
        System.out.println("Insira o nome do paciente: ");
        String nomePaciente = entrada.next();
        objpaciente.setNomePaciente(nomePaciente);
        
        System.out.println("Insira o nome do Medico: ");
        String nomeMedico = entrada.next();
        objmedico.setNomeMedico(nomeMedico);
        
        System.out.println("Insira o nome do Enfermeiro: ");
        String nomeEnfermeiro = entrada.next();
        objenfermeiro.setNomeEnfermeiro(nomeEnfermeiro);
        
        System.out.println("Digite o ID da internação: ");
        String id = entrada.next();
        
    
        System.out.println("Digite o Motivo da internação: ");
        String motivo = entrada.next();
        
        System.out.println("Digite o valor do dia da internação: ");
        double val_dia = entrada.nextDouble();
        
        System.out.println("Digite quantos dias de  internação: ");
        double qtd_dias = entrada.nextDouble();
        
        Internacao novainternacao = new Internacao(id, motivo, qtd_dias, val_dia, objmedico, objenfermeiro, objpaciente);
        
        novainternacao.mostra();
    }
    
}
