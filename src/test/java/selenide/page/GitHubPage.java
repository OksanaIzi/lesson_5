package selenide.page;

import com.sun.scenario.effect.impl.prism.PrImage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubPage {
    private final static String BASE_URL = "https://github.com/";
    private final static String REPOSITORY = "eroshenkoam/allure-example";

    public void openPage(){
        open(BASE_URL);
    }

    public void goToRepository(){
        $("[name=q]").setValue(REPOSITORY).pressEnter();
        $(By.linkText("eroshenkoam/allure-example")).click();
        $(withText("Issues")).click();
    }

    public void checkData(){
        $("#issue_68_link").shouldHave(text("Listeners NamedBy"));
    }
}
