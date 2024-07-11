/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16771606678
 */
public class Pedido {
    
    private double val_total;
    private String status_entraga;
    
    Produto objProduto;
    Cliente objCliente;
    Carinhos_de_compras objCarinhosdecompras;

    public Pedido(Produto objProduto, Cliente objCliente, Carinhos_de_compras objCarinhosdecompras) {
        this.objProduto = objProduto;
        this.objCliente = objCliente;
        this.objCarinhosdecompras = objCarinhosdecompras;
    }
    
    

    public String getStatus_entraga() {
        return status_entraga;
    }

    public void setStatus_entraga(String status_entraga) {
        this.status_entraga = status_entraga;
    }

    public double getVal_total() {
        return val_total;
    }

    public void setVal_total(double val_total) {
        this.val_total = val_total;
    }
    
    public void mostra(){
        System.out.println("-------------Relatório--------------");
        System.out.println("Nome do cliente: "+objCliente.getNome());
        System.out.println("Produto: "+objProduto.getPrecProduto());
        System.out.println("Modelo do Produto: "+objProduto.getModelo());
       // System.out.println("Carrinho de compra: "+objCarinhosdecompras.camisetas());
        
    }
     
    
    
}
