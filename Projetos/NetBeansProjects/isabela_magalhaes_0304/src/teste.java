
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
public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Produto objProduto = new Produto();
        Cliente objCliente = new Cliente();
         Carinhos_de_compras objCarinhosdecompras = new Carinhos_de_compras();
         Pedido objPedido = new Pedido(objProduto, objCliente, objCarinhosdecompras);
      
        System.out.println("Digite o nome do Cliente: ");
       String nome = entrada.next();
       objCliente.setNome(nome);
   
        System.out.println("Digite o CPF do Cliente: ");
       String cpfCliente = entrada.next();
       objCliente.setCpfCliente(cpfCliente);
       
        System.out.println("Digite o cep do Cliente: ");
       String cepCliente = entrada.next();
       objCliente.setCepCliente(cepCliente);
       
        System.out.println("Digite o método de pagamento: ");
       String metPagamento= entrada.next();
       objCliente.setMetPagamento(metPagamento);
       
       //produto
     
     objProduto.setPrecProduto("42.88");
     objProduto.setId("29845");
     
        System.out.println("Digite o modelo: ");
        String modelo = entrada.next();
        objProduto.setModelo(modelo);
     
     objPedido.mostra();
             
      
    }
   
    
}
