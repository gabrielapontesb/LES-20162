 # language: en
  @TesteHorários

Feature: Valida slots de tempo

	Scenario: Um slot de tempo tem a hora final menor que a inicial
		Given Eu tenha um conjunto de slots de tempo
		When Eu criar um slot
		And houver inconsistencia de dados
		Then Enviar mensagem de erro na criacao


	Scenario: Um slot de tempo tem a hora final maior que a inicial
		Given Eu tenha um conjunto de slots de tempo
		When Eu criar um slot
		And nao houver inconsistencia de dados
		Then Enviar mensagem de exito na criacao
		
		
	Scenario: Um slot de tempo tem a hora final maior que a inicial
		Given Eu tenha um conjunto de slots de tempo
		When Eu criar um slot
		And nao houver inconsistencia de dados
		Then Enviar mensagem de exito na criacao
   