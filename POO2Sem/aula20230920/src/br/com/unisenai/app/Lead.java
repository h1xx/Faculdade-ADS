package br.com.unisenai.app;

public class Lead {
	private String nome;
	private String email;
	private String telefone;
	private String produtoInteresse;
	
	public Lead() {}
	
	public Lead(String nome, String email, String telefone, String produtoInteresse) {
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.produtoInteresse = produtoInteresse;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProdutoInteresse() {
		return produtoInteresse;
	}

	public void setProdutoInteresse(String produtoInteresse) {
		this.produtoInteresse = produtoInteresse;
	}
	
	

}
