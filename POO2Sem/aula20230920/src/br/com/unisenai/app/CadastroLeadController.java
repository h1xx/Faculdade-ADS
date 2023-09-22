package br.com.unisenai.app;

import java.util.ArrayList;

public class CadastroLeadController {
	
	private RepositorioLead repositorio = new RepositorioLead();
	
	
	public void cadastar(String nome,
			 			 String email,
			 			 String telefone,
			 			 String produtoInteresse) {
		Lead lead = new Lead(nome, email, telefone, produtoInteresse);
		repositorio.inserir(lead);
	}
	
	public ArrayList<Lead> buscarTodos(){
		return repositorio.listarTodos();
	}
	
	public ArrayList<Lead> buscarPorProdutoInteresse(String produtoInteresse){
		return repositorio.listarPorProduto(produtoInteresse);
	}
	
	public ArrayList<Lead> buscarPorNome(String nomeLead){
		return repositorio.listarPorNome(nomeLead);
	}
	

}
