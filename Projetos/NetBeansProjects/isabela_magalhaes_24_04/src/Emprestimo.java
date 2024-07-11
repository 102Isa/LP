/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16771606678
 */
public class Emprestimo {
    private String data_emprestimo, data_vencimento;
    private double multa;

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo+5;
    }

    public String getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }
    
    
    
}
