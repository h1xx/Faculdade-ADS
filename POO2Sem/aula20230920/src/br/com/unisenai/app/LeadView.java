package br.com.unisenai.app;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadView {
	private CadastroLeadController controller = new CadastroLeadController();
	private Scanner leitor;

	public LeadView(Scanner leitor) {
		this.leitor = leitor;
	}

	public void mostrarMenu() {
		int opcao = -1;
		System.out.println("MENU");
		while (opcao != 5) {
			System.out.println("1 - Cadastrar Lead");
			System.out.println("2 - Listar Leads");
			System.out.println("3 - Listar Leads por produto");
			System.out.println("4 - Listar Leads por nome");
			System.out.println("5 - Sair");
			opcao = Integer.parseInt(leitor.nextLine());
			tratarOpcao(opcao);
		}
	}

	public void tratarOpcao(int opcao) {
		switch (opcao) {
		case 1:
			cadastrarLead();
			break;
		case 2:
			listarTodos();
			break;
		case 3:
			listarPorProduto();
			break;
		case 4:
			listarPorNome();
			break;
		case 5:
			System.out.println("Obrigado, volte sempre");
			break;
		default:
			System.out.println("Opcao inválida");
			break;
		}
	}

	public void cadastrarLead() {
		System.out.println("#CADASTAR LEAD#");
		System.out.println("Digite o nome do lead");
		String nome = leitor.nextLine();
		System.out.println("Digite o Email do lead");
		String email = leitor.nextLine();
		System.out.println("Digite o telefone do lead");
		String telefone = leitor.nextLine();
		System.out.println("Digite o produto desejado");
		String produtoInteresse = leitor.nextLine();
		controller.cadastar(nome, email, telefone, produtoInteresse);
	}

	public void listarTodos() {
		System.out.println("#LISTA DE LEADS#");
		listar(controller.buscarTodos());
	}
	
	private void listar(ArrayList<Lead> leads) {
		for (Lead lead : leads) {
			StringBuilder builder = new StringBuilder();
			builder
			.append("Nome: ").append(lead.getNome()).append(" ")
			.append("Email: ").append(lead.getEmail()).append(" ")
			.append("Telefone: ").append(lead.getTelefone()).append(" ")
			.append("Produto de interesse: ").append(lead.getProdutoInteresse());
			System.out.println(builder.toString());
		}
	}
	

	public void listarPorProduto() {
		System.out.println("#LISTA DE LEADS POR PRODUTO#");
		System.out.println("Informe o nome do produto de interesse");
		String nomeProduto = leitor.nextLine();
		listar(controller.buscarPorProdutoInteresse(nomeProduto));
	}

	public void listarPorNome() {
		System.out.println("#LISTA DE LEADS POR NOME#");
		System.out.println("Informe o nome do Lead");
		String nomeLead= leitor.nextLine();
		listar(controller.buscarPorNome(nomeLead));
	}
}
