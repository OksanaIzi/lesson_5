package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.GitHubPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {
    GitHubPage gitHubPage = new GitHubPage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void testOpenGitHubRepository(){
        gitHubPage.openPage();
        gitHubPage.goToRepository();
        gitHubPage.checkData();
    }
}
