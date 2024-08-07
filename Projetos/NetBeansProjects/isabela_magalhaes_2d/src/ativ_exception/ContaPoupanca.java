/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ_exception;

import banco.*;

/**
 *
 * @author 16771606678
 */
public class ContaPoupanca extends Conta{

    @Override
    public void deposita(double valor) {
         if(valor<0){
           throw new IllegalArgumentException("Você tentou depositar um valor negativo!");
       }else{
           this.saldo+= valor-0.10;
       }
     
    }
    
    
}
