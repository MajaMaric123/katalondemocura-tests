import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenAccountPage extends BasePage {

    private By customer = By.id("userSelect");
    private By currency = By.id("currency");
    private By processButton = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button");


    public OpenAccountPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void chooseCustomer(int indexOf) {
        Select select = new Select(getDriver().findElement(customer));
        getDriver().findElement(customer).click();
        select.selectByIndex(indexOf);
    }

    public void chooseCurrency(String value) {
        Select select = new Select(getDriver().findElement(currency));
        getDriver().findElement(currency).click();
        select.selectByValue(value);
    }

    public void clickProcessButton() {
        getDriver().findElement(processButton).click();
    }
}