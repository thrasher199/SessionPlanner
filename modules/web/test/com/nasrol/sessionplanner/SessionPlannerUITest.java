package com.nasrol.sessionplanner;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.xpath;

public class SessionPlannerUITest {

    @Test
    public void loginTest() {
        open("http://localhost:8080/app");

        $(xpath("//*[@cuba-id='loginButton']")).shouldBe(Condition.visible).click();

        $(xpath("//*[@cuba-id='application-sessionplanner']")).shouldBe(Condition.visible).click();

        $(xpath("//*[@cuba-id='sessionplanner_Speaker.browse']")).shouldBe(Condition.visible).click();

        $(xpath("//*[@cuba-id='createBtn']")).shouldBe(Condition.visible).click();

        $(xpath("//*[@cuba-id='firstNameField']")).shouldBe(Condition.visible).setValue("Nasrollah");
        $(xpath("//*[@cuba-id='emailField']")).shouldBe(Condition.visible).setValue("nasrollah.abdkhair@gmail.com");

        $(xpath("//*[@cuba-id='windowCommitAndClose']")).shouldBe(Condition.visible).click();

        /*$(xpath("//*[@cuba-id='speakersTable']")).shouldBe(Condition.visible).click();

        $(xpath("//*[@cuba-id='removeBtn']")).shouldBe(Condition.visible).click();
        $(xpath("//*[@cuba-id='optionDialog_yes']")).shouldBe(Condition.visible).click();

        $(xpath("//*[@cuba-id='logoutButton']")).shouldBe(Condition.visible).click();*/

    }
}
