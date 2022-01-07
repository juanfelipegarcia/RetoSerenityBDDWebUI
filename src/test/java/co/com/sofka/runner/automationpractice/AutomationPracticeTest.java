package co.com.sofka.runner.automationpractice;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/automationpractice/automationpracticecontactus.feature",
                "src/test/resources/features/automationpractice/automationpracticesignin.feature"},
        glue = {"co.com.sofka.stepdefinition.automationpractice"},
        tags = {"not @registro1",
                "not @contacto1",
                "not @contacto2"}
)
public class AutomationPracticeTest {
}
