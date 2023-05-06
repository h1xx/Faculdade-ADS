programa
{
	
	funcao inicio()
	{
		real n1, n2, media

		escreva("Digite sua nota: ")
		leia(n1)
		escreva("Digite sua nota: ")
		leia(n2)

		media = (n1 + n2) / 2

		se(media == 10)
		{
				escreva("Aprovado com distinção")	
		}		
		senao
			se (media >= 7)
			{
				escreva("Aprovado")
			}
			senao
				se(media >=3 e media <7)
				{
					escreva("Exame")
				}
				senao
					se(media <3)
					{
						escreva("Reprovado")
					}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */