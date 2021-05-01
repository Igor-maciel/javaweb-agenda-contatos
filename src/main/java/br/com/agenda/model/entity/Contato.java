package br.com.agenda.model.entity;

public class Contato {
	 private int id ;
	    private String nome;
	    private String fone;
	    private String email;
	    private String observacao;

	    public Contato(int id, String nome, String fone, String email, String observacao) {
	        this.id = id;
	        this.nome = nome;
	        this.fone = fone;
	        this.email = email;
	        this.observacao = observacao;
	    }

	    public Contato() {
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getFone() {
	        return fone;
	    }

	    public void setFone(String fone) {
	        this.fone = fone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getObservacao() {
	        return observacao;
	    }

	    public void setObservacao(String observacao) {
	        this.observacao = observacao;
	    }
}
