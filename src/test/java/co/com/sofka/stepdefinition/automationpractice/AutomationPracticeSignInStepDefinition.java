package co.com.sofka.stepdefinition.automationpractice;

import co.com.sofka.models.automationpractice.AutomationPracticeSignInModel;
import co.com.sofka.stepdefinition.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.util.Locale;

import static co.com.sofka.tasks.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.automationpractice.BrowseCreateAccount.browseCreateAccount;
import static co.com.sofka.tasks.automationpractice.BrowseSingIn.browseSingIn;
import static co.com.sofka.tasks.automationpractice.FillSignInMandatoryForm.fillSignInMandatoryForm;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomationPracticeSignInStepDefinition extends Setup {

    public static Logger LOGGER = Logger.getLogger(AutomationPracticeSignInStepDefinition.class);

    private AutomationPracticeSignInModel user1;
    private AutomationPracticeSignInModel user2;

    Faker usFaker = new Faker(new Locale("en-US"));

    private static final String ACTOR_NAME = "Alejandra";

    @Given("el Cliente está en la pagina de landingpage http:\\/\\/automationpractice.com\\/index.php")
    public void elClienteEstaEnLaPaginaDeLandingpageHttpAutomationpracticeComIndexPhp() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );
    }

    @When("El cliente ingresa la información necesaria para el registro en la pagina web de la compañia")
    public void elClienteIngresaLaInformacionNecesariaParaElRegistroEnLaPaginaWebDeLaCompannia() {
        genetareUserFillMandatory();
        theActorInTheSpotlight().attemptsTo(
                browseSingIn(),
                browseCreateAccount()
                        .withEmail(user1.getEmail()),
                fillSignInMandatoryForm()
                        .withName(user1.getName())
                        .andLastName(user1.getLastName())
        );
    }

    @Then("el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación con informacion minima")
    public void elClienteDeberaObservarElMensajeDeConfirmacionDelRegistroExitosoEnLaAplicacionConInformacionMinima() {

    }

    @When("El cliente ingresa la información completa para el registro en la pagina web de la compañia")
    public void elClienteIngresaLaInformacionCompletaParaElRegistroEnLaPaginaWebDeLaCompannia() {
        genetareUserFillMandatory();
        theActorInTheSpotlight().attemptsTo(
                browseSingIn()


        );
    }

    @Then("el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación con informacion completa")
    public void elClienteDeberaObservarElMensajeDeConfirmacionDelRegistroExitosoEnLaAplicacionConInformacionCompleta() {

    }

    private void genetareUserFillMandatory(){
        String name = usFaker.name().firstName();
        String lasName = usFaker.name().lastName();
        String email = name+lasName+"@gmail.com";
        String password = usFaker.bothify("########");
        String address = usFaker.address().streetAddress();
        String zip = usFaker.numerify("######");
        String mobilePhone = usFaker.numerify("##########");

        user1 = new AutomationPracticeSignInModel();
        user1.setName(name);
        user1.setLastName(lasName);
        user1.setEmail(email);
        user1.setPassword(password);
        user1.setAddress(address);
        user1.setCity("Orlando");
        user1.setZip(zip);
        user1.setMovilePhone(mobilePhone);

    }

    private void genetareClienteFillAll(){

    }


}
