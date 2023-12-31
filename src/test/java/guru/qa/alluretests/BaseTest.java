package guru.qa.alluretests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    public static final String REPOSITORY = "spring-projects/spring-boot";
    public static final int ISSUE = 37269;

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("Allure", new AllureSelenide());
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
