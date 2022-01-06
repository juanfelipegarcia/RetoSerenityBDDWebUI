package co.com.sofka.stepdefinition.automationpractice;


import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.automationpractice.AutomationPractice.automationPractice;
import static co.com.sofka.tasks.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.automationpractice.BrowseSingIn.browseSingIn;
import static co.com.sofka.tasks.automationpractice.BrowseToContacUs.browseToContacUs;
import static co.com.sofka.tasks.automationpractice.FillContacUsForm.fillContacUsForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AutomationPracticeStepDefinition extends Setup {

    private static final String ACTOR_NAME = "Felipe";

    @Given("el Cliente está en la pagina de aterrizaje http:\\/\\/automationpractice.com\\/index.php")
    public void elClienteEstaEnLaPaginaDeAterrizajeHttpAutomationpracticeComIndexPhp() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );
    }

    @When("el cliente realizara el proceso para el contacto con la compañía")
    public void elClienteRealizaraElProcesoParaElContactoConLaCompannia() {
        theActorInTheSpotlight().attemptsTo(
                browseToContacUs(),
                fillContacUsForm()
                        .withEmail("jpipe@gmail.com")
                        .andOrder_reference("244552-G")
                        .andMessage("Estes en el mensaje del Contact Us")
        );
    }

    @Then("el cliente  deberá observar el mensaje de  confirmación del envío del mensaje")
    public void elClienteDeberaObservarElMensajeDeConfirmacionDelEnvioDelMensaje() {
        theActorInTheSpotlight().should(
                seeThat(
                        automationPractice(),equalTo(true)
                )
        );
    }

    @When("El cliente ingresa la información necesaria para el registro en la pagina web de la compañia")
    public void elClienteIngresaLaInformacionNecesariaParaElRegistroEnLaPaginaWebDeLaCompannia() {
        theActorInTheSpotlight().attemptsTo(
                browseSingIn()
        );
    }

    @Then("el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación")
    public void elClienteDeberaObservarElMensajeDeConfirmacionDelRegistroExitosoEnLaAplicacion() {

    }
}
