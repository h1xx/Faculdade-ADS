programa
{
	
	funcao inicio()
	{
		inteiro HE, ME, HS, MS, HT, HA, PAG
		
		
		escreva("Hora de entrada: ")
		leia(HE)
		escreva("Minuto de entrada: ")
		leia(ME)
		escreva("Hora de saída: ")
		leia(HS)
		escreva("Minuto de saída: ")
		leia(MS)

		se (MS > 00)
		{
			HS = HS + 1 
		}
		
		HT = HS - HE
		
		se (HT == 1)
		{
			PAG = 4
			escreva("Você deverá pagar R$",PAG,".")
		}
		senao
			se (HT == 2)
			{
				PAG = 6
				escreva("Você deverá pagar R$",PAG,".")
			}
			senao
				se (HT > 2)
				{
				HA = HT - 2
				PAG = 6 + HA
				escreva("Você deverá pagar R$",PAG,".")
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 591; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */