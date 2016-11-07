Feature: Valida salas


	Scenario: Uma sala esta alocada a duas disciplinas ao mesmo tempo
		Given Eu tenha um conjunto de salas em um periodo
		When Eu alocar a sala
		And houver conflito
		Then Enviar mensagem de erro de conflito de salas
    
    
	Scenario: Uma sala nao esta alocada a duas disciplinas ao mesmo tempo
		Given Eu tenha um conjunto de salas em um periodo
		When Eu alocar a sala
		And nao houver conflito
		Then Enviar mensagem de exito na alocacao

   