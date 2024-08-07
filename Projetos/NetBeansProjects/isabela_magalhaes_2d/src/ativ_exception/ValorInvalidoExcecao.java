/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ_exception;

/**
 *
 * @author 16771606678
 */
public class ValorInvalidoExcecao extends Exception {
    ValorInvalidoExcecao(double valor){
        super("valor Invalido: "+valor);
    }

   
}
