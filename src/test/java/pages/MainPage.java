package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public MainPage open() {
        Selenide.open("https://mail.ru/");
        return this;
    }

    private SelenideElement txtUserName = $(By.id("mailbox:login"));
    private SelenideElement txtPasword = $(By.id("mailbox:password"));
    private SelenideElement btnSubmit = $(By.xpath("//input[@value= \"Войти\"]"));

    public void login(String userName, String password) {
        txtUserName.val(userName);
        txtPasword.val(password);
        clickOnSubmitButton();
    }

    public void clickOnSubmitButton() {
        btnSubmit.submit();
    }
}
