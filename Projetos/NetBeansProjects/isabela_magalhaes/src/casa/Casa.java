/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author 16771606678
 */
public class Casa {
    private String cor;
    Porta porta1, porta2, porta3;
    
    public void pinta(String cor){
        this.cor =cor;
    }
    
    public int quantasPortasEstaoAbertas(){
        int cont=0;
        if(porta1.estaAberta()==true){
            cont = cont+1;
        }
         if(porta2.estaAberta()==true){
            cont = cont+1;
        }
         if(porta3.estaAberta()==true){
            cont = cont+1;
        }
         
        return cont;
    }
    
    
}
