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
public class Aritmetica
        
{

    private double n1;
    private double n2;
    private double resultado;
    
    public double soma (double n1, double n2)
    
    {
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1+ this.n2;
    }
    
    public double subtracao (double n1, double n2)
    
    {
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 - this.n2;
    }
    
    
    public double divisao (double n1, double n2)
    
    {
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 / this.n2;
    }
    
    
    public double multiplicacao (double n1, double n2)
    
    {
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 * this.n2;
    }
    
    
     public double modulo (double n1, double n2)
    
    {
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 % this.n2;
    }
   
}
