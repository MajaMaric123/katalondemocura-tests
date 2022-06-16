import org.openqa.selenium.WebDriver;
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
}
