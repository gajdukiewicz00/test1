package Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Config.ConfigProvider.URL;

public class BaseTest {


    WebDriver driver;
    @Before
    public  void openPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

    }


   @After
    public void finishTest() {
        driver.close();
        driver.quit();
    }
}

