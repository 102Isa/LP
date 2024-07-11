/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria_trabalho;

/**
 *
 * @author 16771606678
 */
public class Venda {
   private String itens_venda,data_venda, hora_venda;
    Cliente objCliente;
    Funcionarios objFuncionarios; 
    Produto objProduto;
    Estoque objEstoque;

    public Venda(Cliente objCliente, Funcionarios objFuncionarios, Produto objProduto, Estoque objEstoque) {
        this.objCliente = objCliente;
        this.objFuncionarios = objFuncionarios;
        this.objProduto = objProduto;
        this.objEstoque = objEstoque;
    }
    
    
    public String getItens_venda() {
        return itens_venda;
    }

    public void setItens_venda(String itens_venda) {
        this.itens_venda = itens_venda;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getHora_venda() {
        return hora_venda;
    }

    public void setHora_venda(String hora_venda) {
        this.hora_venda = hora_venda;
    }
    
    public void mostra(){
        System.out.println("---------------RELATÓRIO DO DIA---------------");
        System.out.println("Cliente do dia: "+objCliente.getNomeCliente());
        System.out.println("Funcionario que efetuou a conta: "+objFuncionarios.getNomeFuncionario());
        System.out.println("Produtos Vendidos: "+objProduto.getQuant_produto());
      
       
    }
}
