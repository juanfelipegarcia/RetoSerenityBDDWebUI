package co.com.sofka.runner.automationpractice;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/automationpractice/automationpractice.feature"},
        glue = {"co.com.sofka.stepdefinition.automationpractice"},
        tags = {"not @registro"}
)
public class AutomationPracticeTest {
}
