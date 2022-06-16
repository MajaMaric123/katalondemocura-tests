import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class AppointmentPage extends BasePage {

    private By facilitySelect = By.id("combo_facility");
    private By applyForHospitalReadmission = By.id("chk_hospotal_readmission");
    private By radioSelect1 = By.xpath("//*[@name='programs'][@value='Medicare']");
    private By radioSelect2 = By.xpath("//*[@name='programs'][@value='Medicaid']");
    private By radioSelect3 = By.xpath("//*[@name='programs'][@value='None']");
    private By visitDateInput = By.id("txt_visit_date");
    private By commentInput = By.id("txt_comment");
    private By bookAppointmentButton = By.id("btn-book-appointment");

    public AppointmentPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public boolean isFormPresented() {
        List<WebElement> elements = getDriver().findElements(By.id("appointment"));
        if (elements.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void chooseSelectFacility(String value) {
        Select select = new Select(getDriver().findElement(facilitySelect));
        getDriver().findElement(facilitySelect).click();
        select.selectByValue(value);
    }

    public void selectApplyForHospitalReadmission() {
        getDriver().findElement(applyForHospitalReadmission).click();
    }

    public void chooseRadioSelect(String value) {
        if (value.equals("Medicare")) {
            getDriver().findElement(radioSelect1).click();
        } else if (value.equals("Medicaid")) {
            getDriver().findElement(radioSelect2).click();
        } else {
            getDriver().findElement(radioSelect3).click();
        }
    }

    public void inputVisitDateInput(String date) {
        getDriver().findElement(this.visitDateInput).sendKeys(date);
    }

    public void inputCommentInput(String comment) {
        getDriver().findElement(this.commentInput).sendKeys(comment);
    }

    public void clickBookAppointmentButton() {
        getDriver().findElement(bookAppointmentButton).click();
    }
}
