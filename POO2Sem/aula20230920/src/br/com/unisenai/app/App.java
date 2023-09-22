package br.com.unisenai.app;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		LeadView view = new LeadView(teclado);
		view.mostrarMenu();
		teclado.close();
	}
	
	

}
