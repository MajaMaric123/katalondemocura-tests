import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerPage extends BasePage {

    private By yourName = By.id("userSelect");
    private By login = By.xpath("/html/body/div/div/div[2]/div/form/button");

    public CustomerPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public boolean isVisibleYourNameField() {
        return getDriver().findElement(yourName).isDisplayed();
    }

    public void chooseYourName(int indexOf) {
        Select select = new Select(getDriver().findElement(yourName));
        getDriver().findElement(yourName).click();
        select.selectByIndex(indexOf);
    }

    public void clickLogin() {
        getDriver().findElement(login).click();
    }


}
