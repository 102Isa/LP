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
public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX, dimencaoX, dimencaoz;

   

    public String getCor() {
        return cor;
    }

 

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimencaoX() {
        return dimencaoX;
    }

    public void setDimencaoX(double dimencaoX) {
        this.dimencaoX = dimencaoX;
    }

    public double getDimencaoz() {
        return dimencaoz;
    }

    public void setDimencaoz(double dimencaoz) {
        this.dimencaoz = dimencaoz;
    }
    
    
    public void abre(){
        this.aberta = true;
        
    }
    
    public void fecha(){
        this.aberta = false;
    }
    public void pinta (String cor ){
        this.cor = cor;
        
    }
    public boolean estaAberta(){
        return this.aberta;
    
    
    
}
}
