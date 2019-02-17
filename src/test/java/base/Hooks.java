package base;


import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MailPage;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.fail;

public class Hooks {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();
    MailPage mailPage = new MailPage();


    @After(value = "@mail")
    public void setup() {
        System.out.println("This will run after the Scenario");
        mailPage.logout();
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    @Before
    public void clear() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}