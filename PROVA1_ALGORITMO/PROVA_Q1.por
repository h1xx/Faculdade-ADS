programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite sua idade: ")
		leia(idade)

		se (idade <= 10 )
		{
			escreva("Você deverá pagar R$30.00 de mensalidade")	
		}
		senao
			se (idade > 10 e idade < 30)
			{
				escreva("Você deverá pagar R$60.00 de mensalidade")		
			}
			senao
				se (idade > 29 e idade < 46)
				{
					escreva("Você deverá pagar R$120.00 de mensalidade")		
				}
				senao
					se (idade > 45 e idade < 60)
					{
						escreva("Você deverá pagar R$150.00 de mensalidade")		
					}
					senao
						escreva("Você deverá pagar R$300.00 de mensalidade")
	}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 605; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */