package LogPage;

import Drivers.BaseTest;

import Page.LogPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Config.ConfigProvider.PASSWORD;
import static Config.ConfigProvider.URL;

public class LogTest extends BaseTest {
    WebDriver driver;
    @Before
    public  void openPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

    }

      LogPage logPage =new LogPage();
    @Test
    public void testLogin() {
        logPage.inputLOGIN();
        logPage.inputPassword(PASSWORD);
        logPage.buttonSingIn();

    }
}
