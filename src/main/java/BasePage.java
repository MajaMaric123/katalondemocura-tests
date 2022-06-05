import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait driverWait;

    public BasePage(WebDriver driver, WebDriverWait driverWait) {
        this.driver = driver;
        this.driverWait = driverWait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public void setDriverWait(WebDriverWait driverWait) {
        this.driverWait = driverWait;
    }

    public void getAlertMessage() {
        String alertMessage = driver.switchTo().alert().getText();
    }

    public void skipAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("return arguments[0].click();", element);
    }
}