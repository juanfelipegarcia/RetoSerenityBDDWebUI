package co.com.sofka.questions.automationpractice;

import co.com.sofka.tasks.automationpractice.FillContacUsForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.MESSAGE_VALIDATION;

public class AutomationPractice implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return (MESSAGE_VALIDATION.resolveFor(actor).containsOnlyText("Your message has been successfully sent to our team."));
    }

    public static AutomationPractice automationPractice(){
        return new AutomationPractice();
    }
}
