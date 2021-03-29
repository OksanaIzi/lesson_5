package lambdaTest.test;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Allure;
import lambdaTest.page.GitHubLambdaPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GitHubLambdaTest {

    private final static String BASE_URL = "https://github.com/";
    private final static String REPOSITORY = "eroshenkoam/allure-example";

    GitHubLambdaPage gitHubPage = new GitHubLambdaPage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void testOpenGitHubLambdaRepository(){
        Allure.parameter("Repository", REPOSITORY);
        gitHubPage.openPage(BASE_URL);
        gitHubPage.goToRepository(REPOSITORY);
        gitHubPage.checkData();
    }
}
