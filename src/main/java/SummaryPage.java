import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummaryPage extends BasePage {

    private By facility = By.id("facility");
    private By hospitalReadmission = By.id("hospital_readmission");
    private By radio = By.id("program");
    private By visitDate = By.id("visit_date");
    private By comment = By.id("comment");

    public SummaryPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public String getFacilityText() {
        return getDriver().findElement(facility).getText();
    }

    public String getHospitalReadmissionText() {
        return getDriver().findElement(hospitalReadmission).getText();
    }

    public String getRadioText() {
        return getDriver().findElement(radio).getText();
    }

    public String getVisitDateText() {
        return getDriver().findElement(visitDate).getText();
    }

    public String getCommentText() {
        return getDriver().findElement(comment).getText();
    }
}
