package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MailPage {

    private SelenideElement newMessageBtn = $(By.linkText("Написать письмо"));
    private SelenideElement exitLink = $(By.xpath("//a[contains(text(),'выход')]"));
    private SelenideElement letterSender = $(By.xpath("//div[contains(text(),'mailer-daemon@corp.mail.ru')]"));

    public void checkOpenMailPage() {
        newMessageBtn.shouldHave(text("Написать"));
    }

    public void openLetter() {
        letterSender.click();
    }

    public void logout() {
        exitLink.click();
    }
}
