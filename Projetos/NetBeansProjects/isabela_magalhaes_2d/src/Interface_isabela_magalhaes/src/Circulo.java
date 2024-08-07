/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16771606678
 */
public class Circulo implements AreaCalculada{
    
    public double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return raio*raio*Math.PI;
    }
    
    
    
}
