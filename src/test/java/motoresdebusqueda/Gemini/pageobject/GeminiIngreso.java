package motoresdebusqueda.Gemini.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://processa6.ongemini.com/account/login")
public class GeminiIngreso extends PageObject {

    @FindBy(xpath = "//input[@id='Username']")
    WebElementFacade user;

    @FindBy(xpath = "//input[@id='regular-password']")
    WebElementFacade pass;

    @FindBy(xpath = "//input[@id='regular-signin']")
    WebElementFacade buttonLogin;

    public GeminiIngreso(WebDriver driver) {
        super(driver);
    }

    public void login() throws InterruptedException {
        //input("1022391801", (By) user);
        user.type("1022391801");
        //input("LiamAres0323.", (By) pass);
        pass.type("LiamAres0323.");
        buttonLogin.click();
        Thread.sleep(3000);
    }
}
