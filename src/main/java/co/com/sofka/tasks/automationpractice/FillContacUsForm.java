package co.com.sofka.tasks.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.*;


public class FillContacUsForm implements Task {

    private String email;
    private String order_reference;
    private String message;

    public FillContacUsForm withEmail(String email) {
        this.email = email;
        return this;
    }

    public FillContacUsForm andOrder_reference(String order_reference) {
        this.order_reference = order_reference;
        return this;
    }

    public FillContacUsForm andMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SUBJECT_HEADING),
                Click.on(SUBJECT_HEADING),
                Scroll.to(SUBJECT_HEADING_OPTION),
                Click.on(SUBJECT_HEADING_OPTION),
                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),
                Scroll.to(ORDER_REFERENCE),
                Enter.theValue(order_reference).into(ORDER_REFERENCE),
                Scroll.to(MESSAGE),
                Enter.theValue(message).into(MESSAGE),
                Scroll.to(BUTTON_SUTMITMESSAGE),
                Click.on(BUTTON_SUTMITMESSAGE)
        );
    }

    public static FillContacUsForm fillContacUsForm(){
        return new FillContacUsForm();
    }
}
