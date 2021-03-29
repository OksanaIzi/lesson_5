package lambdaTest.page;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GitHubLambdaPage {

    public void openPage(String BASE_URL){
        step("Открываем главную страницу", (step) ->{
            step.parameter("url", BASE_URL);
            open(BASE_URL);
        });
    }

    public void goToRepository(String REPOSITORY){
        step("Ищем репозиторий", (step) ->{
            step.parameter("repository", REPOSITORY);
            $("[name=q]").setValue(REPOSITORY).pressEnter();
        });
        step("Переходим в репозиторий", () ->{
            $(By.linkText("eroshenkoam/allure-example")).click();
        });
        step("Переходим в таб Issue", () ->{
            $(withText("Issues")).click();
        });
    }

    public void checkData(){
        step("Проверяем название репозитория", () -> {
            $("#issue_68_link").shouldHave(text("Listeners NamedBy"));
        });
    }
}
