package com.josepuntriano.stepdefinitions;

import com.josepuntriano.questions.ElementoVisible;
import com.josepuntriano.questions.TituloDePagina;
import com.josepuntriano.targets.SeleniumDevTargets;
import com.josepuntriano.tasks.AbrirSeleniumDev;
import com.josepuntriano.tasks.NavegarADocumentation;
import com.josepuntriano.tasks.RealizarBusqueda;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class SeleniumDevSteps {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario abre la página de inicio de Selenium")
    public void elUsuarioAbreLaPaginaDeInicio() {
        OnStage.theActorCalled("Jose")
                .attemptsTo(AbrirSeleniumDev.enElNavegador());
    }

    @Then("el título de la página debe ser el esperado")
    public void elTituloDeLaPaginaDebeSerElEsperado() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TituloDePagina.actual(),
                        containsString("Selenium")));
    }

    @When("el usuario navega a la sección de Documentation")
    public void elUsuarioNavegarADocumentation() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(NavegarADocumentation.enElMenu());
    }

    @Then("la página de Documentation debe cargarse correctamente")
    public void laPaginaDeDocumentationDebeCargarse() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(ElementoVisible.en(
                                SeleniumDevTargets.TITULO_DOCUMENTATION),
                        is(true)));
    }

    @When("el usuario realiza una búsqueda con el término {string}")
    public void elUsuarioRealizaUnaBusqueda(String termino) {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(RealizarBusqueda.conElTermino(termino));
    }

    @Then("los resultados deben contener información relacionada a {string}")
    public void losResultadosDebenContener(String termino) {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(ElementoVisible.en(
                                SeleniumDevTargets.PRIMER_RESULTADO),
                        is(true)));
    }
}