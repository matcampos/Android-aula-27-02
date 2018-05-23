package br.com.fiap.retrofit;

/**
 * Created by logonrm on 22/05/2018.
 */

public class Contato {
    private String nome;
    private String telefone;
    private String status;
    private String imagem;

    @Override
    public String toString() {
        return "Contato: " + nome + " Telefone: " +
                telefone + " Status: " + status + " Imagem: "+ imagem;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Contato() {
    }

    public Contato(String nome, String telefone, String status, String imagem) {
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
        this.imagem = imagem;
    }
}
