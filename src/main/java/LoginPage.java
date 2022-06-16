import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private By username = By.id("txt-username");
    private By password = By.id("txt-password");
    private By loginButton = By.id("btn-login");
    private By makeAppointmentButton = By.id("btn-make-appointment");

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void enterUsername(String username) {
        getDriver().findElement(this.username).sendKeys(username);
    }

    public void enterPassword(String password) {
        getDriver().findElement(this.password).sendKeys(password);
    }

    public void clickLoginButton() {
        getDriver().findElement(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
    }

    public boolean isVisibleUserNameField() {
        return getDriver().findElement(username).isDisplayed();
    }

    public void clickMakeAppointmentButton() {
        getDriver().findElement(makeAppointmentButton).click();
    }
}