import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage extends BasePage {

    private By addCustomerFirstName = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input");
    private By addCustomerLastName = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input");
    private By addCustomerPostCode = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input");
    private By customerSubmitButton = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button");

    public AddCustomerPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public boolean isVisibleFirstNameField() {
        return getDriver().findElement(addCustomerFirstName).isDisplayed();
    }

    public void inputAddCustomerFirstName(String addFirstName) {
        getDriver().findElement(addCustomerFirstName).sendKeys(addFirstName);
    }

    public void inputAddCustomerLastName(String addLastName) {
        getDriver().findElement(addCustomerLastName).sendKeys(addLastName);
    }

    public void inputAddCustomerPostCode(String addPostCode) {
        getDriver().findElement(addCustomerPostCode).sendKeys(addPostCode);
    }

    public void clickCustomerSubmitButton() {
        getDriver().findElement(customerSubmitButton).click();
    }

}