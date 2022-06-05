import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Account extends BasePage {

    private By transactions = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]");
    private By deposit = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]");
    private By withdrawl = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]");
    private By amountToBeDeposited = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input");
    private By depositButton = By.xpath("//button[text()='Deposit']");
    private By depositSuccessfulText = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/span");
    private By amountToBeWithdrawn = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input");
    private By withdrawButton = By.xpath("//button[text()='Withdraw']");
    private By transactionSuccessfulText = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/span");
    private By logoutCustomer = By.xpath("/html/body/div/div/div[1]/button[2]");

    public Account(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickDeposit() {
        getDriver().findElement(deposit).click();
    }

    public void chooseAmountToBeDeposited(int amount) {
        getDriver().findElement(amountToBeDeposited).sendKeys(String.valueOf(amount));
    }

    public void clickDepositButton() {
        getDriver().findElement(depositButton).click();
    }

    public boolean isVisibleDepositSuccessful() {
        return getDriver().findElement(depositSuccessfulText).isDisplayed();
    }

    public void clickWithdrawl() {
        getDriver().findElement(withdrawl).click();
    }

    public void chooseAmountToBeWithdrawn(int amount) {
        getDriver().findElement(amountToBeWithdrawn).sendKeys(String.valueOf(amount));
    }

    public void clickWithdrawButton() {
        getDriver().findElement(withdrawButton).click();
    }

    public boolean isVisibleTransactionSuccessful() {
        return getDriver().findElement(transactionSuccessfulText).isDisplayed();
    }

    public void clickLogoutCustomer() {
        getDriver().findElement(logoutCustomer).click();
    }

    public boolean isVisibleTransactionsButton() {
        return getDriver().findElement(transactions).isDisplayed();
    }

    public boolean isVisibleDepositButton() {
        return getDriver().findElement(depositButton).isDisplayed();
    }

    public boolean isVisibleWithdrawnButton() {
        return getDriver().findElement(withdrawButton).isDisplayed();
    }
}
