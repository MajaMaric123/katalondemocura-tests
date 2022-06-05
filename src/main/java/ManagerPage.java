import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerPage extends BasePage {

    private By addCustomerButton = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]");
    private By openAccountButton = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]");
    private By customersListButton = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]");
    private By homeButton = By.xpath("/html/body/div/div/div[1]/button[1]");
    private By logoutBankManager = By.xpath("/html/body/div/div/div[1]/button[2]");

    public ManagerPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public boolean isVisibleAddCustomerButton() {
        return getDriver().findElement(addCustomerButton).isDisplayed();
    }

    public void clickAddCustomerButton() {
        getDriver().findElement(addCustomerButton).click();
    }

    public void clickOpenAccountButton() {
        getDriver().findElement(openAccountButton).click();
    }

    public void clickCustomersListButton() {
        getDriver().findElement(customersListButton).click();
    }

    public void clickHomeButton() {
        getDriver().findElement(homeButton).click();
    }

    public void clickLogoutBankManager() {
        jsClick(getDriver().findElement(logoutBankManager));
    }
}
