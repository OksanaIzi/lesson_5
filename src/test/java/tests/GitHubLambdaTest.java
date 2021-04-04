package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Allure;
import page.GitHubLambdaPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static data.Data.*;

public class GitHubLambdaTest {


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
