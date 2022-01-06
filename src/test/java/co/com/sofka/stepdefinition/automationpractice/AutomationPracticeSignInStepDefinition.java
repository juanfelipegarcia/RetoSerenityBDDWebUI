package co.com.sofka.stepdefinition.automationpractice;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.automationpractice.BrowseSingIn.browseSingIn;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomationPracticeSignInStepDefinition extends Setup {

    private static final String ACTOR_NAME = "Alejandra";

    @Given("el Cliente está en la pagina de landingpage http:\\/\\/automationpractice.com\\/index.php")
    public void elClienteEstáEnLaPaginaDeLandingpageHttpAutomationpracticeComIndexPhp() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );
    }

    @When("El cliente ingresa la información necesaria para el registro en la pagina web de la compañia")
    public void elClienteIngresaLaInformaciónNecesariaParaElRegistroEnLaPaginaWebDeLaCompañia() {
        theActorInTheSpotlight().attemptsTo(
                browseSingIn()
        );
    }

    @Then("el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación con informacion minima")
    public void elClienteDeberáObservarElMensajeDeConfirmaciónDelRegistroExitosoEnLaAplicaciónConInformacionMinima() {

    }

    @When("El cliente ingresa la información completa para el registro en la pagina web de la compañia")
    public void elClienteIngresaLaInformaciónCompletaParaElRegistroEnLaPaginaWebDeLaCompañia() {
        theActorInTheSpotlight().attemptsTo(
                browseSingIn()
        );
    }

    @Then("el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación con informacion completa")
    public void elClienteDeberáObservarElMensajeDeConfirmaciónDelRegistroExitosoEnLaAplicaciónConInformacionCompleta() {

    }
}
