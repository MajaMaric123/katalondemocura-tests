import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class AppointmentTest {
    private WebDriver driver;
    private WebDriverWait driverWait;
    private LoginPage loginPage;
    private AppointmentPage appointmentPage;
    private SummaryPage summaryPage;


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Petar\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        loginPage = new LoginPage(driver, driverWait);
        appointmentPage = new AppointmentPage(driver, driverWait);
        summaryPage = new SummaryPage(driver, driverWait);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
    }

    @Test(priority = 1)
    public void verifyMakeAppointmentClickFunctionality() {
        loginPage.clickMakeAppointmentButton();
        Assert.assertTrue(loginPage.isVisibleUserNameField());
    }

    @Test(priority = 2)
    public void verifyLoginFunctionality() {
        loginPage.login("John Doe", "ThisIsNotAPassword");
        loginPage.clickLoginButton();
        Assert.assertTrue(appointmentPage.isFormPresented());
    }

    @Test(priority = 3)
    public void verifyMakeAppointmentInputFormFunctionality() {
        appointmentPage.chooseSelectFacility("Hongkong CURA Healthcare Center");
        appointmentPage.selectApplyForHospitalReadmission();
        appointmentPage.chooseRadioSelect("None");
        appointmentPage.inputVisitDateInput("22/10/22");
        appointmentPage.inputCommentInput("I want full treatment.");
        appointmentPage.clickBookAppointmentButton();
        Assert.assertEquals(summaryPage.getFacilityText(), "Hongkong CURA Healthcare Center");
        Assert.assertEquals(summaryPage.getHospitalReadmissionText(), "Yes");
        Assert.assertEquals(summaryPage.getRadioText(), "None");
        Assert.assertEquals(summaryPage.getVisitDateText(), "22/10/22");
        Assert.assertEquals(summaryPage.getCommentText(), "I want full treatment.");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}