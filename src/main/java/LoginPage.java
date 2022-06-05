import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private By customerLogin = By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button");
    private By bankManagerLogin = By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button");

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickCustomerLoginButton() {
        getDriver().findElement(customerLogin).click();
    }

    public void clickBankManagerLoginButton() {
        getDriver().findElement(bankManagerLogin).click();
    }

    public boolean isVisibleBankManagerLoginButton() {
        return getDriver().findElement(bankManagerLogin).isDisplayed();
    }
}
