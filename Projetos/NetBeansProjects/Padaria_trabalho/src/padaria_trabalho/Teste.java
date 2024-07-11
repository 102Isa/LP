/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria_trabalho;

import java.util.Scanner;

/**
 *
 * @author 16771606678
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Relatorio das vendas do dia, aparecendo o nome do cliente, funcionarios que efetuou e os dados da venda*/
    
        Scanner entrada = new Scanner(System.in);
        
         //criando objeto
         Cliente objCliente = new Cliente();
         Funcionarios objFuncionarios = new Funcionarios();
         Produto objProduto = new Produto();
         Estoque objEstoque = new Estoque();
         Venda objVenda = new Venda(objCliente, objFuncionarios, objProduto, objEstoque);
         Pedido objPedido = new Pedido();
         
         /*Entrando com as informações do cliente*/
         System.out.println("Insira o nome do cliente: ");
         String nomeCliente = entrada.next();
         objCliente.setNomeCliente(nomeCliente);
         System.out.println("Insira o CPF do cliente: ");
         String cpf = entrada.next();
         objCliente.setCpf(cpf);
         System.out.println("Insira o endereço do cliente: ");
         String endereco = entrada.next();
         
         //informações do funcinário
         System.out.println("Insira o nome do Funcionario: ");
         String nomeFuncionarios = entrada.next();
         objFuncionarios.setNomeFuncionario(nomeFuncionarios);
         System.out.println("Insira a data de adimição do funcionario: ");
         String data_adm = entrada.next();
         objFuncionarios.setData_adm(data_adm);
         System.out.println("insira o cargo do funcionario");
         String cargo = entrada.next();
         objFuncionarios.setCargo(cargo);
         
         
         //salario do funcionario que não é entrado pelo teclado
         objFuncionarios.setSalario(1500.98);
         
         //Informações do produto que não é entrada pelo teclado
         objProduto.setNomeProduto("Pão Francês");
         objProduto.setCod_produto("1234");
         objProduto.setPreco(1.00);
         objProduto.setQuant_produto(250);
         
         //Informação do Estoque
         objEstoque.setQuant_produto_disp(270);
         
         //Informações Venda
         System.out.println("_____________________________________");
         System.out.println("Insira Data que a Venda foi realizada: ");
         String data_venda = entrada.next();
         objVenda.setData_venda(data_venda);
         System.out.println("Insira a hora que a Venda foi realizada: ");
         String Hora_venda = entrada.next();
         objVenda.setHora_venda(Hora_venda);
         System.out.println("Insira os Produtos que foram vendidos: ");
         String itens_venda = entrada.next();
         objVenda.setItens_venda(itens_venda);
        
         //Informações Pedidos
         objPedido.setTotal(4);
         
         objVenda.mostra();
         
         
          
         
      
        
    }
    
}
