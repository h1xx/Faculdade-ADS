package br.senai.estruturadedadosAULA02;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] num = new int [10];
		int soma = 0;
		for (int i = 0; i <= 9; i++) {
			System.out.println("Escreva um número: ");
			num[i] = Integer.parseInt(input.nextLine());
			soma+=num[i];
		}
		System.out.println(soma);
		input.close();
	}
}
