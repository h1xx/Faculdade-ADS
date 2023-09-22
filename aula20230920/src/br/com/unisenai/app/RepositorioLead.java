package br.com.unisenai.app;

import java.util.ArrayList;

public class RepositorioLead {

	private static ArrayList<Lead> leads = new ArrayList<>();

	public void inserir(Lead lead) {
		leads.add(lead);
	}

	public ArrayList<Lead> listarTodos() {
		return leads;
	}

	public ArrayList<Lead> listarPorProduto(String produtoInteresse) {

		ArrayList<Lead> filtrados = new ArrayList<>();
		for (Lead lead : leads) {
			if (produtoInteresse.equalsIgnoreCase(lead.getProdutoInteresse())) {
				filtrados.add(lead);
			}
		}
		return filtrados;
	}

	public ArrayList<Lead> listarPorNome(String nomeLead) {

		ArrayList<Lead> filtrados = new ArrayList<>();
		for(Lead lead : leads) {
			if(lead.getNome().toLowerCase().startsWith(nomeLead.toLowerCase())) {
				filtrados.add(lead);
			}
		}
		return filtrados;
	}

}
