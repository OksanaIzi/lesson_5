package tests;

import page.GitHubAnnotatedPage;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static data.Data.*;

public class GitHubAnnotatedTest {
    GitHubAnnotatedPage gitHubAnnotatedPage=new GitHubAnnotatedPage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    @Owner("OksanaIzi")
    @Feature("Open Repositories")
    @Story("Check Issues")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "BaseURL", url = "https://github.com/")
    void testOpenGitHubRepository(){
        gitHubAnnotatedPage.openPage(BASE_URL);
        gitHubAnnotatedPage.goToRepository(REPOSITORY);
        gitHubAnnotatedPage.checkData();
    }
}
