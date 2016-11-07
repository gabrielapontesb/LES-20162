 # language: en
  @BDDTest

	Feature: Valida professor
 
  
	Scenario: Um professor nao esta alocado a duas disciplinas no mesmo horario
		Given Eu tenha um conjunto de professores em um periodo
		When Eu alocar o professor
		And nao houver conflito
		Then Enviar mensagem de exito na alocacao
		
	Scenario: Um professor esta alocado a duas disciplinas no mesmo horario
		Given Eu tenha um conjunto de professores em um periodo
		When Eu alocar o professor
		And houver conflito
		Then Enviar mensagem de erro de conflito
		
	Scenario: Um professor da aula em tres turnos
		Given Eu tenha um conjunto de professores em um periodo
		When Eu alocar o professor
		And estiver alocado em tres turnos
		Then Enviar mensagem de erro de alocacao
	
	Scenario: Um professor nao da aula em tres turnos	
		Given Eu tenha um conjunto de professores em um periodo
		When Eu alocar o professor
		And nao estiver alocado em tres turnos
		Then Enviar mensagem de exito na alocacao
		
	Scenario: Um professor da mais que vinte horas de aula semanais
		Given Eu tenha um conjunto de professores em um periodo
		When Eu alocar o professor
		And estiver alocado em mais de vinte horas semanais
		Then Enviar mensagem de erro de alocacao
	
	Scenario: Um professor da menos que vinte horas de aula semanais
		Given Eu tenha um conjunto de professores em um periodo
		When Eu alocar o professor
		And estiver alocado em menos de vinte horas semanais
		Then Enviar mensagem de exito de alocacao
	
	
	