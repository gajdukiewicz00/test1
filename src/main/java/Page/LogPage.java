package Page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static Config.ConfigProvider.LOGIN;
import static Config.ConfigProvider.PASSWORD;


public class LogPage  {

    @FindBy(xpath = "//input[@id='username']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@id='login-signin']")
    private WebElement clickSingIn;



    public LogPage inputLOGIN() {
        inputLogin.sendKeys(LOGIN);
        return this;
    }

    public LogPage inputPassword(String password) {
        inputPassword.sendKeys(PASSWORD);
        return this;
    }

    public LogPage buttonSingIn() {
        clickSingIn.click();
        return this;
    }

}

