package br.com.agenda.model.entity;

public class Contato {

    private int id;
    private String nome;
    private String fone;
    private String email;
    private String observacao;

    public Contato(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Contato() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }


    public String getEmail() {
        return email;
    }


    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}