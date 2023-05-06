programa
{
	// Verificar a data de nascimento
	
    funcao inicio()
    {
        inteiro dia, mes, ano

        escreva("digite o dia: ")
        leia(dia)

        escreva("digite o mes: ")
        leia(mes)

        escreva("digite o ano: ")
        leia(ano)

        se (mes <= 0 ou mes > 12 ou ano <= 0) // verificador de mês
        {
        	escreva("Data inválida!")
        } 
        senao 
        {
        	inteiro ultimoDia
          se (mes == 2) // verificador de ultimo dia de fevereiro
          {
          	ultimoDia = 29
            } 
            senao se (mes == 1 ou mes == 3 ou mes == 5 ou mes == 7 ou mes == 8 ou mes == 10 ou mes == 12)  // verificador para caso o mês tiver 31 dias
            {
            	ultimoDia = 31
            } 
            senao 	// verificador para caso o mês tiver 30 dias
            {
             	ultimoDia = 30
            }
            se (dia <= 0 ou dia > ultimoDia)  // verificador de dia, caso o usuário digitar um número maior que o último, será invalidado.
            {
                escreva("Data inválida!")
            } 
            senao 
            {
                escreva("Data válida!")
            }
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1027; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */