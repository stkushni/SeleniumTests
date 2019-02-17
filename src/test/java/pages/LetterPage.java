package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LetterPage extends MailPage {

    private SelenideElement letterHeader = $(By.xpath("//div[@class='b-letter__head__subj__text']"));
    private SelenideElement letterContent =
            $(By.xpath("//div[@class='js-helper js-readmsg-msg']//div//div"));

    public void readLetter() {
        letterHeader.shouldHave(text("Ваше сообщение не доставлено. Mail failure."));
        letterContent.shouldHave(text("Это письмо создано автоматически сервером Mail.Ru, отвечать на него не нужно."));
    }
}
