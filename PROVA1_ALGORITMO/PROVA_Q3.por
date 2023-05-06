programa
{
	
	funcao inicio()
	{
		real VG, CT 
		caracter TC

		escreva("Qual o tipo de carro? (G - Gasolina | A - Àlcool)")
		leia(TC)

		se (TC == 'G')
		{
			escreva("Digite a capacidade do tanque: ")
			leia(CT)
			VG = 1.80 * CT
			escreva("Você gastará R$",VG,".")	
		}
		senao
			se (TC == 'A')
			{
				escreva("Digite a capacidade do tanque: ")
				leia(CT)
				VG = 1.00 * CT
				escreva("Você gastará R$",VG,".")	
			}
			senao
				escreva("Tipo de carro não encontrado!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 129; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {TC, 7, 11, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */