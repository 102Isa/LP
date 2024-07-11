/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16771606678
 */
public class Livro {
    private String nome_livro,id,data_fabri;

    public String getData_fabri() {
        return data_fabri;
    }

    public void setData_fabri(String data_fabri) {
        this.data_fabri = data_fabri;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public Livro(String nome_livro, String id, String data_fabri) {
        this.nome_livro = nome_livro;
        this.id = id;
        this.data_fabri = data_fabri;
    }
    
    
    
}
