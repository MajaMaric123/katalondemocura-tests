import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomersList extends BasePage {

    private By search = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input");
    private By searchNameResults = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[1]");
    private By accountNumber = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[4]/span");

    public CustomersList(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void inputCustomerNameInSearch(String addFirstName) {
        getDriver().findElement(search).sendKeys(addFirstName);
    }

    public boolean isCustomerExist() {
        return getDriver().findElement(searchNameResults).isDisplayed();
    }

    public boolean isAccountNumberExist() {
        return getDriver().findElement(accountNumber).isDisplayed();
    }
}