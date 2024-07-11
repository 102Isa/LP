
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16771606678
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       
        Usuario objUsuario = new Usuario();
        Bibliotecario objBibliotecario = new Bibliotecario();
        Livro objLivro = new Livro("nome_livro", "id"," data_fabri");
        Emprestimo objEmprestimo = new Emprestimo();
        
        //usuario
        System.out.println("Digite o nome do usuario: ");
        String nome_usuario = entrada.next();
        objUsuario.setNome_usuario(nome_usuario);
        
        //Bibliotecario
        System.out.println("Digite o nome do Bibliotecario: ");
        String nome_bibli = entrada.next();
        objBibliotecario.setNome_bibli(nome_bibli);
        
        //Livro
        System.out.println("Digite o nome do livro: ");
        String nome_livro = entrada.next();
        objLivro.setNome_livro(nome_livro);
        System.out.println("Digite o código do livro: ");
        String id = entrada.next();
        objLivro.setId(id);
         System.out.println("Digite o data  de fabricaçaõ do  livro: ");
        String data_fabri = entrada.next();
        objLivro.setNome_livro(nome_livro);
        //Emprestimo
        System.out.println("Digite a data do emprestimo: ");
        String data_emprestimo = entrada.next();
        objEmprestimo.setData_emprestimo(data_emprestimo);
        System.out.println("Digite a data de vencimento: ");
        String data_vencimento = entrada.next();
        objEmprestimo.setData_vencimento(data_vencimento);
        System.out.println("Valor de multa por dia : ");
        String multa = entrada.next();
        objEmprestimo.setMulta(1.00);
     
   
        
        System.out.println("---------Biblioteca---------");
        System.out.println("Nome do Usuario: "+objUsuario.getNome_usuario());
        System.out.println("Nome do livro: "+objLivro.getNome_livro());
        System.out.println("Data do emprestimo: "+objEmprestimo.getData_emprestimo());
        System.out.println("Data de vencimento: "+objEmprestimo.getData_vencimento());
        System.out.println("Valor de multa pro dia de atrazo: "+objEmprestimo.getMulta());
        
    }
    
}
