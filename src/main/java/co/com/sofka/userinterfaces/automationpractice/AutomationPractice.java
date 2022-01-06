package co.com.sofka.userinterfaces.automationpractice;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class AutomationPractice extends PageObject {

    public static final Target CONTACT = Target
            .the("Contact us")
            .located(id("contact-link"));

    public static final Target SIGN = Target
            .the("Sign in")
            .located(className("header_user_info"));

    public static final Target SUBJECT_HEADING = Target
            .the("Subject Heading")
            .located(id("uniform-id_contact"));

    public static final Target SUBJECT_HEADING_OPTION = Target
            .the("Subject Heading option")
            .located(xpath("//*[@id=\"id_contact\"]/option[3]"));

    public static final Target EMAIL = Target
            .the("Email address")
            .located(id("email"));

    public static final Target ORDER_REFERENCE = Target
            .the("Order reference")
            .located(id("id_order"));

    public static final Target MESSAGE = Target
            .the("Message")
            .located(id("message"));

    public static final Target BUTTON_SUTMITMESSAGE = Target
            .the("Button sutmit message")
            .located(id("submitMessage"));


    //For validations

    public static final Target MESSAGE_VALIDATION = Target
            .the("Message comfirm send")
            .located(xpath("//*[@id=\"center_column\"]/p"));











}
