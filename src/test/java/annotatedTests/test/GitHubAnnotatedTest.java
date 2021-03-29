package annotatedTests.test;

import annotatedTests.page.GitHubAnnotatedPage;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GitHubAnnotatedTest {
    private final static String BASE_URL = "https://github.com/";
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    GitHubAnnotatedPage gitHubAnnotatedPage = new GitHubAnnotatedPage();

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
