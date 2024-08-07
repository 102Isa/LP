/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

/**
 *
 * @author 16771606678
 */
public class Metodos {
    
    double n1,n2,resultado;//atributos ou variaveis de instância
    
    public void soma(){ //método sem retorno (void) e sem passagem de parâmetro
      this.resultado = this.n1+ this.n2;
    }
    
    public double soma2(){//metodo com retorno(double) e sem passagem de parametro
        return this.resultado = this.n1+ this.n2;
    }
    
     public double soma3(double n1, double n2){//metodo com retorno e passagem com parâmetros
        this.n1=n1;
        this.n2=n2;
        return this.resultado = this.n1+ this.n2;
    
     }

    String soma(double n1, double n2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}