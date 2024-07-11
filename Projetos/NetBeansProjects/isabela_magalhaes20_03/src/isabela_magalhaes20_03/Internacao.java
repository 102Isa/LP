/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author 16771606678
 */
public class Internacao {
    
    private String id,motivo;
    private double qtd_dias, val_dias,  val_tt;
    
    Medico objmedico;
    Enfermeiro objenfermeiro;
    Paciente  objpaciente;

    public Internacao(String id, String motivo, double qtd_dias, double val_dias, Medico objmedico, Enfermeiro objenfermeiro, Paciente objpaciente) {
        this.id = id;
        this.motivo = motivo;
        this.qtd_dias = qtd_dias;
        this.val_dias = val_dias;
        this.objmedico = objmedico;
        this.objenfermeiro = objenfermeiro;
        this.objpaciente = objpaciente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getQtd_dias() {
        return qtd_dias;
    }

    public void setQtd_dias(double qtd_dias) {
        this.qtd_dias = qtd_dias;
    }

    public double getVal_dias() {
        return val_dias;
    }

    public void setVal_dias(double val_dias) {
        this.val_dias = val_dias;
    }

    public double getVal_tt() {
        val_tt = qtd_dias * val_dias;
        return val_tt;
    }

    public void setVal_tt(double val_tt) {
        this.val_tt = val_tt;
    }

    public Medico getObjmedico() {
        return objmedico;
    }

    public void setObjmedico(Medico objmedico) {
        this.objmedico = objmedico;
    }

    public Enfermeiro getObjenfermeiro() {
        return objenfermeiro;
    }

    public void setObjenfermeiro(Enfermeiro objenfermeiro) {
        this.objenfermeiro = objenfermeiro;
    }

    public Paciente getObjpaciente() {
        return objpaciente;
    }

    public void setObjpaciente(Paciente objpaciente) {
        this.objpaciente = objpaciente;
    }
    
    public void mostra(){
        System.out.println("----------------Ficha de internação------------------");
        System.out.println("Nome do paciente: "+objpaciente.getNomePaciente());
        System.out.println("Nome do Médico: "+objmedico.getNomeMedico());
        System.out.println("Nome do Enfermeiro: "+objenfermeiro.getNomeEnfermeiro());
        System.out.println("ID da internação: "+this.getId());
        System.out.println("Motivo da internação: "+this.getMotivo());
        System.out.println("Valor diario da internação: "+this.getVal_dias());
        System.out.println("Quantos dias de internação: "+this.getQtd_dias());
        System.out.println("Valor total da internação: "+this.getVal_tt());
        
    }
    
    
    
}
