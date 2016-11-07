

/**
 * Created by gabriela on 05/11/15.
 */


import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.SnippetType;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty", snippets = SnippetType.CAMELCASE, features="src/test/resources", dryRun = true)
public class BDDTest {
	@Given("^Eu tenha um conjunto de professores em um periodo$")
	public void euTenhaUmConjuntoDeProfessoresEmUmPeriodo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^nao houver conflito$")
	public void naoHouverConflito() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Enviar mensagem de exito na alocacao$")
	public void enviarMensagemDeExitoNaAlocacao() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Enviar mensagem de erro de conflito$")
	public void enviarMensagemDeErroDeConflito() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^estiver alocado em tres turnos$")
	public void estiverAlocadoEmTresTurnos() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Enviar mensagem de erro de alocacao$")
	public void enviarMensagemDeErroDeAlocacao() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^nao estiver alocado em tres turnos$")
	public void naoEstiverAlocadoEmTresTurnos() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^estiver alocado em mais de vinte horas semanais$")
	public void estiverAlocadoEmMaisDeVinteHorasSemanais() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^estiver alocado em menos de vinte horas semanais$")
	public void estiverAlocadoEmMenosDeVinteHorasSemanais() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Enviar mensagem de exito de alocacao$")
	public void enviarMensagemDeExitoDeAlocacao() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Eu tenha um conjunto de salas em um periodo$")
	public void euTenhaUmConjuntoDeSalasEmUmPeriodo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Eu alocar a sala$")
	public void euAlocarASala() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Enviar mensagem de erro de conflito de salas$")
	public void enviarMensagemDeErroDeConflitoDeSalas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Eu tenha um conjunto de slots de tempo$")
	public void euTenhaUmConjuntoDeSlotsDeTempo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Eu criar um slot$")
	public void euCriarUmSlot() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^houver inconsistencia de dados$")
	public void houverInconsistenciaDeDados() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Enviar mensagem de erro na criacao$")
	public void enviarMensagemDeErroNaCriacao() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^nao houver inconsistencia de dados$")
	public void naoHouverInconsistenciaDeDados() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Enviar mensagem de exito na criacao$")
	public void enviarMensagemDeExitoNaCriacao() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
