package testes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.Professor;

public class Professores {
	
	Professor professor1, professor2, professor3;
    
    /*Created by Gabriela on 03/11/2016*/
	
    @Given("^Eu tenho um conjunto de professores disponiveis$")
    public void eu_tenho_um_conjunto_de_professores_disponiveis() {
        professor1 = new Professor("Paulo", 1);
        professor2 = new Professor("Giraldeli", 2);
        professor3 = new Professor("Calhau", 3);
    }

    @When("^Eu alocar o professor$")
    public void eu_alocar_o_professor(){}
    
    @Then("^Aloque o professor")
    public void aloque_o_professor(){}

}
