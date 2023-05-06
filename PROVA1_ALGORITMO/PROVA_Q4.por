programa
{
	
	funcao inicio()
	{
		inteiro CP
		real PE, PT
		
		escreva("Preço de etiqueta: R$")
		leia(PE)
		
		escreva("Condição de pagamento\n")
		escreva("1- À vista em dinheiro ou cheque (10% de desconto)\n")
		escreva("2- À vista com cartão de crédito (5% de desconto)\n")
		escreva("3- Parcelamento em 2 vezes\n")
		escreva("4- Parcelamento em 3 vezes (10% de juros)\n")
		leia(CP)

		se (CP == 1)
		{
			PT = PE * 0.9
			escreva("O valor do produto ficará R$",PT,".")
		}
		senao
			se (CP == 2)
			{
				PT = PE * 0.95
				escreva("O valor do produto ficará R$",PT,".")
			}
			senao
				se (CP == 3)
				{
					PT = PE * 1
					escreva("O valor do produto ficará R$",PT,".")
				}
				senao
					se (CP == 4)
					{
						PT = PE * 1.10
						escreva("O valor do produto ficará R$",PT,".")
					}
					senao
					escreva("Condição não encontrada")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 863; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */