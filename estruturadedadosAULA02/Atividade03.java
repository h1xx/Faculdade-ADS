package br.senai.estruturadedadosAULA02;

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] num = new int [10];
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("Escreva um número: ");
			num[i] = Integer.parseInt(input.nextLine());
		}
		for (int j = 0; j <= 9; j++) {
			if(num[j] % 2 == 0) {
				System.out.println(num[j]);
			}
			input.close();
		}
	}
}
