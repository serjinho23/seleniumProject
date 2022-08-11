import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.concurrent.TimeUnit;

public class FirstTest {

    @Test
    void check(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        By dropDown =  By.xpath("//button[@data-qa-value='Україна']");
        By searchCountry = By.xpath("//input[@placeholder='Пошук']");
        By chooseCountry = By.xpath("//button[@data-qa-node='phone-code-option']/span/div[@name='Україна']");
        By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        By amount = By.xpath("//input[@data-qa-node='amount']");
        By popularAmount = By.xpath("(//button[@data-qa-node='amount-hot-spot'])[3]");
        By myWallet = By.xpath("//div[@data-qa-node='debitSourceSource']");
        By card = By.xpath("//input[@data-qa-node='numberdebitSource']");
        By expireDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        By CVV = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        By terms = By.xpath("//a[@href='https://privatbank.ua/terms']");
        By submit = By.xpath("//button[@data-qa-node='submit']");

        driver.get("https://next.privat24.ua/mobile");
        driver.findElement(dropDown).click();
        driver.findElement(searchCountry).sendKeys("Ukraine");
        driver.findElement(chooseCountry).click();
        driver.findElement(phoneNumber).sendKeys("931485605");
        driver.findElement(amount).sendKeys(Keys.CONTROL+"A");
        //driver.findElement(amount).sendKeys("555");
        driver.findElement(popularAmount).click();
        driver.findElement(card).sendKeys("4004159115449003");
        driver.findElement(expireDate).sendKeys("1225");
        driver.findElement(CVV).sendKeys("772");
        driver.findElement(terms).click();
        driver.findElement(myWallet).click();
        driver.findElement(submit).submit();
    }
}
