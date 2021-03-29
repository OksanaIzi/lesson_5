package annotatedTests.page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubAnnotatedPage {

    @Step("Открываем главную страницу {BASE_URL}")
    public void openPage(String BASE_URL){
        open(BASE_URL);
    }

    @Step("Ищем и переходим в репозиторий {REPOSITORY}")
    public void goToRepository(String REPOSITORY){
        $("[name=q]").setValue(REPOSITORY).pressEnter();
        $(By.linkText("eroshenkoam/allure-example")).click();
        $(withText("Issues")).click();
    }

    @Step("Проверяем название Issue")
    public void checkData(){
        $("#issue_68_link").shouldHave(text("Listeners NamedBy"));
    }
}
